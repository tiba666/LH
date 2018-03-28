package FunctionLayer;

import DBAccess.OrderExcetion;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static void createOrder(HouseDimensions dimensions, User user)throws OrderExcetion{
        OrderMapper.createOrder(dimensions, user);
    }
    public static HouseDimensions createHouse(int height, int width, int length){
        return new HouseDimensions(length, width, height);
    }
    public static List<HouseDimensions> showUserOrders(int userId){
          
        return OrderMapper.getOrders(userId);
        
    }
    public static BricksPackage getTotalBricks(HouseDimensions house){
        BricksCalculator bs = new BricksCalculator();
        return bs.calculateBricks(house);
                
                }

}
