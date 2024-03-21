
public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(1, 12, 2003);
	Ngay ngay2 = new Ngay(9, 3, 2003);
	Ngay ngay3 = new Ngay(1, 8, 2003);
	
	TacGia tacGia1 = new TacGia("Quang Huy",ngay1);
	TacGia tacGia2 = new TacGia("Quang Lớn",ngay2);
	TacGia tacGia3 = new TacGia("Quang Trung Niên",ngay3);
	
	Sach sach1 = new Sach("Bố già", 15000, 2003,tacGia1 );
	Sach sach2 = new Sach("Bố trẻ", 25000, 2001,tacGia2 );
	Sach sach3 = new Sach("Bố trung niên", 55000, 2001,tacGia3 );
	
	sach1.inTenSach();
	sach2.inTenSach();
	sach3.inTenSach();
	
	System.out.println(" So sánh năm xuất bản của sách 1 và 3 " +sach1.kiemTraCungNamXuatBan(sach3));
	System.out.println(" So sánh năm xuất bản của sách 2 và 3 " +sach2.kiemTraCungNamXuatBan(sach3));
	
	System.out.println("Sách 1 giảm 10% " +sach1.giaASSauKhiGiam(10));
	System.out.println("Sách 2 giảm 30% " +sach2.giaASSauKhiGiam(30));
	System.out.println("Sách 3 giảm 50% " +sach3.giaASSauKhiGiam(50));
}
}
