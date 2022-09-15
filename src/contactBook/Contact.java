package contactBook;

import java.util.HashMap;

public class Contact {
    private String name;
    private int phone;

    private HashMap<String, Integer> additionalPhones;

    private String email;

    private HashMap<String, String> additionalEmails;

    public Contact(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        additionalEmails = new HashMap<String, String>();
        additionalPhones = new HashMap<String, Integer>();
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void addOtherEmail(String key, String email){ additionalEmails.put(key, email); }

    public void addOtherNumber(String key, int number){ additionalPhones.put(key, number); }

    public void remOtherEmail(String key){ additionalEmails.remove(key);}

    public void remOtherNumber(String key) {additionalPhones.remove(key);}

    public void setEmail(String email) {
        this.email = email;
    }

    //Pre: otherContact != null
    public boolean equals(Contact otherContact) {
        return name.equals(otherContact.getName());
    }
}
