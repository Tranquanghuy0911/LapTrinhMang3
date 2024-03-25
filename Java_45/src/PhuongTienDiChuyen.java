
public abstract class PhuongTienDiChuyen {
protected String tenLoaiPhuongTien;
protected HangSanXuat hangSanXuat;


public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
	super();
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	this.hangSanXuat = hangSanXuat;
}

public String getTenLoaiPhuongTien() {
	return tenLoaiPhuongTien;
}

public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
}
public String layTenHangSanxuat() {
	return this.hangSanXuat.getTenHangSanXuat();
}

public void BatDau () {
	System.out.println("Bat dau");
}
public void TangToc () {
	System.out.println("Tang Toc dau");
}
public void DungLai () {
	System.out.println("Dung Lai Ngay di dau");
}
public abstract double layVanToc();
}
