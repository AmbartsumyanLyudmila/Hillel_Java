package OOP_task2;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Maria", 30, PersonRole.ENGINEER);
        Person per2 = new Man("Den", 40, PersonRole.ARTIST);
        Person per3 = new Woman("Liza", 25, PersonRole.STUDENT);

        System.out.println("Information about Person1 before changing profession");
        per1.displayInformation();
        per2.displayInformation();
        per3.displayInformation();

        per1.changeProfession(PersonRole.TEACHER);

        System.out.println("------------------------------------------------------");
        System.out.println("Information about Person1 after changing profession");
        per1.displayInformation();

        per2.changeProfession(PersonRole.OTHER);

        System.out.println("------------------------------------------------------");
        System.out.println("Information about Person2=MAN after changing profession");
        per2.displayInformation();

        per3.changeProfession(PersonRole.DOCTOR);

        System.out.println("------------------------------------------------------");
        System.out.println("Information about Person3=WOMAN after changing profession");
        per3.displayInformation();
    }
}
