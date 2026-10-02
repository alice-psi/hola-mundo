import java.util.Scanner;

public class HolaMundo{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = data.nextLine();
        System.out.println("What group do you belong to?");
        String group = data.nextLine();
        System.out.println("Your name is " + name + " and you belong to " + group);
    }
}
