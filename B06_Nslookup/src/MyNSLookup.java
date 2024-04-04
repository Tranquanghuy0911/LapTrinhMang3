import java.net.InetAddress;
import java.util.Scanner;

public class MyNSLookup {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhập vào domain name/ip để tra cứu thông tin ");
            System.out.println("Nhập va 'exit' để thoát");
            input = sc.nextLine();
            // Thoát vòng lặp nếu gặp 'exit'
            if(input.equals("exit")){
                break;
            }

            try{
                InetAddress ia = InetAddress.getByName(input);
                // In thông tin
                System.out.println("IP " +ia.getHostAddress());
                System.out.println("Domain " +ia.getHostName());
                System.out.println("Reachable " +ia.isReachable(120));
                System.out.println("MulticastAddress " +ia.isMulticastAddress());
                System.out.println("SiteLocalAddress " +ia.isSiteLocalAddress());
            }catch (Exception e){
                System.out.println("Gặp lỗi vui lòng nhập thông tin khác");
            }
        }
    }
}
