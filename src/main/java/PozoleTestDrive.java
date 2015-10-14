import com.iteso.factory.PozoleStore;
import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.PozoleNormal;
import com.iteso.factory.stores.AllPozolesStore;
import com.iteso.factory.stores.MenudoStore;
import com.iteso.factory.stores.PozoleRojoStore;
import com.iteso.factory.stores.PozoleVerdeStore;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/2/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleTestDrive {


    private static String caldo_rojo    = "rojo";
    private static String caldo_verde   = "verde";
    private static String caldo_blanco  = "blanco";

    private static String carne_pollo   = "pollo";
    private static String carne_cachete = "cachete";
    private static String carne_pierna  = "pierna";
    private static String carne_trompa  = "trompa";
    private static String carne_orjea   = "oreja";



    public static void main (String[] args){
        PozoleStore pozoleStore = new AllPozolesStore();

        Pozole pozole1 = pozoleStore.orderPozole(carne_pollo, caldo_rojo);
        System.out.println("First order is: "+ pozole1.getName());
        System.out.println();
        System.out.println();

        Pozole pozole2 = pozoleStore.orderPozole(carne_cachete, caldo_blanco);
        System.out.println("Second order is: "+ pozole2.getName());
        System.out.println();
        System.out.println();

        Pozole pozole3 = pozoleStore.orderPozole(carne_trompa, caldo_verde);
        System.out.println("Third order is: "+ pozole3.getName());
        System.out.println();
        System.out.println();









    }
}
