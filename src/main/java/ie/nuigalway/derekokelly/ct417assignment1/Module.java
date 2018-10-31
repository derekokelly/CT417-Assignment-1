package ie.nuigalway.derekokelly.ct417assignment1;

import java.util.ArrayList;

/**
 *
 * @author derek
 */
public class Module {
    
    private String name, id;
    private ArrayList<Student> studentList;
    
    public Module(String name, String id, ArrayList<Student> list) {
        this.name = name;
        this.id = id;
        this.studentList = list;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getID() {
        return this.id;
    }
    
    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }
    
    public void addStudent(Student s) {
        this.studentList.add(s);
    }
    
    @Override
    public String toString() {
        String info = "";
        for (Student s : studentList) {
            info += s.getUsername();
        }
        return this.name + " " + this.id + "\n" + info + "\n";
    }
}
