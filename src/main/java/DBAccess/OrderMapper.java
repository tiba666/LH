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
import com.mysql.cj.api.x.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiba
 */
public class OrderMapper {

    public static void createOrder(HouseDimensions houseDimensions, User user) throws OrderExcetion {
        try {

            Connection con = Connector.connection();
            String sql = "INSERT INTO orders (User_userId, hight, width, length) VALUES (?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, user.getId());
            ps.setInt(2, houseDimensions.getHigh());
            ps.setInt(3, houseDimensions.getWidth());
            ps.setInt(4, houseDimensions.getLength());

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderExcetion(ex.getMessage());
        }
    }

    public static List<HouseDimensions> getOrders(int userid) {
        List<HouseDimensions> list = new ArrayList();
        try {
            Connection con = Connector.connection();
            String sql = "SELECT * FROM orders WHERE User_userId=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HouseDimensions hd = new HouseDimensions(rs.getInt("hight"), rs.getInt("width"), rs.getInt("length"));
                hd.setOrderid(rs.getInt("OrderId"));
                list.add(hd);

            }
            return list;

        } catch (Exception e) {
        }
        return list;
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
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderExcetion(ex.getMessage());
        }

    }

    public static ArrayList<HouseDimensions> comfirmOrder(User user) {
        if (user.getRole().equals("employee")) {
            try {

            } catch (Exception e) {
            }

        }
        return null;
    }
}
