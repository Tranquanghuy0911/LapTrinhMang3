package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;

		Scanner sc = new Scanner(System.in);
		
		
		Locale lc = new Locale("vi","VN");
		NumberFormat numf = NumberFormat.getInstance(lc);
		
		int luaChon = 0;

		do {
			System.out.println("--------------Mời Bạn lựa chọn ------------------");
			System.out.println("Chọn (1) để tiếp tục chơi ");
			System.out.println("Chọn Phím bất kì đê thoát ");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("--------------Mời Bạn lựa chọn ------------------");
				System.out.println("$$$$$$ Bắt đầu chơi $$$$$");
				System.out.println("$$$$$$$$ Tài khoản của bạn : " + numf.format(taiKhoanNguoiChoi) + "Bạn muốn cược bao nhiêu? ");
				double datCuoc = 0;
				do {
					System.out.println("Đặt cược số tiền vừa với túi tiền bạn <= " + numf.format(taiKhoanNguoiChoi));
					datCuoc = sc.nextDouble();

				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
				
				int luaChonTaiXiu = 0;
				do {
					System.out.println("Chon : 1 <-> Tài Hoặc chọn : 2 <-> Xỉu ");
					luaChonTaiXiu = sc.nextInt();

				} while (luaChonTaiXiu !=1 && luaChonTaiXiu !=2);
				
				// Tung Xúc Xắc 
				
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				 int giaTri1 = xucXac1.nextInt(5)+1;
				 int giaTri2 = xucXac2.nextInt(5)+1;
				 int giaTri3 = xucXac3.nextInt(5)+1;
				 int tong = giaTri1+giaTri2+giaTri3;
				 
				 
				 //Tính toán kết quả
				 
				 System.out.println("Kết quả "+giaTri1+" - "+giaTri2+" - "+giaTri3);
				 if(tong==3||tong==18) {
					 System.out.println("Tổng là " +tong+" Nhà cái lụm lúa ");
					 taiKhoanNguoiChoi-=datCuoc;
					 System.out.println("Tài Khoản của bạn còn : " +numf.format(taiKhoanNguoiChoi));
				 }else if(tong >=4 && tong <10) {
					 System.out.println("Tổng xúc xắc là " +tong+" => Xỉu");
					 if(luaChonTaiXiu==2) {
						 System.out.println("Bạn đã thắng !");
						 taiKhoanNguoiChoi+=datCuoc;
						 System.out.println("Bạn đã thắng tài khoản của bạn được cộng thêm là "+numf.format(taiKhoanNguoiChoi)+" Congratulation ");
					 }else {
						 System.out.println("Bạn đã thua !");
						 taiKhoanNguoiChoi-=datCuoc;
						 System.out.println("Bạn đã thua tài khoản của bạn được cộng thêm là "+numf.format(taiKhoanNguoiChoi));
					 }  
					 }else {
						 System.out.println("Tổng xúc xắc là " +tong+" => Tài");
						 if(luaChonTaiXiu==1) {
							 System.out.println("Bạn đã thắng !");
							 taiKhoanNguoiChoi+=datCuoc;
							 System.out.println("Bạn đã thắng tài khoản của bạn được cộng thêm là "+numf.format(taiKhoanNguoiChoi)+" Congratulation ");
						 }else {
							 System.out.println("Bạn đã thua !");
							 taiKhoanNguoiChoi-=datCuoc;
							 System.out.println("Bạn đã thua tài khoản của bạn được cộng thêm là "+numf.format(taiKhoanNguoiChoi));
					 }
				 }
			}
			} while (luaChon == 1);
}
}
