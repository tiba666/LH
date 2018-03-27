/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderExcetion;
import FunctionLayer.HouseDimensions;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tiba
 */
public class Order extends Command {
    
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderExcetion {
        int height = Integer.parseInt(request.getParameter("height"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        HouseDimensions dimensions = LogicFacade.createHouse(height, width, length);
       
        LogicFacade.createOrder(dimensions, user);
         return "orderconfirmation"; 

    }

}
