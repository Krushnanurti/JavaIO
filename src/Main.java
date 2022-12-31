import java.io.File;

public class Main {
    public static void main(String[] args) {
//CONSTRUCTOR 1
//here we are providing the path of the file in string format so that file
        //class can access it.
        //txt extension is compulsory for the accessing
        File file1=new File("/home/hp/Documents/Alphabet/Alphabet1.txt");
        System.out.println("length of the file " + file1.length());
        System.out.println("file1 is a file" + file1.isFile());
        System.out.println("file1 is exits " + file1.exists());
        //this is the way we can access the file details
        System.out.println("******************************************************************************");
        //Way2 Constructor String Directory path and file name in String.
        File file2=new File("/home/hp/Documents/Alphabet","Alphabet1.txt");
        System.out.println("Name of te file is " + file2.getName());
        System.out.println("Parent name of the file is " + file2.getParent());
        System.out.println("File is directory " + file2.isDirectory());


        //Way3 is file Directory cha object and fileName.
        System.out.println("********************************************************************************");
        File file3=new File("/home/hp/Documents/Alphabet");
        //file3 is the object of the file directory.
        //we are passing that object as an argument to the constructor.
        //he is asking the object.
        File file4=new File(file3,"Alphabet1.txt");
        System.out.println("Name of the file is" + file4.getName());
        System.out.println("Length of the file is " + file4.length());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        //this only to get the list of the files under a directory
        File file5=new File("/home/hp/Documents/Alphabet");
        String []holdingList=file5.list();
        System.out.println("list of the files under a DIRECTORY " + holdingList);





    }
}