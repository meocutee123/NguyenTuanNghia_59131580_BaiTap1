import mypack.HocSinh;
import mypack.GiaoVien;
import mypack.LopHoc;
public class MyMainClass {
    public static void main(String[] args) 
    {
        HocSinh hs = new HocSinh("Nguyen Van A", 19, "Dak Lak", "111111111", "59.CNTT-2", "Dance");
          
        GiaoVien gv = new GiaoVien("Nguyen Van B", 19, "Dak lak", "011111111", "Art", "CNTT");
        
        LopHoc lh = new LopHoc();
        lh.themHS(hs);
        lh.themGV(gv);
        
        System.out.println("\nDanh sach hoc sinh:");
        lh.inDSHS();
        System.out.println("\nDanh sach giao vien:");
        lh.inDSGV();
    }
}