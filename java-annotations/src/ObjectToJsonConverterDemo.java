import model.Person;
import annotation.processor.ObjectToJsonConverter;

public class ObjectToJsonConverterDemo {

    public static void main(String[] args) {
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        Person person = new Person("niraj", "kumar", "34");
        String jsonString = serializer.convertToJson(person);
        System.out.println(jsonString);
        //expected result --> {"personAge":"34","firstName":"niraj","lastName":"kumar"}


        Object obj = new Object();
        serializer.convertToJson(obj);
        //expected result --> JsonSerializationException
    }
}