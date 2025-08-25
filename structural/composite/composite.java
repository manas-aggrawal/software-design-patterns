import java.util.*;

abstract class FileSystemItem{
    String name;
    private int indent;
    public FileSystemItem(String name){
        this.name = name;
    }
    public void setIndentLevel(int level){
        this.indent = level;
    }
    public int getIndentLevel(){
        return this.indent;
    }
    public void add(FileSystemItem item, int indent) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }
    
    public void remove(FileSystemItem item) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
    abstract public void display();
}
class File extends FileSystemItem{
    private int size;
    public File(String name, int size){
        super(name);
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void display(){
        System.out.println(" ".repeat(getIndentLevel())+name);
    }
    
}
class Directory extends FileSystemItem{
    List<FileSystemItem>d;
    public Directory(String name){
        super(name);
        this.d = new ArrayList<>();
    }
    public void add(FileSystemItem item, int indent){
        d.add(item);
        item.setIndentLevel(indent);
    }
    public void remove(FileSystemItem item){
        d.remove(item);
    }
    public void display(){
        System.out.println(" ".repeat(getIndentLevel())+"/"+name);
        for(FileSystemItem f: d){
            f.display();
        }
    }
}


class Main {
    public static void main(String[] args) {
        FileSystemItem f1 = new File("composite.java", 10);
        FileSystemItem main = new Directory("design-patterns");
        FileSystemItem d1 = new Directory("structural");
        FileSystemItem d2 = new Directory("behavioral");
        main.add(d1, 1);
        main.add(d2, 1);
        d1.add(f1, 2);
        main.display();
    }
}
