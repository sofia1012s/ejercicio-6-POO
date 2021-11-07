import java.io.*;
import java.lang.*;
import java.util.*;

public class sortPrecioAscendente implements Comparator<Dispositivo> {

    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        
        return a.precio - b.precio;
    }


}
