
package bloodbank;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    private ArrayList<Donor> AccDonors;
    private ArrayList<Donor> RejDonors;
    private ArrayList<Donation> AccDonation;
    private ArrayList<Donation> RejDonation;
    private MailSender ms;
    
    public Controller(){
        AccDonors = new ArrayList();
        RejDonors = new ArrayList();
        AccDonation = new ArrayList();
        RejDonation = new ArrayList();
        ms = new MailSender();
        for(Donor d : AccDonors)
            d.setCanDonate(false);
    }
    public ArrayList<Donor> getAccDonors(){
        return this.AccDonors;
    }
    
    public ArrayList<Donor> getRejDonors(){
        return this.RejDonors;
    }
    
    public ArrayList<Donation> getAccDonations(){
        return this.AccDonation;
    }
    
    public ArrayList<Donation> getRejDonations(){
        return this.RejDonation;
    }
    public boolean isValid(LocalDate last, LocalDate current){ 
        return last.plusDays(90).isBefore(current);
    }

    public void dateChanged(LocalDate current) {
        for (Donor d : AccDonors) {
            System.out.println("3");
            if (isValid(d.getLastDonation(), current)) {
                System.out.println("2");
                if (!d.CanDonate()) 
                {
                    d.setCanDonate(true);
                    System.out.println("1");
                    ms.send(d.getEmail());
                }
            }
        }
    }

    public void addDonation(boolean accepted, Donor don, LocalDate date) {
        Donation d = new Donation(don, date);
        don.setLastDonation(date);
        if (accepted) {
            AccDonation.add(d);
        } else {
            RejDonation.add(d);
        }
    }

    public Donor getDonor(String email) {
        for (Donor don : AccDonors) {
            if (don.getEmail().equalsIgnoreCase(email)) {
                return don;
            }
        }
        for (Donor don : RejDonors) {
            if (don.getEmail().equalsIgnoreCase(email)) {
                return don;
            }
        }
        return null;
    }

    public void addDonor(boolean accepted, String name, String age, String email, int gender, String mobileNum, LocalDate date, int type,boolean valid) {
        Donor d = new Donor(name, age, email, gender, mobileNum, date, type, accepted);
        if (accepted) {
            AccDonors.add(d);
            if (valid)
                AccDonation.add(new Donation(d, date));
        } else {
            RejDonors.add(d);
            if (valid)
            RejDonation.add(new Donation(d, date));
        }
        
        
       
    }

    public void saveDonations(ArrayList<Donation> arr, String name, String json) {
        Gson gson = new Gson();
        Type type;
        type = new TypeToken<ArrayList<Donation>>() {
        }.getType();
        json = gson.toJson(arr, type);
        try {
            FileWriter fw = new FileWriter(name);
            fw.write(json);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void saveDonors(ArrayList<Donor> arr, String name, String json) {
        Gson gson = new Gson();
        Type type;
        type = new TypeToken<ArrayList<Donor>>() {
        }.getType();
        json = gson.toJson(arr, type);
        try {
            FileWriter fw = new FileWriter(name);
            fw.write(json);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadAccDonations(String name) {
        Gson gson = new Gson();
        Type type;
        try {
            type = new TypeToken<ArrayList<Donation>>() {
            }.getType();
            BufferedReader br = new BufferedReader(new FileReader(name));
            this.AccDonation = new ArrayList(gson.fromJson(br, type));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadRejDonations(String name) {
        Gson gson = new Gson();
        Type type;
        try {
            type = new TypeToken<ArrayList<Donation>>() {
            }.getType();
            BufferedReader br = new BufferedReader(new FileReader(name));
            this.RejDonation = new ArrayList(gson.fromJson(br, type));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadAccDonors(String name) {
        Gson gson = new Gson();
        Type type;
        try {
            type = new TypeToken<ArrayList<Donor>>() {
            }.getType();
            BufferedReader br = new BufferedReader(new FileReader(name));
            this.AccDonors = new ArrayList(gson.fromJson(br, type));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadRejDonors(String name) {
        Gson gson = new Gson();
        Type type;
        try {
            type = new TypeToken<ArrayList<Donor>>() {
            }.getType();
            BufferedReader br = new BufferedReader(new FileReader(name));
            this.RejDonors = new ArrayList(gson.fromJson(br, type));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
