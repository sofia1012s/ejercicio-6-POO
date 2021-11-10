/**
 * Vista.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 */
import java.util.*;
import java.time.*;

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

    
    /** 
     * @return int
     */
    public int Menu() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Realizar una compra\n" + "2. Ver carrito de compras\n"
                + "3. Salir\n";
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + Mensaje);
        int opcion = scan.nextInt();
        return opcion;
    }

    
    /** 
     * @return int
     */
    public int menuCarrito() {
        String Mensaje = "\nQue desea hacer?\n" + "1. Seguir comprando\n" + "2. Realizar mi compra\n"
                + "3. Ordenar carrito por precio ascendente\n" + "4. Ordenar carrito por precio descendente\n"
                + "5. Ordenar carrito por fecha de fabricacion ascendente\n"
                + "6. Ordenar carrito por fecha de fabricacion descendente\n"
                + "7. Ordenar carrito por marca ascendente\n" + "8. Ordenar carrito por marca descendente\n"
                + "9.Eliminar elemento de mi carrito\n" + "10.Salir\n";
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

    
    /** 
     * @return int
     */
    public int producto() {
        System.out.println("\n-En cual producto se encuentra interesado? (Escriba el numero del producto)"
                + "\n1. Smartphone" + "\n2. Telefono Celular " + "\n3. Telefonos fijos" + "\n4. Camaras fotograficas"
                + "\n5. Computador Personal (Desktop)" + "\n6. Computador Personal (Laptop)" + "\n7. Smart TV"
                + "\n8. Tablets" + "\n9. Smartwatch" + "\n10. Regresar al menu principal");
        int opcion = scan.nextInt();

        return opcion;
    }

    
    /** 
     * @return int
     */
    public int opcionesProducto() {
        System.out.println("\n-Que desea realizar con este producto?" + "\n1) Probar sus funcionalidades"
                + "\n2) Agregarlo a mi carrito de compras" + "\n3) Nada, regresar al listado de productos");
        int opcion = scan.nextInt();

        return opcion;
    }

    public void agregadoExito() {
        System.out.println("\nSu producto se ha agregado con exito!");
    }

    
    /** 
     * @param s
     */
    public void carrito(String s) {
        System.out.println("\nA continuacion observara su carrito de compras: " + s);
    }

    
    /** 
     * @param dispositivo
     * @param precio
     * @param serie
     * @param marca
     * @param fecha
     * @param marcador
     */
    public void caracteristicasDispositivo(String dispositivo, int precio, String serie, String marca, String fecha,
            String marcador) {
        System.out.println(
                "\nCaracteristicas del dispositivo " + dispositivo + ":" + "\nPrecio: Q" + precio + "\nSerie: " + serie
                        + "\nMarca: " + marca + "\nAño de fabricacion: " + fecha + "\nMarcador AR: " + marcador);
    }

    
    /** 
     * @return int
     */
    public int interaccionCamara() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Tomar foto." + "\n2. Reproducir video.");
        int interaccion = scan.nextInt();
        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionCelular() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Llamar.");
        int interaccion = scan.nextInt();
        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionDesktop() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Navegar en internet."
                + "\n2. Reproducir video." + "\n3. Jugar videojuego");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionPortatil() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Navegar en internet."
                + "\n2. Reproducir video." + "\n3. Jugar videojuego");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionSmartphone() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Llamar." + "\n2. Tomar foto."
                + "\n3. Navegar en internet" + "\n4. Reproducir video.");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionSmartTV() {
        System.out.println(
                "\nQue desea hacer con el dispositivo? " + "\n1. Navegar en internet." + "\n2. Reproducir video.");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionSmartwatch() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Llamar." + "\n2. Tomar foto.");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionTablet() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Tomar foto." + "\n2. Navegar por internet."
                + "\n3. Reproducir video.");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @return int
     */
    public int interaccionTelefono() {
        System.out.println("\nQue desea hacer con el dispositivo? " + "\n1. Llamar.");
        int interaccion = scan.nextInt();

        return interaccion;
    }

    
    /** 
     * @param opcion
     */
    public void interactuando(String opcion) {
        System.out.println(opcion);
    }

    public void Salida() {
        System.out.println(
                "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                        + "\t\t\t\t\t\t\t\tRegresa Pronto!"
                        + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    
    /** 
     * @return int
     */
    public int escogerEmpresa() {
        System.out.println("\nPor favor, escoja la sucursal más cercana a su país de residencia "
                + "\n1. Sucursal en Estados Unidos" + "\n-130 W 30TH NEW YORK NY USA - Codigo: 10032\n"
                + "\n2. Sucursal en Guatemala" + "\n-25 calle 16-26 zona 15, Ciudad de Guatemala - Codigo: 01015\n"
                + "\n3. Sucursal en Argentina" + "\n-Riobamba 3955 Barrio Bella Vista Buenos Aires - Codigo: B1703");
        int opcion = scan.nextInt();

        return opcion;
    }

    
    /** 
     * @return String
     */
    public String nombre() {
        System.out.println("\nEscriba su nombre: ");
        String nombre = scan.next();

        return nombre;
    }

    
    /** 
     * @return String
     */
    public String apellido() {
        System.out.println("\nEscriba su apellido: ");
        String apellido = scan.next();

        return apellido;
    }

    
    /** 
     * @return String
     */
    public String NIT() {
        System.out.println("\nEscriba su NIT o CF: ");
        String NIT = scan.next();
        return NIT;
    }

    
    /** 
     * @return int
     */
    public int eliminar() {
        System.out.println("\nCual producto desea eliminar?: ");
        int opcion = scan.nextInt();
        return opcion;
    }

    
    /** 
     * @param NIT
     * @param nombre
     * @param total
     * @param pais
     * @param ciudad
     * @param direccion
     * @param codigo
     */
    public void factura(String NIT, String nombre, int total, String pais, String ciudad, String direccion,
            String codigo) {
        Random random = new Random();
        System.out.println("\nFactura " + "\n-NIT: " + NIT + "\n\nNombre: " + nombre + "\n\nFecha: " + LocalDate.now()
                + "\n\nNumero de factura: " + random.nextLong() + "\n\nDatos de tienda: " + "\n-Pais: " + pais
                + "\n-Ciudad: " + ciudad + "\n-Direccion exacta: " + direccion + "\n-Codigo: " + codigo
                + "\n\n---Monto Total: Q." + total
                + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "\t\t\t\t\t\t\t\tMuchas gracias por su compra! "
                + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    public void fueraMenu() {
        System.out.println("\nPor favor, selecciona una de las opciones en el menu.\n");
    }

}