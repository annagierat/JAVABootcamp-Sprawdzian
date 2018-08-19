import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void list() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista1 = new ArrayList<String>();
        String a;
        int c = 0;
        do {
            System.out.println("Wprowadz znak: ");
            a = scanner.nextLine();
//            c = c + Integer.parseInt(a);
            lista1.add(a);
        } while (a.matches("-?\\d+(\\.\\d+)?"));

//            switch(a.hashCode()) {
        switch (a.charAt(0)) {
            case 's':
                for (int i = 0; i < lista1.size() - 1; i++) {
                    c = c + Integer.parseInt(lista1.get(i));
                }
                System.out.println(c);
                break;
            case 'm'://m
                c = Integer.parseInt(lista1.get(0));
                for (int i = 1; i < lista1.size() - 1; i++) {
                    c = c * Integer.parseInt(lista1.get(i));
                }
                System.out.println(c);
                break;
            case 'f'://f
                c = Integer.parseInt(lista1.get(0));
                System.out.println(c);
                break;
            case 'L'://L
                c = Integer.parseInt(lista1.get(lista1.size() - 2));
                System.out.println(c);
                break;

            default:
                for (int i = 0; i < lista1.size() - 1; i++) {
                    System.out.println(lista1.get(i));
                }

        }
    }
}
