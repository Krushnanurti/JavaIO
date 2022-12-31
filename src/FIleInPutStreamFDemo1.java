import java.io.*;
public class FIleInPutStreamFDemo1 {
    public static void main(String[] args) throws IOException {
        //way1 Constructor accepting filepath directly.
        //if file is not found then it will throw file not found exception.
        //FileInputStream fin=new FileInputStream("/home/hp/Documents/Alphabet/Alphabet1.txt");*
        //now we can perform all operations on this object.
      //  System.out.println("Available bytes " + fin.available());*
      //  System.out.println("channel for the file " + fin.getChannel());*
        //get channel method returns unique file channel object associated with file input stream.
        //we have three type of read methods first read method reads the default bytes in one time
        //System.out.println(fin.read());*
       // System.out.println(fin.available());*
        //Star means useful things
       // fin.close();*
        //////////////////////////////////////////////////////////////////////////////////////////////
        //here we connected to our file data source
        //Way2 Constructor accepting the file object as an argument.
        //and we can access file using three ways of the constructor
        //way1 path in string
        //way2 directory path and name of the file in string format
        //way3 object of the file directory and name of the file in string format
        File f1=new File("/home/hp/Documents/Alphabet/Alphabet1.txt");//way1
        File f2=new File("/home/hp/Documents/Alphabet","Alphabet.txt");//way2
        File f3=new File("/home/hp/Documents/Alphabet");//way3
        File f4=new File(f3,"Alphabet.txt");
        //Now we are creating  Input put stream

        FileInputStream fin=new FileInputStream(f1);//here we just pass the object of the file this will work
        byte [] b=new byte[100];//jevde bytes pass krsil tevde bytes read karte.
        System.out.println(fin.available());
        System.out.println(fin.read(b,2,50));
        System.out.println( fin.available());
        fin.close();




    }
}
