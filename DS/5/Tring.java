import java.util.*;

public class Tring {
    private static int token = 0; // Shared token

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes want in ring");
        int n = sc.nextInt();

        System.out.println("Ring formed is as below");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("0");

        int ch = 0;
        do {
            System.out.println("Enter sender:");
            int sender = sc.nextInt();

            System.out.println("Enter receiver:");
            int receiver = sc.nextInt();

            System.out.println("Enter data:");
            int data = sc.nextInt();

            System.out.println("Token passing: ");
            
            synchronized (Tring.class) {
            
                for (int i = token; i < sender; i++) {
                    System.out.print(" " + i + "->");
                }
                System.out.println(" " + sender);

                System.out.println("Sender:" + sender + " sending data:" + data);

                for (int i = sender; i != receiver; i = (i + 1) % n) {
                    System.out.println("Data:" + data + " Forward by:" + i);
                }
                System.out.println("Receiver:" + receiver + " received the data:" + data);

                token = sender;
            }

            System.out.println("\n Do you want to continue:");
            ch = sc.nextInt();
        } while (ch == 1);
    }
}