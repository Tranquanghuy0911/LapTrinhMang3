
public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a: ");

		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhViNaCal500 mvn500 = new MayTinhViNaCal500();

		System.out.println("5+3 =" + mfx500.cong(5, 3));
		System.out.println("5-3 =" + mfx500.tru(5, 3));
		System.out.println("5*3 =" + mfx500.nhan(5, 3));
		System.out.println("4/3 =" + mfx500.chia(4, 3));
		System.out.println("5+3 =" + mvn500.cong(5, 3));
		System.out.println("4/0 =" + mvn500.chia(4, 0));

		System.out.println("Test cau b ");
		double[] arr = new double[] { 5, 1, 3, 4, 5, 8, 0 };
		double[] arr2 = new double[] { 6, 2, 7, 9, 2, 4, 5 };
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();

		sxchen.sapXepTang(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
		sxchon.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "");
		}
		System.out.println();
		System.out.println("Test Cau c ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println(" 3+5= " + pmmt.cong(5, 3));
		double[] arr3 = new double[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		pmmt.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + "");
		}
	}
}
