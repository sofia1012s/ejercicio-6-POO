import java.util.*;

public class Carrito{
    private ArrayList<DispositivoAbstracto> productos = new ArrayList<DispositivoAbstracto>();
    private int total = 0;


    public ArrayList<DispositivoAbstracto> sortPrecioAscendente() {
        Collections.sort(productos, new sortPrecioAscendente());
        return productos;
    }

    public ArrayList<DispositivoAbstracto> sortPrecioDescendente() {
        Collections.sort(productos, new sortPrecioDescendente());
        return productos;
    }

    public ArrayList<DispositivoAbstracto> sortFechaAscendente() {
        Collections.sort(productos, new sortFechaAscendente());
        return productos;  
    }

    public ArrayList<DispositivoAbstracto> sortFechaDescendente() {
        Collections.sort(productos, new sortFechaDescendente());
        return productos;  
    }

    public ArrayList<DispositivoAbstracto> sortMarcaAscendente() {
        Collections.sort(productos, new sortMarcaAscendente());
        return productos;  
    }

    public ArrayList<DispositivoAbstracto> sortMarcaDescendente() {
        Collections.sort(productos, new sortMarcaDescendente());
        return productos;  
    }

    public void eliminar(int indice) {
        productos.remove(indice);
    }

    public void agregar(DispositivoAbstracto dis) {
        productos.add(dis);
    }

    public int getTotal() {
        return total;   
    }

    public String toString() {
        String results = "\n";
        for (int i = 0; i < this.productos.size(); i++) {
            results += this.productos.get(i).getClass() + " - "+ this.productos.get(i).getMarca() +  " - "+ this.productos.get(i).getPrecio();
            
        }
        return results;
    }

}
