
public class Test {
public static void main(String[] args) {
	ConNguoi cn = new ConNguoi("QuangHuyVN", 2009);
	cn.an();
	cn.uong();
	cn.ngu();
	
	HocSinh hs = new HocSinh("QuangHuyVN", 2008,"Lop3E", "LeThiVan");
	hs.an();
	hs.uong();
	hs.ngu();
	hs.lamBaiTap();
}
}
