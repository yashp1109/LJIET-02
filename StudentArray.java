package test;


import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        int[] marks = new int[5];
        int[] ids = new int[5];

        int count = 0;
        do {
            System.out.println("Enter details for Student " + (count + 1) + ":");
            System.out.print("Name: ");
            names[count] = scanner.nextLine();

            System.out.print("Marks: ");
            marks[count] = scanner.nextInt();

            System.out.print("ID: ");
            ids[count] = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            count++;

            System.out.println();
        } while (count < 5);

        System.out.println("Student Details:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("ID: " + ids[i]);
            System.out.println();
        }

        scanner.close();
    }
}
