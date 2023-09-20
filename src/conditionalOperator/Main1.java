package conditionalOperator;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        int a = new Scanner(System.in).nextInt();
        if(a < 0){
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }

        String militaryCommissar = ", явитесь в военкомат";
        String s1 = new Scanner(System.in).nextLine();
        int a1 = new Scanner(System.in).nextInt();
        if(a1 >= 18 && a1 <= 28 ){
            System.out.println(s1 + militaryCommissar);
        }

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
            if (age >= 6)
                System.out.println("нужно ходить в школу");
        }else{
            System.out.println("пора в институт");

        }
    }
}
