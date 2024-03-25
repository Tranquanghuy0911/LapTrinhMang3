package vidu;

public class Enumtest {
	public static void main(String[] args) {
		
	ThoiKhoaBieu tkb_2 = new ThoiKhoaBieu(Day.MonDay, "Toan Ly Hoa"); 
	ThoiKhoaBieu tkb_3 = new ThoiKhoaBieu(Day.Tuesday, "Van Su Dia"); 
	ThoiKhoaBieu tkb_4 = new ThoiKhoaBieu(Day.Wednesday, "Ly Hoa Sinh"); 
	ThoiKhoaBieu tkb_5 = new ThoiKhoaBieu(Day.Thursday, "Tin GDCD TD"); 
	System.out.println(tkb_5);
	
	
	int x = Thang.Thang_mot.soNgay();
	System.out.println(x);
	}
}
