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
        
        String expectedResult = "JohnSmith21\n";
        String actualResult = s1.getUsername();
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void moduleTest() {
        DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime dob = format.parseDateTime("09/12/1997");
        Student s1 = new Student("John Smith", "21", "15123456", dob);
        
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        Module module1 = new Module("Software Engineering", "CT417", studentList);
        
        String expectedResult = "";
        for (Student s : studentList) {
            expectedResult += module1.getName() + " " + module1.getID() + "\n" + "Students: \n" + s.getUsername() + "\n";
        }
        
        String actualResult = module1.toString();
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void programmeTest() {
        
        DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime startDate = format.parseDateTime("01/09/2018");
        DateTime endDate = format.parseDateTime("31/08/2019");
        
        ArrayList<Module> eceModules = new ArrayList<>();
        ArrayList<Module> csitModules = new ArrayList<>();
        
        DateTime dob1 = format.parseDateTime("01/01/1997");
        DateTime dob2 = format.parseDateTime("09/12/1997");
        DateTime dob3 = format.parseDateTime("16/02/1996");
        
        Student s1 = new Student("John Smith", "21", "15123456", dob1);
        Student s2 = new Student("Mary White", "20", "15654321", dob2);
        Student s3 = new Student("Joe Soap", "22", "14123456", dob3);
        
        ArrayList<Student> ct417StudentList = new ArrayList<>();
        ct417StudentList.add(s1);
        ct417StudentList.add(s2);
        
        ArrayList<Student> ee451StudentList = new ArrayList<>();
        ee451StudentList.add(s1);
        ee451StudentList.add(s3);
        
        Module module1 = new Module("Software Engineering", "CT417", ct417StudentList);
        Module module2 = new Module("SOC", "EE451", ee451StudentList);
        
        eceModules.add(module1);
        eceModules.add(module2);
        csitModules.add(module1);
        
        Programme p1 = new Programme("ECE", eceModules, startDate, endDate);
        Programme p2 = new Programme("CSIT", csitModules, startDate, endDate);
        
        System.out.println(p1.toString());
        System.out.print(p2.toString());
    }
}
