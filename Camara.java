/** 
 * Camara.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
public class Camara extends DispositivoAbstracto {

    
    /** 
     * @param opcion
     * @return String
     */
    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se ha tomado una foto.";
                break;
            case 2:
            interaccion = "Se reprodujo un video.";
                break;
        }
        return interaccion;
    }
}
