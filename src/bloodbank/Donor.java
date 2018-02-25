    
package bloodbank;

import java.io.Serializable;
import java.time.LocalDate;


public class Donor implements Serializable {
    private String name;
    private String age;
    private String email;
    private int gender;
    private String mobileNum;
    private LocalDate lastDonation;
    private boolean canDonate;
    private int BloodType;
    private boolean accepted;

    public Donor(String name, String age, String email, int gender, String mobileNum, LocalDate last, int BloodType, boolean accepted) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.mobileNum = mobileNum;
        this.canDonate = false;
        this.BloodType = BloodType;
        this.accepted = accepted;
        this.lastDonation = LocalDate.of(last.getYear(), last.getMonth(), last.getDayOfMonth());
    }

    public boolean isAccepted() {
        return accepted;
    }

    public int getBloodType() {
        return BloodType;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }

    public LocalDate getLastDonation() {
        return lastDonation;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCanDonate(boolean canDonate) {
        this.canDonate = canDonate;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastDonation(LocalDate lastDonation) {
        this.lastDonation = lastDonation;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setBloodType(int BloodType) {
        this.BloodType = BloodType;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public boolean CanDonate() {
        return canDonate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Donor))
            return false;
        else if (obj == this)
            return true;
        Donor d = (Donor) obj;
        return this.email.equals(d.email);
    }
    
 
    
}
