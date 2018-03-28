<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site..
        
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="Delegate">
            
            <input type="hidden" name="pagesfinder" value="orders">
            <input type="submit" name="submit">
        </form>
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="showOrders">
            <input type="submit" name="submit">
        </form>
        
        
        
    </body>
</html>
