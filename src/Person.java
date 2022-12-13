import java.util.Scanner;
import java.time.YearMonth;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    int currentYear = YearMonth.now().getYear();

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return currentYear - this.getBirthYear();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Name: ");
        this.setFirstName(sc.nextLine());
        System.out.println("Input Last Name: ");
        this.setLastName(sc.nextLine());
        System.out.println("Input Birthday Year: ");
        this.setBirthYear(sc.nextInt());
    }

    public void output() {
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Age: " + this.getAge());
        System.out.println("-------------------------------");
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
