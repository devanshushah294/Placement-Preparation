import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _08_Program {
    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        File myFile = new File("_08_Program.java");
        File newFile = new File("outputFile.txt");
        copyContent(myFile, newFile);
    }
}
