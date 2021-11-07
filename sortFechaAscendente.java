import java.util.*;

public class sortFechaAscendente implements Comparator<Dispositivo>{

    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        // TODO Auto-generated method stub
        return a.fechaF.compareTo(b.fechaF);
    }
    
}
