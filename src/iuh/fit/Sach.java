package iuh.fit;

import java.time.LocalDate;

public abstract class Sach {
    protected  String maSach;
    protected  String tenSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach() {
        this("","",LocalDate.now(),0.0,0,"");
    }

    public Sach(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public abstract double getThanhTien();

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-40s %-15s %10.2f %10d %10.2f  %-20s ", maSach, tenSach, ngayNhap, donGia, soLuong, getThanhTien(),nhaXuatBan);
    }
}
