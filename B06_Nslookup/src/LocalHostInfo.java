import java.net.InetAddress;

public class LocalHostInfo {
    public static void main(String[] args) {

        try {
            // Tạo địa chỉ Inet cho máy thiết bị
            InetAddress ia = InetAddress.getLocalHost();
            // Trả tên
            System.out.println("My name is "+ia.getHostName());
            // Trả tên
            System.out.println("My Address is " +ia.getHostAddress());
            System.out.println("Reachable " +ia.isReachable(120));
            System.out.println("MulticastAddress " +ia.isMulticastAddress());
            System.out.println("SiteLocalAddress " +ia.isSiteLocalAddress());

            //

            byte[] address = ia.getAddress();
            for(int i =0; i<address.length; i++)
            {
                System.out.println(address[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
