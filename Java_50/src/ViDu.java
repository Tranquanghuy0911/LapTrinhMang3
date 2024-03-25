
public class ViDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "quanghuy.vn";
		String s3 = "quanghuy.vn";

		// Hàm equals => so sánh 2 chuỗi giống nhau , phân biệt chữ hoa chữ thường

		System.out.println(" so sánh s1 và s3 : " + s1.equals(s3));

		System.out.println(" so sánh s2 và s3 : " + s2.equals(s3));

		// Hàm equalsIgnoreCase không phân biệt chữ hoa, chữ thường miễn sao tên giống
		// nhau
		System.out.println(" so sánh s1 và s3 : " + s1.equalsIgnoreCase(s3));
		System.out.println(" so sánh s1 và s2 : " + s2.equalsIgnoreCase(s3));

		// Hàm compareTo => so sánh > < = thường trả về 3 giá trị :
		// số âm hàm được so sánh lớn hơn hàm so sanh
		// , số dương hàm được so sánh nhỏ hơn hàm so sánh
		// số 0 hai hàm bằng nhau

		String sv1 = "Nguyễn văn A";
		String sv2 = "Nguyễn văn B";
		String sv3 = "Nguyễn văn";
		String sv4 = "Nguyễn văn A";

		System.out.println("sv1 compare to sv2 " + sv1.compareTo(sv2));
		System.out.println("sv1 compare to sv3 " + sv1.compareTo(sv3));
		System.out.println("sv1 compare to sv4 " + sv1.compareTo(sv4));

		// Hàm comparetoIgnoreCase => tương tự hàm compare to nhưng không phân biệt chữ
		// hoa chữ thường;

		String hs1 = "Trần Quang Huy ";
		String hs2 = "NGUYỄN TIẾN HƯNG ";
		String hs3 = "Nguyễn Tiến Hưng ";
		String hs4 = "TRẦN QUANG HUY ";

		System.out.println(" So sánh hs1 và hs4 bằng compareignore case " + hs1.compareToIgnoreCase(hs4));
		System.out.println(" So sánh hs2 và hs3 bằng compareignore case " + hs2.compareToIgnoreCase(hs3));
		System.out.println(" So sánh hs1 và hs3 bằng compareignore case " + hs1.compareToIgnoreCase(hs3));
		System.out.println(" So sánh hs2 và hs4 bằng compareignore case " + hs2.compareToIgnoreCase(hs4));

		 //Hàm regionMatches => so sánh 1 đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);

		// Hàm startWith => hàm kiếm tra chuỗi bắt đầu bằng ......
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));

		// Hàm endWith => kiếm tra chuỗi kết thúc bằng
		String file = " No say love.JPG ";
		String file2 = " Tap trung hoc hanh.PDF ";

		if (file.endsWith(".PDF")) {
			System.out.println("file bắt phải yêu ");

		} else if (file2.endsWith(".JPG")) {
			System.out.println("File2 là tập trung học hành");
		}
		
		if (file2.endsWith(".JPG")) {
			System.out.println("file bắt phải yêu ");

		} else if (file.endsWith(".PDF")) {
			System.out.println("File2 là tập trung học hành");
		}
	}
}
