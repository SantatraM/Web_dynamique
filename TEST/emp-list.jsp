<%@page import="java.util.*"%>
<%@page import="modele.Emp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>bienvenue dans Emp</h1>
    <% List<Emp> liste = (List<Emp>) request.getAttribute("lst");
    for(int i=0;i < liste.size();i++) { %>
        <p>ID: <% out.println(liste.get(i).getId()); %></p>
        <p>NOM: <% out.println(liste.get(i).getNom()); %></p>
    <% } %>
</body>

</html>