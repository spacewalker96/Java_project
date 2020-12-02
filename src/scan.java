import java.util.Scanner;  // Import the Scanner class

class MyName {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        String Name = myObj.nextLine();
        System.out.println("Bonjour " + Name);
    }
}