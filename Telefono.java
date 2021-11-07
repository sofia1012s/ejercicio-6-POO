public class Telefono extends DispositivoAbstracto {

    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se realizo una llamada de prueba";
                break;
        }
        return interaccion;
    }
}
