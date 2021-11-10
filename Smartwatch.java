/**
 * Smartwatch.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
public class Smartwatch extends DispositivoAbstracto{
    /** 
     * @param opcion
     * @return String
     */
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
