

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**11111
 * Servlet Filter implementation class MyFAFilter
 */
@WebFilter(filterName = "MyFAFilter", urlPatterns = {"/fb/*"})
//filterName名為MyFAFilter，在遇到urlPatterns叫做FAServlet的檔案時就會開始進行doFilter()
public class MyFAFilter  implements Filter {
       
	private FilterConfig filterConfig = null;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Pre-Process Start");
		System.out.println("Pre-Process==>" + filterConfig.getFilterName());
		long start = System.currentTimeMillis();
		chain.doFilter(request, response);
		long end = System.currentTimeMillis();
		System.out.println("執行時間:" + (end - start) + "ms");
		System.out.println("Post-Process==>" + filterConfig.getFilterName());
		System.out.println("=====================================");

	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;

	}

	@Override
	public String toString() {
		if (filterConfig == null) {
			return ("FilterA()");
		}
		StringBuffer sb = new StringBuffer("FilterA(");
		sb.append(filterConfig);
		sb.append(")");
		return (sb.toString());
	}

	public void log(String msg) {
		filterConfig.getServletContext().log(msg);
	}

}
