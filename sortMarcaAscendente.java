import java.util.*;

public class sortMarcaAscendente implements Comparator<Dispositivo>{
    
    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        return a.marca.compareTo(b.marca);
    }
    
}
