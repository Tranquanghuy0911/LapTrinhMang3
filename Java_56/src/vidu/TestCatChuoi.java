package vidu;

import java.util.Arrays;

public class TestCatChuoi {
public static void main(String[] args) {
	String s = "Xin chào các bạn, tui tên là Quang Huy";
	String [] a = s.split(" ");
	System.out.println("Chuỗi sau khi bị cắt a = " +Arrays.toString(a));
	
	String [] b = s.split(",");
	System.out.println("Chuỗi sau khi bị cắt b = " +Arrays.toString(b) );
	
	String s2 = "Xin chào, mình là Donny. Mình đang học lập trình cùng TITV.vn ";
	String [] c = s2.split("\\.|\\,");
	System.out.println("Chuỗi sau khi bị cắt c = " +Arrays.toString(c) );
	
	String s3 = "Nguyen Van Quang Huy";
	String [] d = s3.split(" ");
	System.out.println("Chuỗi sau khi bị cắt d = " +Arrays.toString(d) );
	System.out.println("Tên : " +d[d.length-1]);;
}
}
