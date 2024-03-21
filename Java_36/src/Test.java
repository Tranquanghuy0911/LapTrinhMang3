
public class Test {
	public static void main(String[] args) {

		Ngay ngay1 = new Ngay(3, 12, 2033);
		Ngay ngay2 = new Ngay(7, 7, 2031);
		Ngay ngay3 = new Ngay(9, 8, 2033);
		Ngay ngay4 = new Ngay(20, 10, 2032);

		HangSanXuat hang1 = new HangSanXuat("Hãng sản xuất Quang Huy", "Ấn Độ");
		HangSanXuat hang2 = new HangSanXuat("Hãng sản xuất TIến Hưng", "Việt Nam");
		HangSanXuat hang3 = new HangSanXuat("Hãng sản xuất Hoài Nam", "Hàn Quốc");
		HangSanXuat hang4 = new HangSanXuat("Hãng sản xuất Đức Chính", "Mỹ");

		BoPhim bp1 = new BoPhim("Quái vật nhỏ", 2007, hang1, ngay1, 15000);
		BoPhim bp2 = new BoPhim("Quái vậy to", 2007, hang2, ngay2,65000);
		BoPhim bp3 = new BoPhim("Quái vậy vừa", 2007, hang3, ngay3,75000);
		BoPhim bp4 = new BoPhim("Quái vậy cỡ bự", 2007, hang4, ngay4,50000);

		System.out.println("Tên hãng sản xuất : "+bp1.layTenHangSanXuat() );
		System.out.println("Tên hãng sản xuất : "+bp2.layTenHangSanXuat() );
		System.out.println("Tên hãng sản xuất : "+bp3.layTenHangSanXuat() );
		System.out.println("Tên hãng sản xuất : "+bp4.layTenHangSanXuat() );
		
		System.out.println("So sảnh bp1 và bp2 : " +bp1.kiemTraGiaVe(bp2));
		System.out.println("So sảnh bp3 và bp4 : " +bp3.kiemTraGiaVe(bp4));
		
		System.out.println("Bộ phim 1 giảm 10% " +bp1.giaSauKhuyenMai(10));
		System.out.println("Bộ phim 2 giảm 20% " +bp2.giaSauKhuyenMai(10));
		System.out.println("Bộ phim 3 giảm 30% " +bp3.giaSauKhuyenMai(10));
		System.out.println("Bộ phim 4 giảm 40% " +bp4.giaSauKhuyenMai(10));
	}
}
