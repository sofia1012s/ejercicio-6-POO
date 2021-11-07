public class Smartwatch implements Dispositivo{
    public int precio = 0;
    public String serie = "";
    public String marca = "";
    public String fechaF = "";
    public String marcador = "";

    public void dispositivo(int precio, String serie, String marca, String fechaF, String marcador){
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fechaF = fechaF;
        this.marcador = marcador;
    }

    public void interactuar(int opcion){}
}
