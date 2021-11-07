public class Smartwatch extends DispositivoAbstracto{

    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se realizo una llamada de prueba";
                break;
            case 2:
                interaccion = "Fotografia guardada.";
                break;
 
        }
        return interaccion;
    }
}
