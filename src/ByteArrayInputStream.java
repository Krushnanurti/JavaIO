import java.io.*;
public class ByteArrayInputStream {
    public static void main(String[] args) throws UnsupportedEncodingException {
        File f1 = new File("/home/hp/Documents/Alphabet/Alphabet1.txt");//way1
        File f2 = new File("/home/hp/Documents/Alphabet");//way2
        File f3 = new File("/home/hp/Documents/Alphabet");//way3
        File f4 = new File(f3, "Alphabet.txt");
        String tmp = "aftfjyrdlkuygtudtkoiug";
        byte[] b = tmp.getBytes();
        java.io.ByteArrayInputStream bin=new java.io.ByteArrayInputStream(b);
        System.out.println(bin.read());


    }
}
