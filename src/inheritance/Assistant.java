package inheritance;

public class Assistant extends Academician {
    private String officeHour;


    public Assistant(String nameSurname, String phoneNumber, String eMail, String title, String department, String officeHour) {
        super(nameSurname, phoneNumber, eMail, title, department);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void makeQuiz() {
        System.out.println(this.getNameSurname().toUpperCase() + " quiz yaptı.");
    }
}
