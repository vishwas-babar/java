import java.util.*;

public class random_game {
    public static void main(String[] args) {

        System.out.println("Welcome in this game");

        System.out.print("enter your name - ");
        Scanner scanner = new Scanner(System.in);
        String user_name = scanner.next();

        System.out.println("welcome! " + user_name + " in this game,");
        System.out.println(
                "in this game you have guess correct digit, if you guess 5 times wrong digits then game is over!");

        while (true) {
            System.out.println("so should we start the game now ? yes or no ");
            boolean start_game = false;
            String start_game_input = scanner.next();
            if (start_game_input.equalsIgnoreCase("yes")) {
                start_game = true;
            } else if (start_game_input.equalsIgnoreCase("no")) {
                System.out.println("when you  are ready then type yes");
            } else {
                System.out.println("invalid input");
            }

            if (start_game) {

                int chance = 5;
                while (chance != 0) {
                    // now generate the random number
                    Random rand = new Random();
                    int random_num = rand.nextInt(10);

                    // System.out.println("random number is - "+ random_num);
                    System.out.print("guess the correct digit - ");
                    int guess_digit = scanner.nextInt();
                    if (guess_digit == random_num) {
                        System.out.println("you gueessed the right number! congrats\nyou won the game");
                        break;
                    } 
                    else if (guess_digit != random_num) {
                        chance--;
                        System.out.println("wrong! " + chance + " chance remaining");
                    }
                }
                if (chance==0) {
                    System.out.println("game over!\n try next time");
                }
            }
        }

    }

}
