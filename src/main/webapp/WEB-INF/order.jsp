<%-- 
    Document   : order
    Created on : 27-03-2018, 20:42:51
    Author     : Tiba
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="FrontController" method="post" >
            <input type="hidden" name="command" value="createOrder">
            <input type="number" name="height" min="4" value="">heigth
            <input type="number" name="length" min="10" value="">length
            <input type="number" name="width" min="10" value="">width
            <input type="submit" value="submit">
        </form>
    </body>
</html>
