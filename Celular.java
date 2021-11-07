public class Celular extends DispositivoAbstracto {

    

    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se ha realizado una llamada de prueba.";
                break;
        }
        return interaccion;
    }
}
