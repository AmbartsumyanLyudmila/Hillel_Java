package OOP_task1;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Maria", 30, "DBA");
        Person per2 = new Person("Den", 40, "backend developer");
        Person per3 = new Person("iza", 25, "BA");

        System.out.println("Person1 info");
        System.out.println("Name: " + per1.getName() + "  Age: " + per1.getAge() + "  Profession: " + per1.getProfession());
        System.out.println("Person2 info");
        System.out.println("Name: " + per2.getName() + "  Age: " + per2.getAge() + "  Profession: " + per2.getProfession());
        System.out.println("Person3 info");
        System.out.println("Name: " + per3.getName() + "  Age: " + per3.getAge() + "  Profession: " + per3.getProfession());
    }
}
