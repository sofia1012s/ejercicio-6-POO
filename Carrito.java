import java.util.*;

public class Carrito{
    private ArrayList<Dispositivo> productos = new ArrayList<Dispositivo>();
    private int total = 0;


    public ArrayList<Dispositivo> sortPrecioAscendente() {
        Collections.sort(productos, new sortPrecioAscendente());
        return productos;
    }

    public ArrayList<Dispositivo> sortPrecioDescendente() {
        Collections.sort(productos, new sortPrecioDescendente());
        return productos;
    }

    public ArrayList<Dispositivo> sortFechaAscendente() {
        Collections.sort(productos, new sortFechaAscendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortFechaDescendente() {
        Collections.sort(productos, new sortFechaDescendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortMarcaAscendente() {
        Collections.sort(productos, new sortMarcaAscendente());
        return productos;  
    }

    public ArrayList<Dispositivo> sortMarcaDescendente() {
        Collections.sort(productos, new sortMarcaDescendente());
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

    public String toString() {
        String results = "+";
        for (int i = 0; i < this.productos.size(); i++) {
            results += " " + this.productos.get(i);
        }
        return results;
    }

}
