import java.io.*;
import java.lang.*;
import java.util.*;

public class sortPrecioDescendente implements Comparator<Dispositivo> {

    @Override
    public int compare(Dispositivo a, Dispositivo b) {
        return b.precio - a.precio;
    }

}
