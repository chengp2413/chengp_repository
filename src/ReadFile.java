import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/doc/base64.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        String s = "";
        while ((s =bReader.readLine()) != null) {
            sb.append(s);
            System.out.println("正在读取中...");
        }
        bReader.close();
        String str = sb.toString();
        System.out.println(str);
    }
}
