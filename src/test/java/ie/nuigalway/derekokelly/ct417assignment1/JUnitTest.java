/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.derekokelly.ct417assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derek
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void usernameTest() {
        DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime dob = format.parseDateTime("09/12/1997");
        Student s1 = new Student("John Smith", "21", "15123456", dob);
        
        String expectedResult = "JohnSmith21";
        String actualResult = s1.getUsername();
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void moduleTest() {
        DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime dob = format.parseDateTime("09/12/1997");
        Student s1 = new Student("John Smith", "21", "15123456", dob);
        
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        Module module1 = new Module("Software Engineering", "CT417", studentList);
        
        String expectedResult = "";
        for (Student s : studentList) {
            expectedResult += module1.getName() + " " + module1.getID() + "\n" + s1.getUsername() + "\n";
        }
        
        String actualResult = module1.toString();
        
        assertEquals(expectedResult, actualResult);
    }
}
