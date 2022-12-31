import java.io.*;
import java.io.ByteArrayInputStream;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        byte []b=s.getBytes();
       //we want to write this data into the file
        OutputStream out=new java.io.FileOutputStream("/home/hp/Documents/Alphabet/Alphabet2.txt");
        for(int i=0;i<b.length;i++)
        {
            out.write(b[i]);
        }
        out.close();

    }
}
