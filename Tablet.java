public class Tablet extends DispositivoAbstracto {


    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Fotografia guardada.";
                break;
            case 2:
                interaccion = "Conectando con internet";
            case 3: 
                interaccion = " Reproduciendo video...";
                break;
        }
        return interaccion;
    }
}
