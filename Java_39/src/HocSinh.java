
public class HocSinh {
private String hoVaTen;
private int namSinh;
private String tenLop;
private String tenTruong;
public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
	
	this.hoVaTen = hoVaTen;
	this.namSinh = namSinh;
	this.tenLop = tenLop;
	this.tenTruong = tenTruong;
}
public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public String getTenLop() {
	return tenLop;
}
public void setTenLop(String tenLop) {
	this.tenLop = tenLop;
}
public String getTenTruong() {
	return tenTruong;
}
public void setTenTruong(String tenTruong) {
	this.tenTruong = tenTruong;
}
public void lamBaiTap() {
	System.out.println("thuc day ngay ");
}
public void an() {
	System.out.println("mamamya");
}

public void uong() {
	System.out.println("KhoKha");
}

public void ngu() {
	System.out.println("Khokho");
}
}
