import java.util.Scanner;
public class Stringopr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String a =sc.nextLine();
        sc.close();
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.replace(a, "hello"));
        System.out.println(a.substring(0,6) );
    }
}
