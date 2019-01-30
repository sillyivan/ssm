<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%

    String path = request.getContextPath();

    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>


<html>
<head>
    <link href="<%=basePath%>css/site.css" rel="stylesheet"  type="text/css">
</head>

<body>
<h2>Hello World!</h2>

<div  class="bc">sdf </div>
</body>
</html>
