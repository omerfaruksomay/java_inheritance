package inheritance;

public class Lecturer extends Academician {
    private String officeNum;

    public String getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    public Lecturer(String nameSurname, String phoneNumber, String eMail, String title, String department, String officeNum) {
        super(nameSurname, phoneNumber, eMail, title, department);
        this.officeNum = officeNum;
    }

    public void joinMeeting() {
        System.out.println(this.getNameSurname().toUpperCase() + " toplantıya katıldı.");
    }

    public void makeExam() {
        System.out.println(this.getNameSurname().toUpperCase() + " sınav yaptı.");
    }
}
