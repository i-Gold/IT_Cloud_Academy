package OOP_projects;

public class LabWork__2_2_4 {
    public static void main(String[] args) {

        Person person1 = new Person();

        System.out.println("First person:");
        person1.toSetPerson("Arnold", "Schwarzenegger", 70, "male", 1007119900);
        System.out.println(person1);

        Person person2 = new Person();

        System.out.println("Second person:");
        person2.toSetPerson("David", "Blaine", 44);
        System.out.println(person2);
    }
}

class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void toSetPerson(String firstName){
        this.firstName = firstName;
    }

    public void toSetPerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void toSetPerson(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void toSetPerson(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void toSetPerson(String firstName, String lastName, int age, String gender, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}