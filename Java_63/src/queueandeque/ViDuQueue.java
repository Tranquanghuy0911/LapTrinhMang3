package queueandeque;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
	public static void main(String[] args) {
		

Queue<String> danhSachSV = new LinkedList<String>();

danhSachSV.offer("Trần Quang Huy");
danhSachSV.offer("Nguyễn Tiến Hưng");
danhSachSV.offer("Nguyễn Hoài Nam");
danhSachSV.offer("Nguyễn Đức Chính");

while (true) {
	String ten = danhSachSV.poll(); //=>> poll lấy ra và xóa
	// peek lấy ra nhưng không xóa 
	if(ten==null) {
		break;
	}
	System.out.println(ten);
}
	}
}
