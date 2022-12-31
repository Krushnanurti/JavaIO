import java.io.*;
import java.io.ByteArrayInputStream;

public class SequnceInputStream {
    public static void main(String[] args) throws IOException {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s1="abcdefghijklmnopqrstuvwxyz";
        byte buf1[]=s.getBytes();
        byte buf2[]=s.getBytes();
        ByteArrayInputStream bin1=new ByteArrayInputStream(buf1);
        ByteArrayInputStream bin2=new ByteArrayInputStream(buf2);
     SequenceInputStream sin=new SequenceInputStream(bin1,bin2);
     byte []b=sin.readAllBytes();
        //System.out.println("total no of bytes " + sin.read());
        int c;
        if ((c= sin.read(b)) !=-1)
        {
            System.out.println((char)c);
        }
        sin.close();
        bin1.close();
        bin2.close();
    }
}
