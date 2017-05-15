/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Pemesanan;
//import java.awt.List;
import java.util.List;
/**
 *
 * @author Ferdy
 */
public interface IntPemesanan {
    List<Pemesanan> Pemensanan();
    void simpanPemesanan(Pemesanan pemesanan);
    void ubahPemesanan(Pemesanan pemesanan);
    void hapusPemesanan(Pemesanan pemesanan);
    
}
