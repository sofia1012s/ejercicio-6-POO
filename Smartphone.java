public class Smartphone extends DispositivoAbstracto{


    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se realizo una llamada de prueba";
                break;
            case 2:
                interaccion = "Fotografia guardada.";
                break;
            case 3:
                interaccion = "Conectando con internet";
            case 4: 
                interaccion = " Reproduciendo video...";
                break;
        }
        return interaccion;
    }
}
