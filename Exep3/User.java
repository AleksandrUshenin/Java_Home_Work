package Exep3;

public class User {
    private String firetName;
    private String secondName;
    private String name;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public User() {
    }

    public User(String firetName, String secondName, String name, String birthday, String phoneNumber, String gender) {
        this.firetName = firetName;
        this.secondName = secondName;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setFiretName(String firetName) {
        this.firetName = firetName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFiretName() {
        return firetName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "<"+firetName+"><"+name+"><"+secondName+"><"+birthday+"><"+phoneNumber+"><"+gender+">";
    }
}
