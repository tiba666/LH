/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.BricksCalculator;
import FunctionLayer.BricksPackage;
import FunctionLayer.HouseDimensions;

import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Tiba
 */
public class OrderMapper {

    public static void createOrdder(HouseDimensions houseDimensions, User user) throws OrderExcetion {
        try {

            Connection con = Connector.connection();
            String sql = "INSERT INTO orders (userId, height, width, length) VALUES (?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, user.getId());
            ps.setInt(2, houseDimensions.getHigh());
            ps.setInt(3, houseDimensions.getWidth());
            ps.setInt(4, houseDimensions.getLength());

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex){
            throw new OrderExcetion(ex.getMessage());
        }
    }

    public static void sendOrder(HouseDimensions ordernr) throws OrderExcetion {
        try {
            Connection con = Connector.connection();
            String sql = "UPDATE orders SET sendt =1 WHERE OrderId =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ordernr.getOrderid());

//            BricksCalculator cal = new BricksCalculator();
//            BricksPackage packaged = cal.calculateBricks(ordernr);
//            
//            String sqlPackages = "INSERT INTO orderdetails (";

        } catch (SQLException | ClassNotFoundException ex){
            throw new OrderExcetion(ex.getMessage());
        }

    }


}
