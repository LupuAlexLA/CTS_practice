package _01_Singleton.test;

import java.util.Random;

public class License implements AbstractTourismLicense {
    private String number;
    private boolean isNumberSet = false;
    private static License instance = null;

    private License() {}

    public static synchronized License getInstance() {
        if(instance == null) {
            instance = new License();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String number){
        if(isNumberSet) {
            throw new LicenseException("License number can only be set once!");
        }
        this.number = number;
        this.isNumberSet = true;
        System.out.println("the license was set: " + number);
    }

    @Override
    public String getLicenseNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "License{" +
                "number='" + number + '\'' +
                ", isNumberSet=" + isNumberSet +
                '}';
    }
}
