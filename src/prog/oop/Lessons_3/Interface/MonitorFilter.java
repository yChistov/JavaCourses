package prog.oop.Lessons_3.Interface;

import java.io.File;
import java.io.FilenameFilter;

public class MonitorFilter {
    File files;
    IFileEvent event;

    public MonitorFilter(File files, IFileEvent event){
        this.files = files;
        this.event = event;
    }

    public void start(){
        while (true){
            File file = new File(String.valueOf(files));
            if (file.exists() && file.isDirectory()) {
                File[] arFiles = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File file, String name) {
                        return name.endsWith(".txt");
                    }
                });
                if (arFiles.length != 0) {
                    event.onFileAdded();
                    System.out.println("txt file was added");
                    break;
                }else {
                    System.out.println("txt file not find");
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Waiting...");
        }
    }
}
