<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <a class="navbar-brand" href="#">Customer management</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav">
		      <li class="nav-item active">
		        <a class="nav-link" href="inseart.html">Customer_add<span class="sr-only">(current)</span></a>
		      </li> 
		      <li class="nav-item">
		        <a class="nav-link" href="<%=request.getContextPath()%>/customer?action=listUser">ALL customer</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">customer_search</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="update.html">customer_update</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link " href="delete.html">customer_delete</a>
		      </li>
		    </ul>
		  </div>
	</nav>		


</body>
</html>