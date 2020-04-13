package mypack;

public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String gethoTen(){
        return this.hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public int gettuoi(){
        return this.tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getdiaChi(){
        return this.diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getsdt(){
        return this.sdt;
    }
    public void setsdt(String sdt){
        this.sdt = sdt;
    }
    
    abstract String hienThiTT();
}