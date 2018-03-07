package Chapter2.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with Chapter2.io
 * Description :
 * User : cai-zj
 * Date : 18-3-5
 * Time : 下午10:51
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        File file = new File("./Chapter2/io/file.txt");
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("this is test");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(new File("./Chapter2/io/file.txt"));
        char[] a = new char[60];
        fileReader.read(a);
        for (char c : a) {
            System.out.println(c);
        }
        fileReader.close();

    }

}
