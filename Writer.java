import java.util.HashMap;

public abstract class Writer {
    protected HashMap<String, Float> students = new HashMap<String, Float>();

    public Writer(HashMap<String, Float> students) {
        this.students = students;
    }

    public abstract void writeFile();

}