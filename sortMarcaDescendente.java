import java.util.*;

public class sortMarcaDescendente implements Comparator<Dispositivo>{
    
    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        return b.marca.compareTo(a.marca);
    }
    
}
