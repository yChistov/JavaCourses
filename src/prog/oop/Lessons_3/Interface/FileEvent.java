package prog.oop.Lessons_3.Interface;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded() {
        System.out.println("File added");
    }
}
