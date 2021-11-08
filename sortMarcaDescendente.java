import java.util.*;

public class sortMarcaDescendente implements Comparator<DispositivoAbstracto>{
    
    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        return b.getMarca().compareTo(a.getMarca());
    }
    
}
