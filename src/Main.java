import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        int option;
        boolean exit = false;

        do {
            System.out.println("1. 6.8");
            System.out.println("2. 6.13");
            System.out.print("Choisissez votre option : ");
            option = Integer.parseInt(m.reader.readLine());

            if (option == 1) {
                m.algo68();
                exit = true;
            } else if (option == 2) {
                m.algo613();
                exit = true;
            } else {
                System.out.println("choix invalide");
            }
        } while (!exit);
    }

    public void algo68() throws IOException {
        int           nbrValues   = 0;
        int           nbrNegative = 0;
        int           nbrPositive = 0;
        int           nbrZero     = 0;
        int           val         = 0;
        List<Integer> values;

        values = new ArrayList<Integer>();

        System.out.print("Indiquez le nombre de valeurs que vous désirez entrer : ");
        nbrValues = Integer.parseInt(reader.readLine());

        for (int i = 0; i< nbrValues; i++) {
            System.out.print("Donnez une valeur numérique entière positive ou négative : ");
            val = Integer.parseInt(reader.readLine());

            if (val < 0) {
                nbrNegative += 1;
            } else if (val > 0) {
                nbrPositive += 1;
            } else {
                nbrZero += 1;
            }

            values.add(val);
        }

        System.out.println("Vous avez rentré "+nbrValues+" valeurs au total dont :");
        System.out.println("- "+nbrNegative+" valeurs négatives.");
        System.out.println("- "+nbrPositive+" valeurs positives.");
        System.out.println("- "+nbrZero+" valeurs à zéros.");
    }

    public void algo613() throws IOException {
        int           nbrValues  = 0;
        int           val        = 0;
        int           greaterVal = 0;
        int           pos        = 0;
        List<Integer> values     = new ArrayList<Integer>();

        System.out.print("Indiquze le nombre de valeurs à rentrer : ");
        nbrValues = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nbrValues; i++) {
            System.out.print("Indiquez une valeur entière positive ou négative : ");
            val = Integer.parseInt(reader.readLine());
            values.add(val);
        }

        for (int i = 0; i < nbrValues; i++) {
            if (i+1 <= nbrValues && i > 0) {
                if (values.get(i) > values.get(i-1)) {
                    greaterVal = values.get(i);
                    pos = i;
                }
            }
        }

        System.out.println("La plus grande valeur est : "+greaterVal);
        System.out.println("Cette valeur est à la position : "+pos+" d'un tableau de "+nbrValues+" valeurs");
    }
}
