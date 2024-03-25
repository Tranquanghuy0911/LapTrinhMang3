package Stack;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		

Scanner sc = new Scanner(System.in);

Stack<String> stackChuoi = new Stack<String>();

//stackChuoi.push ("giatri") => dua gia tri vao stack
//stackChuoi.pop () => Lay gia tri ra, xoa khoi stack  
//stackChoi.peek() =>> lay gia tri ra , nhung khong xoa khoi stack
//stackChuoi.clear =>> xoa tat ca phan tu trong stack 
//stackChuoi.contains ("Gia tri") =>> xac dinh gia tri co ton tai trong stack hay khong 
//stackChuoi.size =>> lay ra do dai cua chuoi


//Vi du dao nguoc chuoi 
System.out.println("Nhap vao chuoi : ");
String s = sc.nextLine();
for (int i = 0; i < s.length(); i++) {
	stackChuoi.push(s.charAt(i)+"");
}
System.out.println("Chuoi bi dao nguoc ");
for (int i = 0; i < s.length(); i++) {
	System.out.print(stackChuoi.pop());
}
System.out.println("__________________");
// Ví dụ chuyển từ hệ thập phân sang hệ nhị phân

Stack<Integer> stackSoDu = new Stack<Integer>();
System.out.println("Nhập một số nguyên dương từ bàn phím ");
int x = sc.nextInt();
while(x>0) {
	int soDu = x%2;
	stackSoDu.push(soDu);
	x=x/2;
}
System.out.println("Số nhị phân là ");
int n = stackSoDu.size();
for (int i = 0;i<n;i++)
{
	System.out.print(stackSoDu.pop());
	
}
	}
}
