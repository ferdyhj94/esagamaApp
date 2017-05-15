/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

//import Entity.Pemesanan;
import Implement.ImpPemesanan;
import Interface.IntPemesanan;

/**
 *
 * @author Ferdy
 */
public class PemesananDao {
    private IntPemesanan intPemesanan;
    
    public IntPemesanan getPemesananDao(){
        if(intPemesanan == null){
            //intPemesanan = (IntPemesanan) new ImpPemesanan();
            intPemesanan = (IntPemesanan) new ImpPemesanan();
            
        }
        return intPemesanan;
    }
}
