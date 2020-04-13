package mypack;

public class LopHoc {
    private QLDS listHS = new QLDS();
    private QLDS listGV = new QLDS();

    public int themHS(HocSinh hocSinh){
        listHS.them( hocSinh);
        return 1;
    }
    public int inDSHS(){
       listHS.inDS(listHS.getDs());
       return 1;
    }
 
    
     public int themGV(GiaoVien giaoVien){
         listGV.them( giaoVien);
         return 1;
     }
     public int  inDSGV(){
         listGV.inDS(listGV.getDs());
         return 1;
     }
}