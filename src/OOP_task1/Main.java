package OOP_task1;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Maria", 30, "DBA");
        Person per2 = new Person("Den", 40, "Backend developer");
        Person per3 = new Person("Liza", 25, "BA");

        System.out.println("Information about Person1 before changing profession");
        System.out.println("   Name: " + per1.getName() + "  Age: " + per1.getAge() + "  Profession: " + per1.getProfession());
        System.out.println("   Name: " + per2.getName() + "  Age: " + per2.getAge() + "  Profession: " + per2.getProfession());
        System.out.println("   Name: " + per3.getName() + "  Age: " + per3.getAge() + "  Profession: " + per3.getProfession());

        per1.changeProfession("Architect");

        System.out.println("------------------------------------------------------");
        System.out.println("Information about Person1 after changing profession");
        System.out.println("   Name: " + per1.getName() + "  Age: " + per1.getAge() + "  Profession: " + per1.getProfession());

    }
}
