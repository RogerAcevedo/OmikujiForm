<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> -->
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<h2>Send an Omikuji!</h2>
		<hr>
		<form action="/omikuji/show" method="POST">
			<h3 class="form-group">Pick any number from 5 to 25:
				<input type= "number" name="number" id="" class="form-control" />
			</h3>
			<h3 class="form-group">Enter the name of any city:
				<input type="text" name="city" id="" class="form-control" />
			</h3>	
			<h3 class="form-group">Enter the name of any real person:
				<input type="text" name="person" id="" class="form-control" />
			</h3>
			<h3 class="form-group">Enter professional endeavor or hobby:
				<input type="text" name="hobby" id="" class="form-control" />
			</h3>		
			<h3 class="form-group">Enter any type of living thing:
				<input type="text" name="thing" id="" class="form-control" />
			</h3>
			<h3 class="form-group">Say Something nice to someone:
				<input type="text" name="saynice" id="" class="form-control" />
			</h3>	
			<h4>Dive into nothingness</h4>	
			<hr>		
			<button class="button-btn-primary">Test Your Luck </button>
			<a href="http://localhost:8080/omikuji/show">Omikuji "Submit"</a>	
			
			
			<!-- TEST!! -->
			<div class="test">
			<h4>Results:</h4>
			<h1><c:out value="${ number}"></c:out></h1>	
			<h1><c:out value="${ city }"></c:out></h1>	
			<h1><c:out value="${ person }"></c:out></h1>	
			<h1><c:out value="${ hobby }"></c:out></h1>	
			<h1><c:out value="${ thing }"></c:out></h1>	
			<h1><c:out value="${ saynice }"></c:out></h1>	
			</div>
				
		</form>
	</div>
</body>
</html>