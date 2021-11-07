import java.io.*;
import java.lang.*;
import java.util.*;

public class sortFechaDescendente implements Comparator<Dispositivo>{

    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        // TODO Auto-generated method stub
        return b.fechaF.compareTo(a.fechaF);
    }
    
}
