//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileSystem file1=new File("Resume.docs");
        FileSystem file2=new File("photo.jpg");

//        FileSystem file3=new File("photo3.jpg");

        Folder folder1=new Folder("My Documents");
        folder1.add(file1);
        folder1.add(file2);

        FileSystem file3=new File("photo3.jpg");
       Folder folder2=new Folder("Desktop");




       folder1.remove(file1);

        folder2.add(file3);

        folder2.add(folder1);

        folder2.showDetails();


    }
}