<%@ page import ="java.util.*" %>

<html>
<head>
    <title>Frames</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor="black" text="#54ff05">
<center>
<h2>Weapons:</h2>

<%
    List list = (List)request.getAttribute("Weapons");

    for(Object o : list)
    {
        out.println(o + "<br>");
    }
%>

<br>
<a href="/">Back to main</a>
</center>
</body>
</html>
