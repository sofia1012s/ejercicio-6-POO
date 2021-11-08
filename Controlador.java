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
                    Smartphone smartphone = new Smartphone();
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

                        // no me va a funcionar porque el new Smartphone() esta abajo

                        break;
                    case 2: // Agregarlo al carrito de compras
                        smartphone.dispositivo(6000, "X", "apple", "2021", "AFG20");
                        vis.caracteristicasDispositivo("Smartphone", smartphone.getPrecio(), smartphone.getSerie(),
                                smartphone.getMarca(), smartphone.getFechaF(), smartphone.getMarcador());
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
                    Celular celular = new Celular();
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
                        celular.dispositivo(1200, "20", "nokia", "1800", "STRNG");
                        vis.caracteristicasDispositivo("Celular", celular.getPrecio(), celular.getSerie(),
                                celular.getMarca(), celular.getFechaF(), celular.getMarcador());
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
                    Telefono telefono = new Telefono();

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

                        telefono.dispositivo(500, "mg30", "claro", "2021", "cl21");
                        vis.caracteristicasDispositivo("Telefono", telefono.getPrecio(), telefono.getSerie(),
                                telefono.getMarca(), telefono.getFechaF(), telefono.getMarcador());
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
                    Camara camara = new Camara();
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

                        camara.dispositivo(5070, "M30", "RED", "2019", "R2019");
                        vis.caracteristicasDispositivo("Camara", camara.getPrecio(), camara.getSerie(),
                                camara.getMarca(), camara.getFechaF(), camara.getMarcador());
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
                    Desktop desktop = new Desktop();
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

                        desktop.dispositivo(4000, "7", "Hp", "2020", "H20");
                        vis.caracteristicasDispositivo("Computadora de escritorio", desktop.getPrecio(),
                                desktop.getSerie(), desktop.getMarca(), desktop.getFechaF(), desktop.getMarcador());
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
                    Portatil portatil = new Portatil();
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

                        portatil.dispositivo(4000, "10", "Dell", "2020", "Del2020");
                        vis.caracteristicasDispositivo("Laptop", portatil.getPrecio(), portatil.getSerie(),
                                portatil.getMarca(), portatil.getFechaF(), portatil.getMarcador());
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
                    SmartTV smartTV = new SmartTV();
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

                        smartTV.dispositivo(7000, "NG", "Toshiba", "2021", "to21");
                        vis.caracteristicasDispositivo("Smart TV", smartTV.getPrecio(), smartTV.getSerie(),
                                smartTV.getMarca(), smartTV.getFechaF(), smartTV.getMarcador());
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
                    Tablet tablet = new Tablet();
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

                        tablet.dispositivo(2100, "S6", "Samsung", "2020", "S620");
                        vis.caracteristicasDispositivo("Tablet", tablet.getPrecio(), tablet.getSerie(),
                                tablet.getMarca(), tablet.getFechaF(), tablet.getMarcador());
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
                    Smartwatch smartwatch = new Smartwatch();
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

                        smartwatch.dispositivo(5000, "21", "apple", "2021", "Applewtch");
                        vis.caracteristicasDispositivo("Smart Watch", smartwatch.getPrecio(), smartwatch.getSerie(),
                                smartwatch.getMarca(), smartwatch.getFechaF(), smartwatch.getMarcador());
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
                vis.carrito(carrito.toString());
                break;

            case 3: // Salir
                break;

            default:
                break;
            }
        }
    }
}