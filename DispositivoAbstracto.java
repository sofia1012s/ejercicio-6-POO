/**
 * DispositivoAbstracto.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 * 
 */
abstract class DispositivoAbstracto implements Dispositivo {
    //al ser una clase abstracta no es necesario implementar los metodos de la interface aqui
    // pero si sera necesario implementarlo en las clases hijas. https://jarroba.com/polimorfismo-en-java-interface-parte-ii-con-ejemplos/
    public int precio = 0;
    public String serie = "";
    public String marca = "";
    public String fechaF = "";
    public String marcador = "";

    
    /** 
     * @param precio
     * @param serie
     * @param marca
     * @param fechaF
     * @param marcador
     */
    public void dispositivo(int precio, String serie, String marca, String fechaF, String marcador){
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fechaF = fechaF;
        this.marcador = marcador;
    }

    
    /** 
     * @return int
     */
    public int getPrecio(){
        return this.precio;
    }

    
    /** 
     * @return String
     */
    public String getSerie(){
        return this.serie;
    }

    
    /** 
     * @return String
     */
    public String getMarca(){
        return this.marca;
    }

    
    /** 
     * @return String
     */
    public String getFechaF(){
        return this.fechaF;
    }

    
    /** 
     * @return String
     */
    public String getMarcador(){
        return this.marcador;
    }
}
