package iuh.fit;

import java.util.Arrays;

public class DanhSachSach {
    private Sach[] dsSach;
    private int count = 0;
//    + DanhSachSach()
    public DanhSachSach(){
        dsSach = new Sach[10];
    }

//    + DanhSachSach(int)
    public DanhSachSach(int n){
        if(n <= 0)
            throw  new IllegalArgumentException("n > 0");
        this.dsSach = new Sach[n];
    }

//    + getDSSach(): Sach[]
    public Sach[] getDSSach() {
        return dsSach;
    }

//    + themSach(Sach): void
    public void themSach(Sach sach){
        if(sach == null)
            throw new IllegalArgumentException("Sach khong duoc null");
        //Kiem tra trung ma sach ???
        for (int i = 0; i < count; i++){
            Sach s = dsSach[i];
            if(s.getMaSach().equalsIgnoreCase(sach.maSach))
                throw new IllegalArgumentException("Trung ma sach");
        }

        //Mang day, tang kich thuoc mang len 1.5
        if(dsSach.length == count){
            int newLength = (int)(dsSach.length * 1.5);
            dsSach = Arrays.copyOf(dsSach, newLength);
        }
        //Them thanh cong
        dsSach[count ++] = sach;
    }

   

//    + getTongTienSachGK(): double
    public double getTongTienSachGK(){
        double tongTien = 0.0;
        for (Sach s : dsSach){
            if(s != null && s instanceof SachGiaoKhoa)
                tongTien += s.getThanhTien();
        }

        return  tongTien;
    }

//    + getTongTienSachTK(): double
    public double getTongTienSachTK(){

        return  0.0;
    }
//+ listDSSachGKTheoNXB(String): Sach[]
    public Sach[] listDSSachGKTheoNXB(String nxb){

        return null;
    }
//+ getThanhTienCaoNhat(): double
    public double getThanhTienCaoNhat(){

        return 0.0;
    }
}
