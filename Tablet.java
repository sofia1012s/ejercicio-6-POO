public class Tablet implements Dispositivo {
    public int precio = 0;
    public String serie = "";
    public String marca = "";
    public String fechaF = "";
    public String marcador = "";

    @Override
    public void dispositivo(int precio, String serie, String marca, String fechaF, String marcador) {
        this.serie = serie;
        this.marca = marca;
        this.fechaF = fechaF;
        this.marcador = marcador;

    }

    @Override
    public void interactuar(int opcion) {
        // TODO Auto-generated method stub

    }

}
