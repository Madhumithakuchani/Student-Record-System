import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private String id;
    private String gender;
    private ArrayList<Integer> marks = new ArrayList<>();
    private ArrayList<String> subjects = new ArrayList<>();
    private ArrayList<String> attendance = new ArrayList<>();

    public Student(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public void addMark(int mark) {
        this.marks.add(mark);
    }

    public void addSubject(String subject) {
        this.subjects.add(subject);
    }

    public void addAttendance(String attendance) {
        this.attendance.add(attendance);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public ArrayList<String> getAttendance() {
        return attendance;
    }
}

class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean quit = false;

        while (!quit) {
            System.out.println("\nStudent Record System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Quit");
            System.out.print("Enter Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Gender (M/F): ");
                    String gender = scanner.nextLine();
                    students.add(new Student(name, id, gender));
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    for (Student student : students) {
                        if (student.getId().equals(studentId)) {
                            System.out.println("\nStudent Details");
                            System.out.println("Name: " + student.getName());
                            System.out.println("ID: " + student.getId());
                            System.out.println("Gender: " + student.getGender());
                            System.out.println("Marks: " + student.getMarks());
                            System.out.println("Subjects: " + student.getSubjects());
                            System.out.println("Attendance: " + student.getAttendance());
                            break;
                        }
                    }
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}