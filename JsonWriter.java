import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class JsonWriter extends Writer {

    public JsonWriter(HashMap<String, Float> students) {
        super(students);
    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter("students.json");
            StringBuilder stringBuilder = new StringBuilder();
            writer.write("{\n");
            int count = students.size();

            for (HashMap.Entry<String, Float> pair : students.entrySet()) {
                count = count - 1;
                stringBuilder.append("\"" + pair.getKey() + "\":" + pair.getValue());
                if (count != 0) {
                    stringBuilder.append("," + "\n");

                } else {
                    stringBuilder.append("\n");
                }
                String completedString = stringBuilder.toString();
                try {
                    writer.write(completedString);
                    stringBuilder.delete(0, stringBuilder.length());
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }

            }
            ;
            writer.write("}\n");
            writer.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
