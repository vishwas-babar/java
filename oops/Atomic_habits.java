package oops;

public class Atomic_habits extends Books {

    public Atomic_habits(String title, String author, int price) {
        super(title, author, price);
        //TODO Auto-generated constructor stub
    }

    @Override 
    public void setName(String title) {
        // super.setName(title);
        System.out.println(title + " is the name of this book");
    }
    
}
