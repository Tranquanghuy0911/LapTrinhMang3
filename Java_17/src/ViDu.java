import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao n = ");
	n = sc.nextInt();
	
	if(n%2==0) {
		System.out.println(n + " La so chan");
		
	}else {
		System.out.println(n+ " La so le");
	}
}
}
