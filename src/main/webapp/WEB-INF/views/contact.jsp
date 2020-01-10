<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/envoi">
		<div>
			<label for="nom">Nom : </label> <input type="text" name="nom"
				id="nom" />
		</div>
		<br>
		<div>
			<label for="email">Email : </label> <input type="email" name="email"
				id="email" />
		</div>
		<br>
		<div>
			<label for="message">Message : </label>
			<textarea name="message" id="message"></textarea>
		</div>
		<div>
			<input type="submit" />
		</div>
	</form>
</body>
</html>