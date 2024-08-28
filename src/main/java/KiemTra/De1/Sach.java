/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra.De1;

/**
 *
 * @author ADMIN
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private int giaBia;
    private int namXuatBan;

    public Sach(String maSach, String tenSach, int giaBia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaBia = giaBia;
        this.namXuatBan = namXuatBan;
    }

    // Getters and Setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(int giaBia) {
        this.giaBia = giaBia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "CD{" + "maso='" + maSach + '\'' + ", tenCD='" + tenSach + '\'' + ", giaban=" + giaBia + ", namphathanh=" + namXuatBan + "";
    }
}
