package TestArrayList;

import java.util.Scanner;

import ArrayList.DanhSachSinhVien;
import ArrayList.SinhVien;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	DanhSachSinhVien dssv = new DanhSachSinhVien();
	int luaChon = 0;
	do {
		System.out.println("Menu -----------");
		System.out.println("Lựa chọn câu ");
		System.out.println(
				  "1.	Thêm sinh viên vào danh sách.\n"
				+ "2.	In danh sách sinh viên ra màn hình.\n"
				+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
				+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
				+ "5.	Làm rỗng danh sách sinh viên.\n"
				+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
				+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
				+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
				+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
				+ "0.   Thoát khỏi chương trình");
		luaChon = sc.nextInt();
		sc.nextLine();
		// 1.Thêm sinh viên vào danh sách
		if(luaChon==1) {
			System.out.println("Nhập mã sinh viên : "); String msv = sc.nextLine();
			System.out.println("Nhập họ và tên : "); String hvt = sc.nextLine();
			System.out.println("Nhập năm sinh : "); int ns = sc.nextInt();
			System.out.println("Nhập Điểm trung bình : "); double dtb = sc.nextDouble();
			SinhVien sv = new SinhVien(msv, hvt, ns, dtb);
			dssv.themSinhVien(sv);
			//2. In danh sách sinh viên ra màn hình
		}else if(luaChon==2) {
			dssv.inDanhSachSinhVien();
		}else if(luaChon==3) {
			// 3. Kiểm tra danh sách có rỗng hay không 
			System.out.println("Kiếm tra danh sách có rỗng hay không : "+dssv.kiemTraDanhSachRong());
		}else if(luaChon==4) {
			// 4 . lấy ra số lượng sinh viên trong danh sách
			System.out.println(" Số lượng sinh viên trong danh sách " +dssv.laySoLuong());
		}else if(luaChon==5) {
			// 5. Làm rỗng danh sách sinh viên 
			dssv.lamRongDanhSach();
		}else if(luaChon==6) {
			// 6. Kiểm tra sinh viên có tồn tại trong danh sách hay không 
			System.out.println("Nhập mã sinh viên : "); String msv = sc.nextLine();
			SinhVien sv = new SinhVien(msv);
			System.out.println("Kiểm tra sinh viên có trong danh sách không : "+dssv.kiemTraTonTai(sv));
		}else if(luaChon==7) {
			// 7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên 
			System.out.println("Nhập mã sinh viên : "); String msv = sc.nextLine();
			SinhVien sv = new SinhVien(msv);
			System.out.println("Xóa sinh viên khỏi danh sách " + dssv.xoaSinhVien(sv));
		}else if(luaChon==8) {
			// 8. Tìm kiếm tên tất cả sinh viên dựa trên tên được nhập từ bàn phím 
			System.out.println("Nhập họ và tên : "); String hvt = sc.nextLine();
			System.out.println("Kết quả tìm kiếm : ");
			dssv.timSinhVien(hvt);
		}else if(luaChon==9) {
			//9 . Xuất ra danh sách sinh viên có điểm từ cao đến thấp 
			dssv.sapXepSinhVienGiamDanTheoDiem();
			dssv.inDanhSachSinhVien();
		}
	}while(luaChon!=0);
}
}
