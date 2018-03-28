<%-- 
    Document   : showorders
    Created on : 27-03-2018, 21:32:48
    Author     : Tiba
--%>

<%@page import="FunctionLayer.BricksCalculator"%>
<%@page import="java.util.List"%>
<%@page import="FunctionLayer.HouseDimensions"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    
    
        
        <% List<HouseDimensions> orders = (List) session.getAttribute("showOrders");
            for (HouseDimensions order : orders) {  %>  
         
            <form action="FrontController" method="post">
          
            <input type="hidden" name="command" value="stykListe">
            <input type="number" name="chose" value="<%order.getOrderid();%>">
            <input type="submit" name="submit" value="<%out.print("order id : " + order.getOrderid());%>">
            </form>
            
            
            <%         
                }
            %>         
            
        
        
        
    
</html>
