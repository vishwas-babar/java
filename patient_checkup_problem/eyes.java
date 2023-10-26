package patient_checkup_problem;

import java.util.Scanner;

public class eyes {
    private String name;
    private String condition;
    private String color;

    public eyes(String name, String condition, String color){
        this.name = name;
        this.condition = condition;
        this.color = color;
    }

    public int getEyeStatus() {

        System.out.println("Name: " + this.name);
        System.out.println("medical condition: " + this.condition);
        System.out.println("color: " + this.color);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t1. close the eye");
        int choice = scanner.nextInt();
        if (choice==1) {
            return 0;
        }
        else{
            return 0;
        }

    }
}
