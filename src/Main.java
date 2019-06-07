import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Wpisz wielkosc tablicy");
        a = scan.nextInt();
        int[] tab = new int[a];
        System.out.println("podaj elementy tablicy");
        Method.uzup(tab);

        int[] tab2 = Method.odw(tab);
        System.out.println();
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
    }
}
