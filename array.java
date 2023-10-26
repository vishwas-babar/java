public class array {

    static void foreach(String names[]){
        for(String i:names){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String names[] = {"karan", "arjun", "andy", "mandy", "shandy"};
        
        // it is for each loop widely used in android development
        
       foreach(names);
    }
}
