import java.util.Scanner;
        
public class ScannerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scanner.nextInt();
        System.out.println("value = "+a);
        
    }
}