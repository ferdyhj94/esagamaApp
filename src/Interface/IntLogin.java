/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Factory.Factory;
import Implement.ImpLogin;
/**
 *
 * @author Ferdy
 */
public interface IntLogin {

    boolean login(String username, String password);
    
}
