
public class Main {
public static void main(String[] args) {
	HoaDonCaPh hd = new HoaDonCaPh("Quang Huy", 100000, 10.5);
	HoaDonCaPh hd2 = new HoaDonCaPh("Quang Huy", 10000, 1.5);
	System.out.println(" Tổng Tiền : "+ hd.tinhTongTien());
	System.out.println(" Tổng Tiền hd2 : "+ hd2.tinhTongTien());
	System.out.println("Kiểm tra khối lượng > 11.5kg : " + hd.kiemTraKhoiLuongLonHon(11.5));
	System.out.println("Kiểm tra khối lượng > 9.5kg : " + hd.kiemTraKhoiLuongLonHon(9.5));
	System.out.println("Kiểm tra tổng tiền lớn hơn 500k : " +hd.kiemTraTongTienLonHon500k());
	System.out.println("Giảm giá của hóa đơn : " +hd.tinhTongTienGiamGia(10) );
	System.out.println("Giảm giá của hóa đơn2 : " +hd2.tinhTongTienGiamGia(10) );
	System.out.println("Giá sau khi giảm giá của hóa đơn : "+hd.giaSauKhiGiam(10));
	System.out.println("Giá sau khi giảm giá của hóa đơn2 : "+hd2.giaSauKhiGiam(10));
}
}
