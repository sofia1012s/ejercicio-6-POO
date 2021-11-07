import java.io.*;
import java.lang.*;
import java.util.*;

public class Carrito{
    ArrayList<Dispositivo> productos = new ArrayList<Dispositivo>();
    int total = 0;


    public ArrayList<Dispositivo> sortPrecioAscendente() {
        Arrays.sort(productos, new sortPrecioAscendente());
        return productos;
    }

    public ArrayList<Dispositivo> sortPrecioDescendente() {
        Arrays.sort(productos, new sortPrecioDescendente());
        return productos;
    }

    public ArrayList<Dispositivo> sortFechaAscendente() {
        Arrays.sort(productos, new sortFechaAscendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortFechaDescendente() {
        Arrays.sort(productos, new sortFechaDescendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortMarcaAscendente() {
        Arrays.sort(productos, new sortMarcaAscendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortMarcaDescendente() {
        Arrays.sort(productos, new sortMarcaDescendente());
        return productos;  
    }

    public void eliminar(int indice) {
        productos.remove(indice);
    }

    public void agregar(Dispositivo dis) {
        productos.add(dis);
        
    }

    public int getTotal() {
        return total;
        
    }

}
