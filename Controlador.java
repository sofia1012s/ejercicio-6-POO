import java.util.*;

public class Controlador {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int opcionMenu = 0;
        int opProducto = 0;
        boolean p = false;

        Vista vis = new Vista();
        vis.Inicio();

        while (opcionMenu != 3) {
            do {
                try {
                    vis = new Vista();
                    opcionMenu = vis.Menu();
                    p = true;
                } catch (InputMismatchException ex) {
                    System.out.println("\nPor favor, ingresa un numero\n");
                    p = false;
                }
            } while (!p);

            switch (opcionMenu) {
            case 1: // Realizar una compra
            vis.productos();

            do {
                try {
                    vis = new Vista();
                    opProducto = vis.producto();
                    p = true;
                } catch (InputMismatchException ex) {
                    System.out.println("\nPor favor, ingresa un numero\n");
                    p = false;
                }
            } while (!p);
            
                break;

            case 2: // Ver carrito de compras
                break;

            case 3: // Salir
                break;

            default:
                break;
            }
        }
    }
}