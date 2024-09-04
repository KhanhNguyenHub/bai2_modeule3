package iuh.fit;

import java.time.LocalDate;

public class LopKiemNghiem {
    public static void main(String[] args) {

        DanhSachSach dsSach = new DanhSachSach(4);

        Sach s1 = new SachGiaoKhoa("TV1","Tiếng Viet lop 1",
                LocalDate.of(2024,5,15), 25000.0,
                10, "Kim Dong",TinhTrang.MOI);
        Sach s2 = new SachGiaoKhoa("TV2","Tiếng Viet lop 2",
                LocalDate.of(2024,5,15), 27000.0,
                10, "Kim Dong",TinhTrang.CU);
        Sach s3 = new SachThamKhao("TVTH1","Tieng Viet thuc hanh lop 1",
                LocalDate.of(2024,6,1), 50000.0,
             10, "Kim Dong", 0.05);
        Sach s4 = new SachThamKhao("TVTH4","Tieng Viet thuc hanh lop 4",
                LocalDate.of(2024,6,1), 70000.0,
             10, "Kim Dong", 0.05);
        Sach s5 = new SachThamKhao("TVTH5","Tieng Viet thuc hanh lop 5",
                LocalDate.of(2024,6,1), 75000.0,
             10, "Kim Dong", 0.05);

        dsSach.themSach(s1);
        dsSach.themSach(s2);
        dsSach.themSach(s3);
        dsSach.themSach(s4);
        dsSach.themSach(s5);

        Sach[] temp = dsSach.getDSSach();
        for(Sach s : temp)
            if(s != null)
                System.out.println(s);

    }
}
