<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
</head>
<body>

	<h1>Bienvenue ${ param.prenom }</h1>

	<p>${ message }</p>
	
	<br />
	
	<form action="validerformulaire" method="POST">
		<label for="nom">Nom :</label>
		<input id="nom" type="text" name="nom"/><br/>
		<label for="prenom">Prenom :</label>
		<input id="prenom" type="text" name="prenom"/><br/>
		<input type="submit" value="envoyer"/>
	</form>
	
	<form:form action="validerformulairespringMVC" method="POST" modelAttribute="personne">
		<form:label path="nom">Nom :</form:label>
		<form:input path="nom"/><br/>
		<form:label path="prenom">Prenom :</form:label>
		<form:input path="prenom"/><br/>
		<form:label path="adresse.libelleVoie">libelleVoie :</form:label>
		<form:input path="adresse.libelleVoie"/><br/>
		<form:label path="adresse.numeroRue">numeroRue :</form:label>
		<form:input path="adresse.numeroRue"/><br/>
 
		<form:button>Envoyer</form:button>
	</form:form>

</body>
</html>