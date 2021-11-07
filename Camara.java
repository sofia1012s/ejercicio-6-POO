public class Camara extends DispositivoAbstracto {

    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Se ha tomado una foto.";
                break;
            case 2:
            interaccion = "Se reprodujo un video.";
                break;
        }
        return interaccion;
    }
}
