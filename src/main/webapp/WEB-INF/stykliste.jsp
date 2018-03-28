<%-- 
    Document   : stykliste
    Created on : 27-03-2018, 22:46:08
    Author     : Tiba
--%>

<%@page import="FunctionLayer.BricksPackage"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <% BricksPackage packageds = (BricksPackage) session.getAttribute("ordersStyk");
           out.print(packageds.toString());
               
        %>
        
    </body>
</html>
