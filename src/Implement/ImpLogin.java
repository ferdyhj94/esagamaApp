/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

//import Interface.IntLogin;
import Interface.IntLogin;
import java.sql.ResultSet;
import Implement.Koneksi;
import java.sql.SQLException;

/**
 *
 * @author Ferdy
 */
public class ImpLogin implements IntLogin{
 private Koneksi koneksiDb;
 private ResultSet rsLogin;
 private String query;
 private boolean status;
 
// KoneksiDb = new Koneksi();
// KoneksiDb.getKoneksi();
 public ImpLogin(){
koneksiDb = new Koneksi();
koneksiDb.getKoneksi();
//return koneksiDb;
 }
    //@Override
    public boolean login(String username, String password) {
//        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        query = "SELECT username"
                +"FROM esagama.admin"
                +"WHERE username ='"+username+"'"
                +"AND password = '"+password+"'";
    
        status = koneksiDb.eksekusiQuery(query, true);
        if(status){
            rsLogin = koneksiDb.getRs();
            try{
                rsLogin.next();
                
                if(rsLogin==null){
                    status = false;
                }else{
                    status = true;
                }
            }catch(SQLException ex){
                status = false;
            }
        }
//throw new UnsupportedOperationException("not supported yet");
    return status;
    }
}
