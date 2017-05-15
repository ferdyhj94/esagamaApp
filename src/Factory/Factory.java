/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implement.ImpLogin;
import Interface.IntLogin;

/**
 *
 * @author Ferdy
 */
public class Factory {
    private static IntLogin loginDao;
    
    public static IntLogin getLoginDao(){
        loginDao = new ImpLogin();
        return loginDao;
        
    }
}
