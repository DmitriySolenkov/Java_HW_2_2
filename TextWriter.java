import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class TextWriter extends Writer {

    public TextWriter(HashMap<String, Float> students) {
        super(students);
    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter("students.txt");
            StringBuilder stringBuilder = new StringBuilder();

            for (HashMap.Entry<String, Float> pair : students.entrySet()) {

                stringBuilder.append(pair.getKey() + " = " + pair.getValue() + "\n");
                String completedString = stringBuilder.toString();
                try {
                    writer.write(completedString);
                    stringBuilder.delete(0, stringBuilder.length());
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }

            }
            ;
            writer.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}