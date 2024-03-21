import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacNhat {
public static void main(String[] args) {
	// PTBN ax+b = 0 
	/*
	 * Neu a= 0 
	 * Neu b = 0 => 	PT Vo so nghiem
	 * Neu b !=0 => PT vo nghiem
	 * Neu a!=0
	 * Co nghiem x = -b/a
	 */
	
	double a,b,x;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao a = ");
	a = sc.nextDouble();
	
	System.out.println("Nhap vao b = ");
	b = sc.nextDouble();
	
	if (a==0)
	{
		// tinh huong a = 0 
		
		if(b==0) {
			// Tinh Huong a = 0 va b= 0
			System.out.println("Phuong trinh vo so nghiem");
		}else {
			//Tinh huong a= 0 va b!=0
			System.out.println("Phuong trinh vo nghiem");
		}
	}else {
		// Tinh huong a!=0
		x= -b/a;
				System.out.println("nghiem X = " + x);
	}
}
}
