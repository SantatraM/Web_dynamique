<%@page import="modele.Emp" %>
<%
    Emp emp = (Emp) request.getAttribute("employe");
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>Employe sauvegarde</h1>
    <p>Id: <% out.print(emp.getId()); %></p>
    <p>Nom: <% out.print(emp.getNom()); %></p>
</body>

</html>