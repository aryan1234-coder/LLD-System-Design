import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    private String folderName;

    private List<FileSystem> folders=new ArrayList<>();
    public Folder(String folderName) {

        this.folderName = folderName;

    }

    public void add(FileSystem fs){
        folders.add(fs);
    }
    public void remove(FileSystem fs){
        folders.remove(fs);
    }

    public void showDetails(){
        System.out.println("Folder "+ " "+folderName);
        for(FileSystem fs:folders){
            fs.showDetails();
        }
    }
}
