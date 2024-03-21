
public class SinhVIen {
private String MaSinhVien, hoVaTen;
private double diemTB;
NgaySinh ngaySinh;
Lop lop;
public SinhVIen(String maSinhVien, String hoVaTen, double diemTB, NgaySinh ngaySinh, Lop lop) {

	MaSinhVien = maSinhVien;
	this.hoVaTen = hoVaTen;
	this.diemTB = diemTB;
	this.ngaySinh = ngaySinh;
	this.lop = lop;
}
public String getMaSinhVien() {
	return MaSinhVien;
}
public void setMaSinhVien(String maSinhVien) {
	MaSinhVien = maSinhVien;
}
public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public double getDiemTB() {
	return diemTB;
}
public void setDiemTB(double diemTB) {
	this.diemTB = diemTB;
}
public NgaySinh getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(NgaySinh ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public Lop getLop() {
	return lop;
}
public void setLop(Lop lop) {
	this.lop = lop;
}

public String LayTenKhoa() {
return this.lop.getTenKhoa();
}
public boolean kiemTraThiDatHayKhong() {
	return this.diemTB >= 4 ; 
}
public boolean kiemTraCungNgaySinhHayKhong(SinhVIen sinhvienkhac) {
	return this.ngaySinh.equals(MaSinhVien);
}
}
