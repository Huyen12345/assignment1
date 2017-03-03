/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Product {
    private String masp;
    private String tensp;
    private String mota;
    private int soluong;
    private float dongia;
    private String hinhanh;
    private String nhasx;
    private String maloai;

    public Product() {
    }

    public Product(String masp, String tensp, String mota, int soluong, float dongia, String hinhanh, String nhasx, String maloai) {
        this.masp = masp;
        this.tensp = tensp;
        this.mota = mota;
        this.soluong = soluong;
        this.dongia = dongia;
        this.hinhanh = hinhanh;
        this.nhasx = nhasx;
        this.maloai = maloai;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

}