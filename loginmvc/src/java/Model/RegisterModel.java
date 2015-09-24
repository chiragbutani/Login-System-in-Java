/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;




import Beans.UserMasterVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class RegisterModel {

    ConnectionHandler ch;
    public RegisterModel() {
        ch=new ConnectionHandler();
    }



    

    public boolean InsertDetails(UserMasterVo userMasterVo)
    {
        boolean result=false;
       
        String query="insert into user_master(username, password) values('"+userMasterVo.getUsername()+"', '"+userMasterVo.getPassword()+"')";
                result=ch.insertQuery(query);
        return result;
    }

    
}
