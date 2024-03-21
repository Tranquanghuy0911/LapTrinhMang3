import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int n=0;
	 	try {
	 		System.out.println("Nhập vào số nguyên n = ");
	 		 n = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
				System.out.println("Nhập dữ liệu không đúng ");
		} finally {
			// TODO: handle finally clause
			System.out.println("Finally!");
		}
	 	
	 	
	 System.out.println("Gia tri n nhập là : " +n);
	 System.out.println("Ket thuc chuong trinh ");
	 
}
}
