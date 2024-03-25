package BocThamTrungThuong;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> hopPhieuDuThuong = new HashSet<String>();

	public RutThamTrungThuong_HashSet() {
	}

	public boolean themPhieu(String giaTri) {
		return this.hopPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.hopPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.hopPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCaPhieuDuThuong() {
		this.hopPhieuDuThuong.clear();
	}

	public int laySoLuong() {
		return this.hopPhieuDuThuong.size();
	}

	public String rutPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.hopPhieuDuThuong.size());
		ketQua = (String) this.hopPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.hopPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {

		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rttt = new RutThamTrungThuong_HashSet();
		do {
			System.out.println("-------------------------");
			System.out.println("Menu ");
			System.out.println("1. Thêm mã số dự thưởng ");
			System.out.println("2. Xóa mã số dự thưởng ");
			System.out.println("1. kiểm tra mã số dự thưởng có tồn tại hay không  ");
			System.out.println("4. Xóa tất cả phiếu dự thưởng ");
			System.out.println("5. Lấy số lượng phiếu dự thưởng  ");
			System.out.println("6. Rút thăm trúng thưởng ");
			System.out.println("7. In ra tất cả các phiếu ");
			System.out.println("0. Thoát khỏi chương trình  ");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào mã phiếu dự thưởng ");
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					rttt.themPhieu(giaTri);
				} else if (luaChon == 2) {
					rttt.xoaPhieu(giaTri);
				} else {
					System.out.println("Kiểm tra phiếu tồn tại " + rttt.kiemTraPhieuTonTai(giaTri));
				}
			} else if (luaChon == 4) {
				rttt.xoaTatCaPhieuDuThuong();
			} else if (luaChon == 5) {
				System.out.println("Lấy số lượng phiếu " + rttt.laySoLuong());
			} else if (luaChon == 6) {
				System.out.println("Mã số trúng thưởng là " + rttt.rutPhieu());
			} else if ( luaChon==7)
			{
				System.out.println(" Các mã phiếu dự thưởng là ");
				rttt.inTatCa();
			}
		} while (luaChon != 0);
	}
}
