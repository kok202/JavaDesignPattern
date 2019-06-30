package designpattern09_composite;

public abstract class Component {
    private String fileName;

    public Component(String fileName) {
         this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
