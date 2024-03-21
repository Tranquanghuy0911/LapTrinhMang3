
public class Main {
public static void main(String[] args) {
	MyDate md = new MyDate(31,1 , 2021);
	System.out.println(" Day = " +md.getDay());
	md.setDay(100);
	System.out.println(" Day = "+md.getDay());
	md.setDay(28);
	System.out.println(" Day = "+md.getDay());
	
	System.out.println(" Month = " +md.getMonth());
	md.setMonth(13);
	System.out.println(" Month = "+md.getMonth());
	md.setMonth(5);
	System.out.println(" Month = "+md.getMonth());
}
}
