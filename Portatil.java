/**
 * Portatil.jaba
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
public class Portatil extends DispositivoAbstracto {

    
    /** 
     * @param opcion
     * @return String
     */
    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Navegando por internet...";
                break;
            case 2:
                interaccion = "Se esta reproduciendo el video...";
                break;
            case 3:
                interaccion = "Se esta ejecutando el videojuego...";
                break;
        }
        return interaccion;
    }
}
