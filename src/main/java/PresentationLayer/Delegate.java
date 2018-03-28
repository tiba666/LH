/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderExcetion;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tiba
 */
public class Delegate extends Command {

    public Delegate() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderExcetion {
        String input = request.getParameter("pagesfinder");
        switch(input){
            case "order":
                return "order";
            case "showorders":
                return "showorders";
            default:
                return null;
        }
        
    }
    
}
