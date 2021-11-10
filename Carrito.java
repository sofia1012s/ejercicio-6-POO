/**
 * Carrito.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
import java.util.*;

public class Carrito {
    private ArrayList<DispositivoAbstracto> productos = new ArrayList<DispositivoAbstracto>();
    private int total = 0;

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortPrecioAscendente() {
        Collections.sort(productos, new sortPrecioAscendente());
        return productos;
    }

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortPrecioDescendente() {
        Collections.sort(productos, new sortPrecioDescendente());
        return productos;
    }

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortFechaAscendente() {
        Collections.sort(productos, new sortFechaAscendente());
        return productos;
    }

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortFechaDescendente() {
        Collections.sort(productos, new sortFechaDescendente());
        return productos;
    }

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortMarcaAscendente() {
        Collections.sort(productos, new sortMarcaAscendente());
        return productos;
    }

    
    /** 
     * @return ArrayList<DispositivoAbstracto>
     */
    public ArrayList<DispositivoAbstracto> sortMarcaDescendente() {
        Collections.sort(productos, new sortMarcaDescendente());
        return productos;
    }

    
    /** 
     * @param indice
     */
    public void eliminar(int indice) {
        productos.remove(indice);
    }

    public void vaciarCarrito() {
        productos.clear();
        total = 0;
    }

    
    /** 
     * @param dis
     */
    public void agregar(DispositivoAbstracto dis) {
        productos.add(dis);
    }

    
    /** 
     * @return int
     */
    public int getTotal() {
        for (int i = 0; i < this.productos.size(); i++) {
            total += this.productos.get(i).getPrecio();
        }

        return total;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        String results = "\n";
        for (int i = 0; i < this.productos.size(); i++) {
            results += "\n(" + (i + 1) + ") " + this.productos.get(i).getClass().getSimpleName() + "\nMarca: "
                    + this.productos.get(i).getMarca() + "\nFecha de fabricacion: " + this.productos.get(i).getFechaF()
                    + "\nPrecio: Q." + this.productos.get(i).getPrecio();
        }
        return results;
    }

}
