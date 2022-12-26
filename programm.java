import java.util.HashMap;

public class programm {

    public static void main(String[] args) {
        HashMap<String, Float> students = new HashMap<String, Float>();
        students.put("Дмитрий Диманов", 4.8f);
        students.put("Владислав Владонов", 4.4f);
        students.put("Ирина Ирова", 5.0f);
        // students.put("Валерия Валерчикова", 2.6f);
        // students.put("Вячеслав Славиков", 3.9f);
        // students.put("Анастасия Настиева", 4.3f);
        TextWriter textWriter = new TextWriter(students);
        textWriter.writeFile();
        JsonWriter jsonWriter = new JsonWriter(students);
        jsonWriter.writeFile();
        XmlWriter xmlWriter = new XmlWriter(students);
        xmlWriter.writeFile();
    }

}
