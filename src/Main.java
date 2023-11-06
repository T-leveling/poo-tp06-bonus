import fr.eni.tp06.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        {

            var formes = new ArrayList<Forme>();

            formes.add(new Cercle(3));

            formes.add(new Rectangle(3,4));

            formes.add(new Carre(3));

            formes.add(new Triangle(4,5,6));

            for (var forme : formes)
            {

                System.out.println(forme);

            }

        }
    }
}