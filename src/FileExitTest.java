import java.io.*;

public class FileExitTest {
    public static void main(String[] args) throws IOException {
//        String filePath = "E:/test/ceshi/123.txt";
//        File f = new File(filePath);
//        System.out.println(f.getParentFile().exists());
//        f.getParentFile().mkdirs();
//        System.out.println(f.exists());
//        try {
//            f.createNewFile();
//            System.out.println(f.getParentFile().exists());
//            System.out.println(f.exists());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file  = new File("D:/test/123.txt");
        Writer wrt = new OutputStreamWriter(new FileOutputStream(file),"GBK");
        String str = "中文测试2312";
        wrt.write(str);
        wrt.close();
    }
}
