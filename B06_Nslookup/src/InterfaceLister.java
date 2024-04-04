import java.net.NetworkInterface;
import java.util.Enumeration;

public class InterfaceLister {
    public static void main(String[] args) {
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            // Kiểm tra còn interface nào khấc không
            while (interfaces.hasMoreElements()) {
                //Lấy ra phần từ và ép kiểu

                NetworkInterface ni = (NetworkInterface) interfaces.nextElement();
                System.out.println(ni);
            }

        } catch (Exception e) {
            System.out.println("Gặp lỗi");
        }
    }
}
