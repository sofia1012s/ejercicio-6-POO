import java.util.*;

public class Controlador {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int opcionMenu = 0;
        int numeroProducto = 0;
        int opcionProducto = 0;
        boolean p = false;

        Vista vis = new Vista();
        Carrito carrito = new Carrito();
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
                vis.productos(); // Se observa la lista de productos

                // Se le pide al usuario escoger un productos para comprar
                do {
                    try {
                        vis = new Vista();
                        numeroProducto = vis.producto();
                        p = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("\nPor favor, ingresa un numero\n");
                        p = false;
                    }
                } while (!p);

                // Switch Case para el productos que escogió el usuario
                switch (numeroProducto) {

                case 1: // Smartphone

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Smartphone smartphone = new Smartphone();
                        smartphone.dispositivo(precio, serie, marca, fechaF, marcador);
                        carrito.agregar(smartphone);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }

                    break;

                case 2: // Celulares

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Celular celular = new Celular();
                        celular.dispositivo(precio, serie, marca, fechaF, marcador);
                        carrito.agregar(celular);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 3: // Teléfonos fijos

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Telefono telefono = new Telefono();
                        carrito.agregar(telefono);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 4: // Cámaras fotográficas

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Camara camara = new Camara();
                        carrito.agregar(camara);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 5: // Desktop

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Desktop desktop = new Desktop();
                        carrito.agregar(desktop);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 6: // Laptop

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Portatil portatil = new Portatil();
                        carrito.agregar(portatil);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 7: // Smart TV

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        SmartTV smartTV = new SmartTV();
                        carrito.agregar(smartTV);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 8: // Tablets

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Tablet tablet = new Tablet();
                        carrito.agregar(tablet);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 9: // SmartWatch

                    // Se le pregunta al usuario qué desea hacer con este producto
                    do {
                        try {
                            vis = new Vista();
                            opcionProducto = vis.opcionesProducto();
                            p = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("\nPor favor, ingresa un numero\n");
                            p = false;
                        }
                    } while (!p);

                    // Switch case para la opción que escogió el usuario
                    switch (opcionProducto) {
                    case 1: // Probar funcionalidades

                        break;
                    case 2: // Agregarlo al carrito de compras
                        Smartwatch smartwatch = new Smartwatch();
                        carrito.agregar(smartwatch);
                        vis.agregadoExito();
                        break;
                    case 3: // Regresar al menú principal
                        break;

                    default: // Falta agregar progra defensiva por si escoge un numero que no es
                        break;
                    }
                    break;

                case 10:
                    opcionMenu = 1;

                default: // Falta agregar progra defensiva por si escoge un numero que no es
                    break;
                }
                break;

            case 2: // Ver carrito de compras
                carrito.toString();
                break;

            case 3: // Salir
                break;

            default:
                break;
            }
        }
    }
}