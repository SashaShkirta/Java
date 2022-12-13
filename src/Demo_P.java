public class Demo_P {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Person #1:");
        person1.input();
        System.out.println("Person #2:");
        person2.input();
        System.out.println("Person #3:");
        person3.input();
        System.out.println("Person #4:");
        person4.input();
        System.out.println("Person #5:");
        person5.input();

        System.out.println("Information about persons:");
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        person1.changeName( "ChangedFirst",  "ChangedSecond");
        person1.output();

    }
}
