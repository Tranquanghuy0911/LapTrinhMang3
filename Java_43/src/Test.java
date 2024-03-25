
public class Test {
public static void main(String[] args) {
	MyMath mm = new MyMath();
	System.out.println(" Min(5.5) "+mm.timMin(5, 5));
	System.out.println(" Min(5.5,6.0) "+mm.timMin(5.5, 6.0));
	System.out.println(" TinhTong(5,6) " +mm.tinhTong(5, 6) );
	double arr[] = new double [] {1,2,3,4,5};
	System.out.println("Tinh Tong (5.6)= " +mm.tinhTong(arr));
}
}
