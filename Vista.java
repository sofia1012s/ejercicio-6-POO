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

    public int Menu() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Realizar una compra\n" + "2. Ver carrito de compras\n"
                + "3. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    public void productos() {
        String Mensaje = "\nA continuacion se observa nuestro catalogo de productos\n" + "\n1. Smartphones\n"
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
                + "a. Toman fotografias\n" + "b. Son portables\n" + "c. Hacen llamadas\n";

        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
    }

    public int producto() {
        System.out.println("\n-En cual producto se encuentra interesado? (Escriba el numero del producto)"
                + "\n1. Smartphone" + "\n2. Telefono Celular " + "\n3. Telefonos fijos" + "\n4. Camaras fotograficas"
                + "\n5. Computador Personal (Desktop)" + "\n6. Computador Personal (Laptop)" + "\n7. Smart TV"
                + "\n8. Tablets" + "\n9. Smartwatch" + "\n10. Regresar al menu principal");
        int opcion = scan.nextInt();

        return opcion;
    }

    public int opcionesProducto() {
        System.out.println("\n-Que desea realizar con este producto?" + "\n1) Probar sus funcionalidades"
                + "\n2)Agregarlo a mi carrito de compras" + "\n3)Nada, regresar al listado de productos");
        int opcion = scan.nextInt();

        return opcion;
    }

    public void agregadoExito()
    {
        System.out.println("\nSu producto se ha agregado con exito!");
    }

    public void carrito(String s)
    {
        System.out.println("\nA continuacion observara su carrito de compras: ");
    }
}
