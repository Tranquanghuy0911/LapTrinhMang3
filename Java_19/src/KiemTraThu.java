import java.util.Scanner;

public class KiemTraThu {
public static void main(String[] args) {
	int n ; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so nguyen to tu 0 - 8 ");
	n = sc.nextInt();
	
	switch (n) {
	case 2: {
		
		System.out.println("Thứ hai");
		break;
	}
case 3: {
		
		System.out.println("Thứ ba");
		break;
	}
case 4: {
	
	System.out.println("Thứ tư");
	break;
}
case 5: {
	
	System.out.println("Thứ Năm");
	break;
}
case 6: {
	
	System.out.println("Thứ Sáu");
	break;
}
case 7: {
	
	System.out.println("Thứ Bảy");
	break;
}
case 8: {
	
	System.out.println("Chủ nhật");
	break;
}
	default:
		System.out.println("Nhập dữ liệu sai rồi bạn yêu nhé! ");
	}
}
}
