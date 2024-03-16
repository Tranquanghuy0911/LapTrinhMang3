import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao ho va ten");
	String hoVaTen = sc.nextLine();
	
	System.out.println("Nhap ma sinh vien");
	long maSinhVien = sc.nextLong();
	System.out.println("Nhap vao diem thi");
	float diemThi = sc.nextFloat();
	
	System.out.println("Ho va Ten " +hoVaTen);
	System.out.println("Ma Sinh Vien " +maSinhVien);
	System.out.println("Diem Thi " +diemThi);
}
}
