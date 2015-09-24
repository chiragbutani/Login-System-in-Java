/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LoginModel {
ConnectionHandler ch;
    public LoginModel() {
          ch=new ConnectionHandler();
    }

    public ArrayList getData(String username, String password)
    {
        ArrayList data=new ArrayList();
        String query="select * from user_master where username='"+username+"' and password='"+password+"'";

        System.out.println(query);
        data=ch.selectQuery(query);
        System.out.println(data);
        return data;
    }


}
