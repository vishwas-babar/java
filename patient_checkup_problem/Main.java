package patient_checkup_problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;
        Scanner scanner = new Scanner(System.in);
        int organ_selection;

        while (start) {
            System.out.println("select an organ to perform a operation");
            System.out.println("\t1. right eye \n\t2. left eye \n\t3. stomach \n\t4. heart \n\t5. hands \n\t6. quite");
            
            organ_selection = scanner.nextInt();

            switch (organ_selection) {
                case 1:
                    RightEye righteye = new RightEye("right eye", "normal", "black blue");
                    righteye.getEyeStatus();
                    break;
                case 2:
                    LeftEye lefteye = new LeftEye("left eye", "critical", "blue");
                    lefteye.getEyeStatus();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    start = false;
                    break;
            
                default:
                    break;
            }

        }

        System.out.println("thanks for using our services!");
    }
    
}
