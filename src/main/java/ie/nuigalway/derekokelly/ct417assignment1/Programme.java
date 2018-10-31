package ie.nuigalway.derekokelly.ct417assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author derek
 */
public class Programme {
    
    private String name;
    private ArrayList<Module> modules;
    private DateTime startDate, endDate;
    
    private DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyyy");
    
    public Programme(String name, ArrayList<Module> modules, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Module> getModules() {
        return this.modules;
    }
    
    public DateTime getStartDate() {
        return this.startDate;
    }
    
    public DateTime getEndDate() {
        return this.endDate;
    }
    
    @Override
    public String toString() {
        String info = "";
        
        for (Module m : this.modules) {
            info += m.toString();
        }
        return "Programme: " + this.getName() + "\nModules: \n" + info + "Start date: " + this.getStartDate() + "\nEnd date: " + this.getEndDate() + "\n";
    }
    
}
