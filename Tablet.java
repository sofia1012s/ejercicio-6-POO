/**
 * Tablet.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 */
public class Tablet extends DispositivoAbstracto {

    /** 
     * @param opcion
     * @return String
     */
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
