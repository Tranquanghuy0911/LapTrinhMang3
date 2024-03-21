
public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(3, 12, 1974);
	Ngay ngay2 = new Ngay(9, 10, 1974);
	Ngay ngay3 = new Ngay(10, 9, 2007);
	Ngay ngay4 = new Ngay(7, 3, 2019);
	
	QuocGia qg1 = new QuocGia("CM", "Arghentina");
	QuocGia qg2 = new QuocGia("CA", "Nga");
	QuocGia qg3 = new QuocGia("CDD", "BaByCuTe");
	QuocGia qg4 = new QuocGia("LT", "AiCap");
	
	HangSanXuat hsx1= new HangSanXuat("Hang San Xuat Quang Huy", qg1);
	HangSanXuat hsx2= new HangSanXuat("Hang San Xuat Tien Hung", qg2);
	HangSanXuat hsx3= new HangSanXuat("Hang San Xuat Hoai Nam", qg3);
	HangSanXuat hsx4= new HangSanXuat("Hang San Xuat Duc Chinh", qg4);
	
	MayTinh mt1 = new MayTinh(hsx1, ngay1, 200000, 2);
	MayTinh mt2 = new MayTinh(hsx2, ngay2, 300000, 2);
	MayTinh mt3 = new MayTinh(hsx3, ngay3, 400000, 2);
	MayTinh mt4 = new MayTinh(hsx4, ngay4, 500000, 2);
	
	System.out.println("So sanh gia thap hon " );
	System.out.println("M1 va M2 " +mt1.kiemTraGiaThapHon(mt2));
	System.out.println("M3 va M4 " +mt3.kiemTraGiaThapHon(mt4));
	
	System.out.println("Ten Quoc Gia ");
	System.out.println("M1 : " +hsx1.layTenQuocGia());
	System.out.println("M2 : " +hsx2.layTenQuocGia());
	System.out.println("M3 : " +hsx3.layTenQuocGia());
	System.out.println("M4 : " +hsx4.layTenQuocGia());
	
}
}
