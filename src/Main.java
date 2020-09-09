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
            System.out.print("Choisissez votre option : ");
            option = Integer.parseInt(m.reader.readLine());

            if (option == 1) {
                m.algo68();
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
}
