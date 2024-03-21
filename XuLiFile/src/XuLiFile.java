import java.io.File;
import java.io.IOException;

public class XuLiFile {
    public static void taoThuMuc(String path) {
        File file = new File(path);

        if (!file.exists()) { //hàm exists kiểm tra có tồn tại hay chưa

            //tạo thư mục bằng hàm mkdir

            //file.mkdir();

            //Ham tao nhieu thu muc cung mot luc .mkdirs

            file.mkdirs();

        } else {
            System.out.println("Thư mục đã tồn tại !");
        }
    }

    public static void taoTapTin(String path) {
        //Khai báo file mới
        File file = new File(path);

        if (!file.exists()) { //hàm exists kiểm tra có tồn tại hay chưa

            try {
                file.createNewFile();              //hàm tạo ra một tập tin mới
                // Những tình huống lỗi có thể xảy ra khi tạo file mới
            /*
            1. Không có quyền tạo tập tin
            2. Đường dẫn(path) không chính xác
            3. Không dủ dung lượng tạo file
             */

                //file.mkdir();  //tạo thư mục bằng hàm mkdir


                //file.mkdirs(); //Ham tao nhieu thu muc cung mot luc .mkdirs

            } catch (IOException e) {
                System.out.println("Gặp lỗi IO Exception!");
                e.printStackTrace();
            }
        } else {
            System.out.println("Tập tin đã tồn tại !");
        }
    }

    public static void delete (String path) {
        //*
        // Thư mục rỗng thì xóa được có nội dung thì không xoa được
        //*
        File file = new File(path);

        if(file.exists()){
            file.delete();  //=> xóa
            //file.deleteOnExit(); // xóa nếu tập tin có tồn tại
        }else{
            System.out.println("Tập tin / thư mục không tồn tại");
        }
    }

    public static void deleteAll (String path) {
        //*
        // Thư mục rỗng thì xóa được có nội dung thì không xoa được
        //*
        File file = new File(path);

        if(file.exists()){
            // Sử dụng đệ quy

            if(file.isDirectory()) { // hàm kiểm tra coi file có phải là thư mục hay không
                // Xóa nội dung bên trong
                File[] files = file.listFiles(); //Lấy danh sách các file con

                for(File f : files)  { //foreach
                    deleteAll(f.getAbsolutePath()); //Tiếp tục đệ quy để xóa dựa trên đường tuyệt đối
                }
            }
            //Xóa chính bản thân thư mục đó
            if(file.delete()){
                System.out.println("Xóa thành công thư mục" + path);
            }else {
                System.out.println("Không xóa thành công thư mục" +path);
            }
        }else{
            System.out.println("Tập tin / thư mục không tồn tại");
        }
    }

    public static void hienThiCayThuMucChiTiet(String path, int level ){
        File file = new File(path);
        for(int i=0; i<level; i++){
            System.out.print("____");
        }
        if(file.isFile()) // Kiểm tra xem file có phải tập tin hay không
        {
            System.out.println("|__"+file.getName()); // lấy ra tên file
        }else
        {
            System.out.println("|__"+file.getName());

            //Tiếp tục đệ quy để thực hiện
            File[] files = file.listFiles();
            for(File f: files){
                hienThiCayThuMucChiTiet(f.getAbsolutePath(), level+1);
            }
        }
    }

    public static void kiemTraThongTin(String path) {
        File file = new File(path);
        if(!file.exists()){
            System.out.println("File không tồn tại");
            return;
        }
        System.out.println("Thông Tin Chi Tiết:");

    }

    public static void hienThiCayThuMuc(String path){
        File file = new File(path);

        if(!file.exists()) {
            System.out.println("File không tồn tại");
            return; // Dừng luôn hàm la
        }

        hienThiCayThuMucChiTiet(path, 0);
    }

    public static void main (String[] args){
        //String path = "D:\\temp";
        //String path = "D:\\temp\\baitap\\BAITAP.DOCX";
        // XuLiFIle.taoTapTin(path);

        // String path = "D:\\temp\\dir1\\dir2\\dir3";
        //XuLiFIle.taoThuMuc(path);

        //String path = "D:\\temp - Copy\\baitap\\BAITAP.DOCX";
        //XuLiFIle.delete(path);

        //String path = "D:\\temp\\dir1\\dir2\\dir3";
        //XuLiFIle.delete(path);

        //String path = "D:\\temp";
        //XuLiFIle.deleteAll(path);

        //XuLiFIle.hienThiCayThuMuc("D:\\temp");
    }
}
