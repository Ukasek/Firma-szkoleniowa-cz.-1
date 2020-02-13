import java.util.Scanner;

public class Student extends Person {
    private int id;

    public Student(String firstName, String lastName, int id) {
        setFirstName(firstName);
        setLastName(lastName);
        this.id = id;
    }

    public static Student createNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię studenta: ");
        String firstName = scanner.nextLine();
        System.out.println("Wpisz nazwisko studenta: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj jego numer: ");
        int id = scanner.nextInt();
        return new Student(firstName, lastName, id);
    }

    String getInfoStudent() {
        return getFirstName() + " " + getLastName() + " " + id;
    }
}
