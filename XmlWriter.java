import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class XmlWriter extends Writer {

    public XmlWriter(HashMap<String, Float> students) {
        super(students);
    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter("students.xml");
            StringBuilder stringBuilder = new StringBuilder();
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");

            for (HashMap.Entry<String, Float> pair : students.entrySet()) {
                writer.write("<student>\n");
                stringBuilder.append("<name>" + pair.getKey() + "</name>\n");
                String completedString = stringBuilder.toString();
                try {
                    writer.write(completedString);
                    stringBuilder.delete(0, stringBuilder.length());
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
                stringBuilder.append("<grade>" + pair.getValue() + "</grade>\n");
                String completedString2 = stringBuilder.toString();
                try {
                    writer.write(completedString2);
                    stringBuilder.delete(0, stringBuilder.length());
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
                writer.write("</student>\n");

            }
            ;
            writer.write("</students>");
            writer.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
