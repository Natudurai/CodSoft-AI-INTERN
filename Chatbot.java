import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Hello! I'm your chatbot. Type 'exit' to end the conversation.");
        
        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Chatbot: Hello! How can I help you?");
            } else if (input.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, but I'm here to help you!");
            } else if (input.contains("your name")) {
                System.out.println("Chatbot: I'm your friendly chatbot!");
            } else if (input.contains("time")) {
                System.out.println("Chatbot: I'm not equipped to tell time, but I can help with other questions!");
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that.");
            }
        }
        
        scanner.close();
    }
}
