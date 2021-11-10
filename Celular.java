/**
 * Celular.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 *
 */

public class Celular extends DispositivoAbstracto {
    /** 
     * @param opcion
     * @return String
     */
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
