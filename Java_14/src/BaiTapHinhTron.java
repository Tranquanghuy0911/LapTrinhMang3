import java.util.Scanner;

public class BaiTapHinhTron {
public static void main(String[] args) {
	double r , dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ban kinh r = ");
	r = sc.nextDouble();
	
	// Tinh chu vi hinh trong
	
	chuVi = 2*Math.PI*r;
	System.out.println(" Chu Vi = "+chuVi);
	System.out.println(" Chu Vi = "+Math.round(chuVi));
	System.out.println(" Chu Vi = "+Math.round(chuVi*100.0)/100.0);
	
	// Tinh dien tinh hinh tron
	dienTich = Math.PI * Math.pow(r, 2);
	System.out.println(" Dien Tich = "+dienTich);
	System.out.println(" Dien Tich = "+Math.round(dienTich));
	System.out.println(" Chu Vi = "+Math.round(dienTich*100.0)/100.0);
}
}
