<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

</head>
<body>
<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Home Page</div>
        <div class="panel-body">
           Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your
           todo's.
        </div>
     </div>
 </div>
<%@ include file="common/footer.jsp"%>
</body>
</html>