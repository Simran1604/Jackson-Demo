import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) throws Exception {

        try {
            // Create an ObjectMapper with field-level access
            ObjectMapper mapper = new ObjectMapper();

            Person person = new Person("John Doe", 30, "Software Engineer");

            // Serialize object to JSON with customized properties
            mapper.writeValue(new File("person.json"), person);

            // Deserialize JSON to object with customized properties
            Person deserializedPerson = mapper.readValue(new File("person.json"), Person.class);

            System.err.println("Name:" + deserializedPerson.getName());

        } catch (final Exception e) {
            e.printStackTrace();

        }

    }
}
