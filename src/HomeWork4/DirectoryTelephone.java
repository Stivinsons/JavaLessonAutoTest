package HomeWork4;

import java.util.*;

public class DirectoryTelephone {
    HashMap<String, String> phoneDirectory = new HashMap<>();


    public void add(String surname, String telephoneNumber) {
        if (phoneDirectory.containsKey(surname)){
            phoneDirectory.put(surname, phoneDirectory.get(surname) + ", " + telephoneNumber);
        }else{
            phoneDirectory.put(surname, telephoneNumber);
        }


    }

    public String get(String surname) {
        return phoneDirectory.get(surname);
    }
    public void allHashMapOutput(){
        System.out.println(phoneDirectory);
    }

    public static void main(String[] args) {
        DirectoryTelephone myPhoneDirectory = new DirectoryTelephone();
        myPhoneDirectory.add("Витальев", ("79099999999"));
        myPhoneDirectory.add("Олегов", ("79098888888"));
        myPhoneDirectory.add("Александров", ("79097777777"));
        myPhoneDirectory.add("Витальев", ("79096666666"));
        myPhoneDirectory.add("Витальев", ("79095555555"));
        System.out.println(myPhoneDirectory.get("Витальев"));
        myPhoneDirectory.allHashMapOutput();
    }
}
