public class File implements FileSystem{

    private String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println("----File "+ " "+fileName);
    }
}
