import java.net.URL;

public class ViDuURL {
    public static void main(String[] args) {
        try {
            URL ur = new URL("https://www.nguyenkim.com/he-dieu-hanh-may-tinh-dien-thoai.html");
            System.out.println("Protocol: "+ur.getProtocol());
            System.out.println("Host: "+ur.getHost());
            System.out.println("Post: "+ur.getPort());
            System.out.println("File: "+ur.getFile());
            System.out.println("Ref: "+ur.getRef());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
