package Vd4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> students = new ArrayList<>(); // Sử dụng List thay vì mảng để quản lý sinh viên
    private static Scanner scanner = new Scanner(System.in); // Khai báo scanner là biến instance

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    sortStudentByGPA();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");
                    break;
            }
        } while (choice != 0);
    }

    // Các phương thức quản lý sinh viên ở đây.

    private static void addStudent() {
        // Thực hiện logic thêm sinh viên vào danh sách sinh viên
        // Ví dụ:
        Student student = new Student(); // Cần thêm logic nhập thông tin sinh viên từ người dùng
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void editStudentById() {
        // Thực hiện logic sửa thông tin sinh viên theo ID
        // Ví dụ:
        System.out.print("Enter student ID to edit: ");
        int studentId = scanner.nextInt();
        // Cần thêm logic tìm và sửa thông tin sinh viên theo ID
    }

    private static void deleteStudentById() {
        // Thực hiện logic xóa sinh viên theo ID
        // Ví dụ:
        System.out.print("Enter student ID to delete: ");
        int studentId = scanner.nextInt();
        // Cần thêm logic tìm và xóa sinh viên theo ID
    }

    private static void sortStudentByGPA() {
        // Thực hiện logic sắp xếp sinh viên theo GPA
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA.");
    }

    private static void sortStudentByName() {
        // Thực hiện logic sắp xếp sinh viên theo tên
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

    private static void showStudents() {
        // Thực hiện logic hiển thị danh sách sinh viên
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
