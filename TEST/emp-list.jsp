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
    <table border="1">
        <tr>
            <th>ID</th>
            <th>NOM</th>
        </tr>
        
        <% List<Emp> liste = (List<Emp>) request.getAttribute("lst");
        for(int i=0;i< liste.size();i++) { %>
            <tr>
                <td><% out.println(liste.get(i).getId()); %></td>
                <td><% out.println(liste.get(i).getNom()); %></td>
            </tr>
        <% } %>
        
    </table>
</body>

</html>