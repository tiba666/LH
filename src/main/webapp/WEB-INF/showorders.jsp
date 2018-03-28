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
            for(int i = 0 ; i < orders.size() ; i++){  
     
            }
        %>
            <form action="FrontController" method="get">
                <input type="number" name="order" value=<%""%>
            </form>
                  
             <%
                out.print(orders.get(i).toString() + "<br />");
                
            }
            %>         
            
        
        
        
    
</html>
