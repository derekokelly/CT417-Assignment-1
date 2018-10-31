/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.derekokelly.ct417assignment1;

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
}
