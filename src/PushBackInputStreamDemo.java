import java.io.*;
import java.io.ByteArrayInputStream;

public class PushBackInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s="if (a==4) a=0;";
        byte [] buf=s.getBytes();
        //The source is byte array then we are using BytearrayInput Stream as a Source to
        //PushBackInput Stream
        ByteArrayInputStream  bin=new ByteArrayInputStream(buf);
        PushbackInputStream pin=new PushbackInputStream(bin);
        int c;
        while((c=pin.read()) !=-1) {
            switch (c) {
                case '=': {
                    if ((c=pin.read()) == '=')
                    {
                        System.out.println("equal");
                    }
                    else
                    {
                        System.out.println("***");
                        pin.unread(c);
                    }
                    break;
                }
                default:
                    System.out.println((char)c);
                    break;
            }
        }
    }


}
