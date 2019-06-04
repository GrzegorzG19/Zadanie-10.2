import java.util.Scanner;

public class Method {
    static Scanner scan = new Scanner(System.in);

    public static int[] odw(int[] tab) {
        int a;
        do {
            System.out.println("Podaj ilośc elementów tablicy do odwrócenia");
            a = scan.nextInt();
            if (a > tab.length) {
                System.out.println("argument jest większy niż wielkość tablicy, błąd");
            }
        } while (a > tab.length);
        int b = a - 1;
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
        }


        for (int i = 0; i <= a - 1; i++) {

            tab2[i] = tab[b];
            b--;

        }

        return tab2;
    }

    public static int[] uzup(int[] tab) {
        System.out.println("podaj elementy tablicy");
        do {

            for (int i = 0; i < tab.length; i++) {
                do {
                    tab[i] = scan.nextInt();

                } while (tab == null);


            }
            if (tab == null) {
                System.out.println("tablica nie może być nullem");
            }
        } while (tab == null);

        return tab;
    }
}
