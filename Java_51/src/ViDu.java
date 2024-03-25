
public class ViDu {
public static void main(String[] args) {
	String s1 = "Xin chao cô cac ban, xin chao cac ban, Xin chào ! ";
	String s2 = "Xin chao ";
	String s3 = "Xin chao 123 ";
	char c1 = 'ô';
	// ham indexOf
	System.out.println("Vi tri cua s1 trong s2 la "+s1.indexOf(s2));	
	System.out.println("Vi tri cua s1 trong s3 la "+s1.indexOf(s3));	
	
	// Su dung vi tri bat dau 
	System.out.println("Vi tri cua s1 trong s2 la "+s1.indexOf(s2,2));	
	
	// Tìm kiếm char
	
	System.out.println("Vi tri cua c1 trong s1 la "+s1.indexOf(c1));	
	
	System.out.println("Vi tri cua c1 trong s1 la "+s1.indexOf(c1,20));	
	
	// Hàm LastIndexof => tìm kiếm tử phài sang trái 
	System.out.println("Vi tri cua s2 trong s1 la "+s1.lastIndexOf(s2,2));	
}
}
