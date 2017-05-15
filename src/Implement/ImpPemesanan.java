/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;
import Entity.Pemesanan;
import java.util.List;
import Implement.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ferdy
 */
public class ImpPemesanan {
    Koneksi kon = new Koneksi();
    
    private String query;
    ResultSet rs;

    public ImpPemesanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Pemesanan> Pemesanan(){
        kon.getKoneksi();
        
        try{
            query = "SELECT * FROM pemesanan";
            Statement st = kon.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            List<Pemesanan> dataPemesanan = new ArrayList<Pemesanan>();
            
            while(rs.next()){
                Pemesanan pemesanan = new Pemesanan();
//                Pemesanan.
            }
        }
        catch(SQLException se){
            System.out.println("data gagal dimasukkan"+se.getMessage());
        }
        return null;
    }
    
}
