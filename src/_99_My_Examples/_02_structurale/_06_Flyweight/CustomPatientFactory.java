package _99_My_Examples._02_structurale._06_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomPatientFactory {
    private Map<Integer, IReteta> map = new HashMap<>();

    public IReteta getCustomPatient(int key) {
        if(!map.containsKey(key)) {
            MedicalAdvice medicalAdvice = new MedicalAdvice(key, "2l", 8);
            map.put(key, medicalAdvice);
            System.out.println("Medical advice created");
        }
        else {
            System.out.println("Medical advice reused");
        }
        return map.get(key);
    }
}
