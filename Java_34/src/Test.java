
public class Test {
	public static void main(String[] args) {
MyDate md = new MyDate(20, 11, 2010);
MyDate md1 = new MyDate(9, 11, 2003);
MyDate md2 = new MyDate(20, 11, 2010);
System.out.println(md);	
System.out.println(md1);	
System.out.println(md2);	
//int a = 5;
//int b = 6;
//if(a==b) {
//	System.out.println("a = b");
//}else
//{
//	System.out.println(" a != b");
//}

//if(md == md2) {
//	System.out.println("Md = Md2 ");
//}else {
//	System.out.println("Md != Md2 ");
//}
System.out.println("md so sanh bang md2 "+md.equals(md2) );
System.out.println("md so sanh bang md1 "+md.equals(md1) );
}
}
