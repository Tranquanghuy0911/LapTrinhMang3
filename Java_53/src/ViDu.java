import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// KIỂU NGUYÊN THỦY
		int[] mang1 = { 1, 2, 3 };
		// COPY MẢNG : CÁCH 1 GÁN DỮ LIỆU TRỰC TIẾP , THAY ĐỔI 1 MẢNG SẼ KÉO THEO MẢNG
		// KHÁC
		int[] mang1_a = mang1;
		mang1_a[0] = 100;

		System.out.println("Mang1 : " + Arrays.toString(mang1_a));
		System.out.println("Mang1_a : " + Arrays.toString(mang1_a));

		// COPY MẢNG CÁCH 2: CLONE
		int[] mang1_b = mang1.clone();
		mang1_a[0] = 50;
		System.out.println("Mang1_a " + Arrays.toString(mang1_a));
		System.out.println("Mang1_b " + Arrays.toString(mang1_b));
		System.out.println("Mang1 " + Arrays.toString(mang1));

		// COPY MẢNG CÁCH 3 : SYSTEM.ARRAYCOPY

		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0]= 90;
		System.out.println("Mang1_c : " + Arrays.toString(mang1_c));
		System.out.println("Mang1 : " + Arrays.toString(mang1));
		System.out.println("Mang1_a : " + Arrays.toString(mang1_a));
		System.out.println("Mang1_b : " + Arrays.toString(mang1_b));
		
		
		// KIỂU NGUYÊN THỦY
		
//		String [] mang_doi_tuong = {"TITV", ".vn"};
//		String [] mang_doi_tuong_1 = mang_doi_tuong;
//		mang_doi_tuong_1[0] = "QuangHuy";
//		System.out.println("MDT = " +Arrays.toString(mang_doi_tuong));
//		System.out.println("MDT_1 = " +Arrays.toString(mang_doi_tuong_1));
//		
//		String [] mang_doi_tuong_2 = mang_doi_tuong.clone();
//		mang_doi_tuong_1 [0] = "TranQuangHuy";
//		System.out.println("MDT = " +Arrays.toString(mang_doi_tuong));
//		System.out.println("MDT_1 = " +Arrays.toString(mang_doi_tuong_1));
//		System.out.println("MDT_2 = " +Arrays.toString(mang_doi_tuong_2));
//		
//		String [] mang_doi_tuong_3 = new String[mang_doi_tuong.length];
//		System.arraycopy(mang_doi_tuong, 0 , mang_doi_tuong_3, 0 , mang_doi_tuong.length);
//		mang_doi_tuong_3[0]= "TiếnHưng";
//		System.out.println("MDT = " +Arrays.toString(mang_doi_tuong));
//		System.out.println("MDT_1 = " +Arrays.toString(mang_doi_tuong_1));
//		System.out.println("MDT_2 = " +Arrays.toString(mang_doi_tuong_2));
//		System.out.println("MDT_3 = " +Arrays.toString(mang_doi_tuong_3));
		
		String [] mang_doi_tuong = {"Quang Huy", "VN"};
		String [] mang_doi_tuong_1 = mang_doi_tuong.clone();
		mang_doi_tuong_1[0] = "Trần Quang Huy";
		System.out.println("MDT = " +Arrays.toString(mang_doi_tuong));
		System.out.println("MDT_1 = " +Arrays.toString(mang_doi_tuong_1));
		
	}
}
