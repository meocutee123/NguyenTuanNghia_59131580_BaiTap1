package mypack;

public class HocSinh extends CaNhan {
    private String lop;
    private String nangKhieu;

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu){
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getlop(){
        return this.lop;
    }
    public void setlop(String lop){
        this.lop = lop;
    }
    public String getnangKhieu(){
        return this.nangKhieu;
    }
    public void setNangKhieu(String nangKhieu){
        this.nangKhieu = nangKhieu;
    }
    @Override
    public String hienThiTT(){
        return gethoTen() + " " + gettuoi() + " " + getdiaChi() + " " + getsdt() +" " + lop + " " + nangKhieu;
    }
}