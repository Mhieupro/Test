/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hieua
 */
public class User {
    private int id, vaiTro;
    private String taiKhoan, matKhau, ten;

    public User(int vaiTro, String ten) {
        this.vaiTro = vaiTro;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getTen() {
        return ten;
    }
    
    
}
