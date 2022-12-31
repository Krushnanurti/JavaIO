import java.io.*;
import java.io.ByteArrayInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s="ABCD";
        byte b[]=s.getBytes();
        ByteArrayInputStream bin=new ByteArrayInputStream(b);
        DataInputStream din=new DataInputStream(bin);
        char c;
        System.out.println((c=din.readChar())!=-1);
        System.out.println(c);
    }
}

