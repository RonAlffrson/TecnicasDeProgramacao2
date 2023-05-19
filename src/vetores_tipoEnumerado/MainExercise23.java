package vetores_tipoEnumerado;

import java.util.Scanner;

public class MainExercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //23-------------------------------------------------------------------------
        System.out.print("Type the number of students in the class: ");
        int studentsNumber = scanner.nextInt();
        double[] students;
        students = new double[studentsNumber];
        double avarageGrade = 0;
        for (int i = 0; i < studentsNumber; i++) {
            System.out.printf("Grade from student %d: ", i);
            students[i] = scanner.nextDouble();
            avarageGrade += students[i];
        }

        avarageGrade = avarageGrade / studentsNumber;
        System.out.println("Grades above average:");
        for (int i = 0; i < studentsNumber; i++) {
            if (students[i] >= avarageGrade) System.out.printf("student %d;\n", i);

        }
    }
}
