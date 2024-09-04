package iuh.fit;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{

    private TinhTrang tinhTrang;

    public SachGiaoKhoa(){
//        cach 1
//        super();
//        this.tinhTrang = TinhTrang.MOI;
//        cach 2
        this("","",LocalDate.now(), 0.0, 0, "", TinhTrang.MOI);
    }

    public SachGiaoKhoa(String maSach, String tenSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, TinhTrang tinhTrang) {
        super(maSach, tenSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public TinhTrang getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrang tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double getThanhTien() {
        return this.tinhTrang == TinhTrang.MOI ? soLuong * donGia : soLuong * donGia * 0.5;
    }
}
