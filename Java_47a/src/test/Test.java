package test;

import code_a.ViDu;

public class Test {
public static void main(String[] args) {
 ViDu vd = new ViDu(8, 9);
 System.out.println(vd.getA());
 System.out.println(vd.getA1());
 
 code_b.ViDu vd2 = new code_b.ViDu(3, 4, 5);
 System.out.println(vd2.getC());
 
}
}
