import java.util.*;

public class sortMarcaAscendente implements Comparator<DispositivoAbstracto>{
    
    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        return a.getMarca().compareTo(b.getMarca());
    }
    
}
