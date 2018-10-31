package ie.nuigalway.derekokelly.ct417assignment1;

/**
 *
 * @author derek
 */
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Student {
    private String name, age, id;
    private DateTime dob;
    private DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyy");
    
    public Student(String name, String age, String id, DateTime dob) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
    }
    
    public String getUsername() {
        return this.name.replaceAll("\\s","") + this.age; // removes whitespace from name
    }
    public String getName() {
        return this.name;
    }
    
    public String getAge() {
        return this.age;
    }
    
    public String getID() {
        return this.id;
    }
    
    public DateTime getDateOfBirth() {
        return this.dob;
    }
    
}
