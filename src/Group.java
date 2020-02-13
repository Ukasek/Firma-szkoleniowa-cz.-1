import java.util.Scanner;

public class Group {
    String name;
    Instructor instructor;
    Student[] students;

    public Group(String name, Instructor instructor, Student[] students) {
        this.name = name;
        this.instructor = instructor;
        this.students = students;

    }

    public static Student[] studentsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba uczniów: ");
        int amount = scanner.nextInt();
        Student[] studentsArray = new Student[amount];
        return studentsArray;
    }

    public static Group createGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwa grupy: ");
        String name = scanner.nextLine();
        System.out.println("Instruktor prowadzący: ");
        Instructor instructor = Instructor.createInstructor();
        Student[] students = studentsArray();
        return new Group(name, instructor, students);

    }

    public String getInfoGroup() {
        return name + ", " + instructor + ", " + instructor;
    }


}
