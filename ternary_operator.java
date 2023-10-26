public class ternary_operator {
    public static void main(String[] args) {
        int a=55,b=344, c=152;
        int max= (a>b)?((a>c)?a:c):((b>c)?b:c);

    
        System.out.println(max);
    }
}
