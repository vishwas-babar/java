package oops;

public class Books {
    private String title;
    private String author;
    private int price;

    public Books(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setName(String name){
        this.title = name;

    }

    public String getName(){
        return this.title;
    }

    



}
