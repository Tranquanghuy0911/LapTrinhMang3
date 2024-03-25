package queueandeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuDeque {
public static void main(String[] args) {
	Deque<String> danhSachSV = new ArrayDeque<String>();

	danhSachSV.offer("Trần Quang Huy");
	danhSachSV.offer("Nguyễn Hoài Nam");
	danhSachSV.offer("Nguyễn Tiến Hưng");
	danhSachSV.offer("Nguyễn Đức Chính");
	danhSachSV.offerLast("TITV4");
	danhSachSV.offerFirst("TITV0");

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
