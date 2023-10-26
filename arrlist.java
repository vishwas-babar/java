import java.io.*;
import java.util.*;
public class arrlist {

    int phone;
    String name;

    public static void main(String[] args) {
        

        ArrayList data = new ArrayList();

        data.add(34);
        data.add("vishwas");
        data.add("babar");

        System.out.println(data.contains("Babar"));

        for (Object element:data){
            System.out.println(element);
            
        }

    }
}
