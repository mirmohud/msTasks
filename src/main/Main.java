
package main;
import beans.Student;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("""
                    What do you want do?
                    1. Register Student
                    2. Show all students
                    3. Find students
                    4. Update Students
                    5. Exit""");
            if (menu == 1) {
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                StudentUtil.findStudentsAndPrint();
            } else if (menu == 4) {
                StudentUtil.updateStudent();
            } else if (menu == 5) {
                break;
            }
        }
    }
}