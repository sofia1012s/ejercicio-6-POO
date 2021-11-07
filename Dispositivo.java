public interface Dispositivo {
    public int precio = 0;
    public String serie = "";
    public String marca = "";
    public String fechaF = "";
    public String marcador = "";

    public void dispositivo(int precio, String serie, String marca, String fechaF, String marcador);

    public void interactuar(int opcion);
}
