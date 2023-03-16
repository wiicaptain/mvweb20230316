<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://mytag.com/jsp/tlds/mytags" prefix="mytags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Number Formatting Example</h2>
 
<mytags:formatNumber number="100050.574" format="#,###.00"/><br><br>
 
<mytags:formatNumber number="1234.567" format="$#,###.00"/><br><br>

</body>
</html>