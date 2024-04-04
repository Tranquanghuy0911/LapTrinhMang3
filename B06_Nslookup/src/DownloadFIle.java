import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Dictionary;

public class DownloadFIle {
    public static void main(String[] args) {
//        String fileURL ="https://images.openai.com/blob/8d14e8f0-e267-4b8b-a9f2-a79120808f5a/chatgpt.jpg?trim=0,0,0,0&width=1000";
        String fileURL ="https://vtv1.mediacdn.vn/thumb_w/650/562122370168008704/2023/11/8/photo1699446582405-16994465826352131158588.jpeg";
        String saveDir ="D:\\Download";

        try{
            URL url = new URL(fileURL);

            // Tạo kết nối để đọc dữ liệu
            URLConnection connection = url.openConnection();

            // Lấy InputStream từ kết nối
            InputStream is = connection.getInputStream();

            // Lấy tên file
            String fileName = fileURL.substring(fileURL.lastIndexOf("/")+1);

            // Kiểm tra thư mục
            File dictionary = new File(saveDir);
            if(!dictionary.exists()){
                dictionary.mkdirs();
            }

            // Tạo ra fileOutputStream
            FileOutputStream fos = new FileOutputStream(saveDir+File.separator+fileName);

            int byteRead;
            byte[] buffer = new byte[4096];
            while((byteRead= is.read(buffer))!=1){
                fos.write(buffer, 0,byteRead);
            }

            System.out.println("File download Success !");
            fos.close();
            is.close();

        }catch (Exception e){

        }
    }
}
