package OOP_projects.Labs__2_4;


public class LabWork__2_4_4 {
    public static void main(String[] args) {

        MyEmployee firstEmployee = new MyEmployee("Anatoly", "Davidovich",
                                                "driver", 1448434344);
        MyEmployee secondEmployee = new MyEmployee("Andrey", "Belinsky",
                                                "project manager", 448434344);

        System.out.println(MyEmployee.getNumberOfEmployees());
    }
}

class MyEmployee {

    private String firstName;
    private String lastName;
    private String occupation;
    private long phoneNumber;
    private static int numberOfEmployees;

    public MyEmployee(){
        numberOfEmployees++;
    }

    public MyEmployee(String firstName, String lastName, String occupation, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}