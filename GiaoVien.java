
public class GiaoVien extends CaNhan {
    private String monDay;
    private String toBoMon;

    public GiaoVien(String hoTen, int tuoi, String sdt, String monDay, String toBoMon){
        super(hoTen, tuoi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getmonDay(){
        return this.monDay;
    }
    public void setmonDay(String monDay){
        this.monDay = monDay;
    }
    public String gettoBoMon(){
        return this.toBoMon;
    }
    public void settoBoMon(String toBoMon){
        this.toBoMon = toBoMon;
    }
    @Override
    public String hienThiTT(){
        return hoTen + " " + tuoi + " " + diaChi + " " + sdt +" " + monDay + " " + toBoMon;
    }
}