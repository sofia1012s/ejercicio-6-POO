import java.io.*;
import java.lang.*;
import java.util.*;

public class sortPrecioAscendente implements Comparator<DispositivoAbstracto> {

    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        
        return a.getPrecio() - b.getPrecio();
    }


}
