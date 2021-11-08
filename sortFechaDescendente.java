import java.io.*;
import java.lang.*;
import java.util.*;

public class sortFechaDescendente implements Comparator<DispositivoAbstracto>{

    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        // TODO Auto-generated method stub
        return b.getFechaF().compareTo(a.getFechaF());
    }
    
}
