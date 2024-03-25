
public class Test {
public static void main(String[] args) {
	HangSanXuat h1 = new HangSanXuat("Viet Nam Arnine", "VietNam");
	HangSanXuat h2 = new HangSanXuat("Mercedes", "Germany");
	HangSanXuat h3 = new HangSanXuat("ToYoTa", "Japan");
	
	PhuongTienDiChuyen ptdd1 = new XeOTo(h2,"Xang");
	PhuongTienDiChuyen ptdd2 = new MayBay(h1,"Khi Dot");
	PhuongTienDiChuyen ptdd3 = new XeDap(h3);
	
	System.out.println("_________");
	System.out.println("Ten Hang San Xuat " +ptdd1.layTenHangSanxuat());
	System.out.println("Ten Hang San Xuat " +ptdd2.layTenHangSanxuat());
	System.out.println("Ten Hang San Xuat " +ptdd3.layTenHangSanxuat());
	System.out.println("_________");
	ptdd1.BatDau();
	ptdd2.BatDau();
	ptdd3.BatDau();
	System.out.println("_________");
	ptdd1.DungLai();
	ptdd2.DungLai();
	ptdd3.DungLai();
	System.out.println("_________");
	ptdd1.TangToc();
	ptdd2.TangToc();
	ptdd3.TangToc();
	System.out.println("_________");
	System.out.println("Lay Van Toc " +ptdd1.layVanToc());
	System.out.println("Lay Van Toc " +ptdd2.layVanToc());
	System.out.println("Lay Van Toc " +ptdd3.layVanToc());
	System.out.println("_________");
	MayBay mb1 = new MayBay(h1, "Xang");
	System.out.println("_________");
	mb1.catCanh();
	mb1.haCanh();
	
}
}
