package inheritance;

public class Academician extends Employee {
    private String title;
    private String department;

    public Academician(String nameSurname, String phoneNumber, String eMail, String title, String department) {
        super(nameSurname, phoneNumber, eMail);
        this.title = title;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void enterClass() {
        System.out.println(this.getNameSurname().toUpperCase() + " derse girdi.");
    }

    @Override
    public void enter() {
        System.out.println(this.getNameSurname().toUpperCase() + " A kapısından giriş yaptı.");
    }


}
