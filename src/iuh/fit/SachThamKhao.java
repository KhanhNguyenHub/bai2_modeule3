package iuh.fit;

import java.time.LocalDate;

public class SachThamKhao extends Sach{

    private double thue; //ti le thue

    public SachThamKhao(){
        super();
        this.thue = 0.0;
    }

    public SachThamKhao(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, tenSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double getThanhTien() {
        double tienThue = soLuong * donGia * thue; //Tinh tien thue
        return soLuong * donGia + tienThue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }
}
