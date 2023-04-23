import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}