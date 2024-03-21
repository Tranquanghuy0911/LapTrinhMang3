import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
public static void main(String[] args) {
	//Phuong trinh bac 2 : ax^2+bx+c = 0
	/*
	 * cac bien can co a, b, c, x1, x2, delta
	 * B1 . Tính delta = b^2- 4ac
	 * B2. Kiểm tra delta 
	 * delta < 0 => phương trình vô nghiệm
	 * delta = 0 => Phương trình có nghiệm kép x1=x2=-b/2a
	 * delta >0 => phương trình có 2 nghiệm phần biệt
	 * x1=(-b-sqrt(delta))/(2a)
	 * x2=(-b+sqrt(delta))/(2a)
	 */
	
	double a, b, c, x1, x2, delta;
	Scanner sc = new Scanner (System.in);
	System.out.println("Nhap vao a = ");
	a = sc.nextDouble();
	
	System.out.println("Nhap vao b = ");
	b = sc.nextDouble();
	
	System.out.println("Nhap vao c = ");
	c = sc.nextDouble();
	
	delta = Math.pow(b, 2) - 4*a*c;
	if(a==0) {
		System.out.println("Nhập dữ liệu sai ");
	}else {
	if(delta <0)
	{
		//delta <0
		System.out.println("Phương trình vô nghiệm");
	}else if(delta ==0)
	{
		//delta==0
		x1 = -b/(2*a);
		
		System.out.println("Phương trình có 2 nghiệm kép x1 , x2 = " + x1);
	}else {
		x1 = (-b -Math.sqrt(delta))/(2*a);
		x2 = (-b +Math.sqrt(delta))/(2*a);
		System.out.println("Phương trình có 2 nghiệm phân biệt");
		System.out.println(" X1 = " +x1);
		System.out.println("X2 = "+x2);
		//delta >0
	}
	}
}
}
