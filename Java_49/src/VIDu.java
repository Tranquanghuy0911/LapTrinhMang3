import java.util.Scanner;

public class VIDu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String c ;
	System.out.println("Nhap vao chuoi ");
	c = sc.nextLine();
	System.out.println("-----");
	
	// hàm length() =>> lấy độ dài của chuỗi
	System.out.println(c.length());
	int doDai = c.length();
	System.out.println("--------");
	// hàm charAt(vi tri) => lấy ra một kí tự tại vì trí
	
	for (int i = 0;i<doDai;i++) {
		System.out.println("Vi Tri " +i+" là : " +c.charAt(i));
	}
	
	// hàm getchars( vị trí bắt đầu , vị trí kết thúc, 
	// mảng lưu dữ liệu , vị trí bắt đầu lưu của mảng ;
	
	char [] arrayChar = new char[100];
	c.getChars(2, 4, arrayChar, 0);
	for (int i =0; i < arrayChar.length; i++)
	{
		System.out.println("Giá trị của mảng tại " +i+ " là :  " +arrayChar[i]);
	}
	
	// Hàm getBytes => lấy ra giá trị của các ký tự thành 1 mảng 
	byte[] arrayByte = c.getBytes();
	
	for (byte b : arrayByte) {
		System.out.println(b);
	}
	
}
}
