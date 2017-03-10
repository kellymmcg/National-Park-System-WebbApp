<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/npgeek.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to National Park Geek!</title>

<body>
<div class = "bgheader">
	<div class="header">
    	<c:url value="/" var="homePageHref" />
    	<c:url value="/img/logo.png" var="logoImage"/>
        		<img src="${logoImage}" alt="National Park Geek logo"  height="25%" width="25%" />
        	<div class="nav">
       
        	&nbsp &nbsp &nbsp<a href="${homePageHref}">Home</a> &nbsp &nbsp &nbsp &nbsp
        	<a href="surveyInputPage"> 
        	Take Our Daily Survey!</a> 
       	</div>
	</div>
</div>

<div class = "main">
