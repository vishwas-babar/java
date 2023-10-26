package oops;

public class Main {
    public static void main(String[] args) {
        
        Atomic_habits atomic_habit = new Atomic_habits("atomic habit", "james clear", 149);

        atomic_habit.getName();
        atomic_habit.setName("gita");
        // atomic_habit.title = "gita";

        System.out.println(atomic_habit.getName());
    }
}
