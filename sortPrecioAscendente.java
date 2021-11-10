/**
 * sortPrecioAscendente.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
import java.util.*;

public class sortPrecioAscendente implements Comparator<DispositivoAbstracto> {

    
    /** 
     * @param a
     * @param b
     * @return int
     */
    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        
        return a.getPrecio() - b.getPrecio();
    }


}
