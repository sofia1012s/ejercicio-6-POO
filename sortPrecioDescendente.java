import java.io.*;
import java.lang.*;
import java.util.*;

public class sortPrecioDescendente implements Comparator<DispositivoAbstracto> {

    @Override
    public int compare(DispositivoAbstracto a, DispositivoAbstracto b) {
        return b.getPrecio() - a.getPrecio();
    }

}
