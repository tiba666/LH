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
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tiba
 */
public class Stykliste extends Command {

    public Stykliste() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderExcetion {
        HttpSession session = request.getSession();
      
        
        List<HouseDimensions> hs = (List) session.getAttribute("showOrders");
        for (HouseDimensions h : hs) {
            if(h.getOrderid()== (int) session.getAttribute("chose")){
               session.setAttribute("ordersStyk", LogicFacade.getTotalBricks(h));
            }
            
        }
        
        return "stykliste";
    }
    
}
