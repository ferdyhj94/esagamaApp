/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Ferdy
 */
public class Pemesanan {
    private int idPemesanan;
    private String idKonsumen;
    private int idJenisProduk;
    private int idMacamProduk;
    private int ukuran;
    private String status;

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getIdKonsumen() {
        return idKonsumen;
    }

    public void setIdKonsumen(String idKonsumen) {
        this.idKonsumen = idKonsumen;
    }

    public int getIdJenisProduk() {
        return idJenisProduk;
    }

    public void setIdJenisProduk(int idJenisProduk) {
        this.idJenisProduk = idJenisProduk;
    }

    public int getIdMacamProduk() {
        return idMacamProduk;
    }

    public void setIdMacamProduk(int idMacamProduk) {
        this.idMacamProduk = idMacamProduk;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
