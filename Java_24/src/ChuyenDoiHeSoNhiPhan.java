import java.util.Scanner;

public class ChuyenDoiHeSoNhiPhan {
public static void main(String[] args) {
	int n ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap số nguyên n > 0 = ");
	n = sc.nextInt();
	
	String nhiPhan = "" ;
	/*
	 * Chia liên tục cho 2 và lấy phần dư 
	 * Đao ngược chuỗi => kết quả
	 * 10:2 = 5 dư 0
	 * 5: 2 = 2 dư 1
	 * 2:2 = 1 dư 0 
	 * 1:2 = 0 dư 1
	 * 1010
	 */
	
	while(n>0)
	{
		nhiPhan = (n%2) + nhiPhan;
		n/=2;
	}
	System.out.println("Hệ nhi phân là : " +nhiPhan);
}
}
