/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.HouseDimensions;
import FunctionLayer.User;
import java.sql.Connection;

/**
 *
 * @author Tiba
 */
public class OrderMapper {
    
    public static void createOrdder(HouseDimensions houseDimensions, User user) throws OrderExcetion{
        try {
            
            Connection con = Connector.connection();
            String sql = "";
            
            
            
        } catch (Exception e) {
            throw new OrderExcetion(e.getMessage());
        }
    }
}
