
public class Test {
	public static void main(String[] args) {
		
	
NgaySinh ngay1 = new NgaySinh(9,11, 2003);
NgaySinh ngay2 = new NgaySinh(2,1, 2004);
NgaySinh ngay3 = new NgaySinh(1,2, 2004);
NgaySinh ngay4 = new NgaySinh(3,12, 1974);

Lop lop1 = new Lop("Lớp rồng bay phượng múa", "Khoa của rồng");
Lop lop2 = new Lop("Lớp tam anh chiên Lữ Bố", "Khoa tam quốc");
Lop lop3 = new Lop("Lớp binh tiên Hàn tín", "Khoa hán sở tranh hùng");
Lop lop4 = new Lop("Lớp cao hán tổ Lưu Bang", "Khoa ngồi chơi xơi nước");

SinhVIen sv1 = new SinhVIen("RBPM", "Cháu Của Rồng", 9.99, ngay1, lop1);
SinhVIen sv2 = new SinhVIen("TACLB", "Cháu Của Lữ Bố", 3.99, ngay2, lop2);
SinhVIen sv3 = new SinhVIen("BTHT", "Cháu Của Hàn Tín", 10, ngay3, lop3);
SinhVIen sv4 = new SinhVIen("CHTLB", "Cháu Của Lưu Bang", 7, ngay4, lop4);
 
System.out.println("Sinh Viên 1 học khoa " +sv1.LayTenKhoa() );
System.out.println("Sinh Viên 2 học khoa " +sv2.LayTenKhoa() );
System.out.println("Sinh Viên 3 học khoa " +sv3.LayTenKhoa() );
System.out.println("Sinh Viên 4 học khoa " +sv4.LayTenKhoa() );


System.out.println("Kiểm tra sv1 thi đạt hay không :" + sv1.kiemTraThiDatHayKhong());
System.out.println("Kiểm tra sv2 thi đạt hay không :" + sv2.kiemTraThiDatHayKhong());
System.out.println("Kiểm tra sv3 thi đạt hay không :" + sv3.kiemTraThiDatHayKhong());
System.out.println("Kiểm tra sv4 thi đạt hay không :" + sv4.kiemTraThiDatHayKhong());

System.out.println("Kiểm tra sv1 và sv3 có cùng ngày sinh không " +sv1.kiemTraCungNgaySinhHayKhong(sv3));
System.out.println("Kiểm tra sv2 và sv4 có cùng ngày sinh không " +sv2.kiemTraCungNgaySinhHayKhong(sv4));
	}
}
