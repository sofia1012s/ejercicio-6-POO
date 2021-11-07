import java.util.*;

public class Vista {
    private Scanner scan;

    public Vista() {
        scan = new Scanner(System.in);
    }

    public void Inicio() {

        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\n\t\t\t\t\t\tElectronica Latinoamericana Online"
                        + "\nBienvenido a nuestra tienda en linea");
    }

    public int Menu(int opcion) {
        String Mensaje = "\nQue desea hacer?\n" + "1. Realizar una compra\n" + "2. Ver carrito de compras\n" + "3. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        opcion = scan.nextInt();
        return opcion;
    }

    public void productos() {
        String Mensaje = "\nA continuacion se observa nuestro catalogo de productos\n" + "1. Smartphones\n"
                + "a. Hacen llamadas\n" + "b. Toman fotografias\n" + "c. Pueden navegar por internet\n"
                + "d. Pueden reproducir videos\n" + "e. Son portables\n" + "\n2. Telefonos Celulares\n"
                + "a. Hacen llamadas\n" + "b. Son portables\n" + "\n3. Telefonos fijos\n" + "a. Hacen llamadas\n"
                + "\n4. Camaras fotograficas\n" + "a. Toman fotografias\n" + "b. Pueden reproducir videos\n"
                + "c. Son portables\n" + "\n5. Computador Personal (Desktop)\n" + "a. Pueden navegar por internet\n"
                + "b. Pueden reproducir videos\n" + "c. Ejecutar Videojuegos\n" + "\n6. Computador Personal (Laptop)\n"
                + "a. Pueden navegar por internet\n" + "b. Pueden reproducir videos\n" + "c. Son portables\n"
                + "\n7. Smart TV\n" + "a. Pueden navegar por internet\n" + "b. Pueden reproducir videos\n"
                + "\n8. Tablets\n" + "a. Toman fotografias\n" + "b. Pueden navegar por internet\n"
                + "c. Pueden reproducir videos\n" + "d. Son portables\n" + "\n9. Smartwatch\n"
                + "a. Toman fotografías\n" + "b. Son portables\n" + "c. Hacen llamadas\n";

        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

}
