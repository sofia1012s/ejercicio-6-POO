import java.util.*;

public class sortFechaAscendente implements Comparator<DispositivoAbstracto>{

    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        return a.getFechaF().compareTo(b.getFechaF());
    }
    
}
