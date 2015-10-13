import com.iteso.factory.PozoleStore;
import com.iteso.factory.Pozole;
import com.iteso.factory.stores.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/2/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleTestDrive {
    public static void main (String[] args){
        PozoleStore pozoleVerde = new PozolilloStore();
        PozoleStore pozoleRojo = new AllPozolesStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = pozoleVerde.orderPozole("Pollo", "");

        System.out.println("First order is: "+ pozole.getName());
        System.out.println();
        System.out.println();

        pozole = pozoleRojo.orderPozole("Pollo", "Rojo");

        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();
        System.out.println();

        pozole = menuderia.orderPozole("Pollo", "");

        System.out.println("Third order is: "+ pozole.getName());
    }
}
