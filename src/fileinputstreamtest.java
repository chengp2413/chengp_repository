import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputstreamtest {
    public static void main(String[] args) {
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("D:/test/123.txt");
//            System.out.println("文件存在，文件流开启成功");
//            int a = fis.read();
//            System.out.println("文件第一个字节" + (char) a);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("文件不存在");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("读取文件字节失败");
//        } finally {
//            try {
//                int b = fis.read();
//                System.out.println("文件第二个字节" + (char) b);
//                System.out.println("文件流未关闭");
//            } catch (IOException e) {
//                e.printStackTrace();
//                System.out.println("文件流已关闭");
//            }
//        }
//        System.out.println("程序结束");

        FileInputStream fis2 = null;
        try (FileInputStream fis = new FileInputStream("D:/test/123.txt")) {
            fis2 = fis;
            System.out.println("文件存在，文件流开启成功");
            int a = fis2.read();
            System.out.println("文件第一个字节" + (char) a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                int b = fis2.read();
                System.out.println("文件第二个字节" + (char) b);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件流已关闭");
            }
        }

    }
}
