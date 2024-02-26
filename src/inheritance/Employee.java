package inheritance;

public class Employee {
    private String nameSurname;
    private String phoneNumber;
    private String eMail;

    public Employee(String nameSurname, String phoneNumber, String eMail) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void enter() {
        System.out.println(this.nameSurname.toUpperCase() + " giriş yaptı");
    }

    public void quit() {
        System.out.println(this.nameSurname.toUpperCase() + " çıkış yaptı.");
    }

    public void enterDiningHall() {
        System.out.println(this.nameSurname.toUpperCase() + " yemekhaneye girdi.");
    }


    public static void getEnteredUsers(Employee[] employees){
        for (Employee employee : employees) {
            employee.enter();
        }
    }

}
