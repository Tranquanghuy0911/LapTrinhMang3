
public class HoaDonCaPh {
private String tenLoaiCaPhe;
private double giaTien1Kg;
private double khoiLuong;

public HoaDonCaPh(String CaPhe, double Tien, double kL){
	this.tenLoaiCaPhe = CaPhe;
	this.giaTien1Kg = Tien;
	this.khoiLuong = kL;
}
public  double tinhTongTien() {
	return this.giaTien1Kg * this.khoiLuong;
}
public boolean kiemTraKhoiLuongLonHon(double kl) {
	return this.khoiLuong > kl ;
}
public boolean kiemTraTongTienLonHon500k() {
	return this.tinhTongTien() >500000;
}

public double tinhTongTienGiamGia(double x)
{
	if(this.tinhTongTien()>500000) {
	return (x/100)* this.tinhTongTien();
}else {
	return 0;
}
}
public double giaSauKhiGiam(double x)
{
	return this.tinhTongTien()-this.tinhTongTienGiamGia(x);
}
}
