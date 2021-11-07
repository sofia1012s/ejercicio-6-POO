public class SmartTV extends DispositivoAbstracto{

    public String interactuar(int opcion){
        String interaccion = "";
        switch(opcion){
            case 1:
                interaccion = "Navegando por internet...";
                break;
            case 2:
                interaccion = "Se esta reproduciendo el video...";
                break;

        }
        return interaccion;
    }
}
