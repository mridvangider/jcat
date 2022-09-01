import org.jetbrains.annotations.NotNull;

import java.io.*;

public class Program {
    public static void readFileInputStream(String fileName) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
        int i;
        while((i = bis.read()) != -1) {
            System.out.print((char)i);
        }
    }

    public static void readFileReader(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = br.readLine()) != null) {
            System.out.print(line+"\n");
        }
    }

    public static void main(String @NotNull [] args) throws Exception {
        String readMode = args[0];
        String fileName = args[1];
        
        if (readMode.equals("-c")) {
            Program.readFileReader(fileName);
        } else if (readMode.equals("-b")) {
            Program.readFileInputStream(fileName);
        } else {
            System.out.print("Invalid read mode option!");
        }
    }
}
