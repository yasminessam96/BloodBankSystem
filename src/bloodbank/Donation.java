package bloodbank;

import java.io.Serializable;
import java.time.LocalDate;

public class Donation implements Serializable {
    
    private Donor d;
    private LocalDate date;
    

    public Donation(Donor d, LocalDate date) {
        this.d = d;
        this.date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
    }

    public Donor getD() {
        return d;
    } 
    
    public LocalDate getDate(){
        return this.date;
    }
}
