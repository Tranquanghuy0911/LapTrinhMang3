import java.util.Scanner;

public class BaiTapTimSoNgayCuaThang {
public static void main(String[] args) {
	int t, n ; 
	Scanner sc = new Scanner (System.in);
	System.out.println("Nhap vao thang t = ");
	t = sc.nextInt();
	System.out.println("Nhap vao thang n = ");
	n = sc.nextInt();
	
	switch (t) {
	case 1: 
	case 3: 
	case 5: 
	case 7: 
	case 8: 
	case 10: 
	case 12: 
		System.out.println("Có 31 ngày");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("Có 30 ngày");
		break;
	case 2:
		if((n%4==0&&n%100!=0)||(n%400==0)) {
			System.out.println("Có 29 ngày ");
		}else {
			System.out.println("Có 28 ngày ");
			
		}
		break;
	default:
		System.out.println("Nhập tháng sai rồi bạn nhé !");
		
	}
}
}
