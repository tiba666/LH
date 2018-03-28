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
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tiba
 */
public class ShowOrders extends Command {

    public ShowOrders() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderExcetion {
      HttpSession session = request.getSession();
      User user = (User) request.getSession().getAttribute("user");
      List<HouseDimensions> orders = LogicFacade.showUserOrders(user.getId());
      session.setAttribute("showOrders", orders);
      
     return "showorders";
        
    }
    
}
