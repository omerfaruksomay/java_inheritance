package inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ömer Faruk Somay", "12312412412", "omersomay@gmail.com");
       /* employee.enter();
        employee.quit();*/

        Academician academician = new Academician("Faruk Somay", "1231231232", "omersomay@edu.tr", "professör", "engineering");
       /* academician.enter();
        academician.enterClass();
        academician.enterDiningHall();
        academician.quit();*/

        Officer officer = new Officer("Nuray Somay", "12312312321", "nuraysomay@gmail.com", "Human Resources", "Part-timer");
      /*  officer.enter();
        officer.enterDiningHall();
        officer.work();
        officer.quit();*/

        Employee[] employees = {employee, academician, officer};

        Employee.getEnteredUsers(employees);


    }
}
