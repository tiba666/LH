package FunctionLayer;

import DBAccess.OrderExcetion;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;

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
        OrderMapper.createOrdder(dimensions, user);
    }
    public static HouseDimensions createHouse(int height, int width, int length){
        return new HouseDimensions(length, width, height);
    }

}
