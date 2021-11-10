/**
 * Empresa.java
 * @author Héctor de León, Sofía Salguero
 * @version 9/11/2021
 */
public class Empresa {
    String direccion1 = "130 W 30TH NEW YORK NY USA";
    String direccion2 = "25 calle 16-26 zona 15";
    String direccion3 = "Riobamba 3955 Barrio Bella Vista Buenos Aires";

    String codigo1 = "10032";
    String codigo2 = "01015";
    String codigo3 = "B1703";

    String pais1 = "Estados Unidos";
    String pais2 = "Guatemala";
    String pais3 = "Argentina";

    String ciudad1 = "New York";
    String ciudad2 = "Ciudad de Guatemala";
    String ciudad3 = "Buenos Aires";

    
    /** 
     * @param opcion
     * @return String[]
     */
    public String[] getEmpresa(int opcion) {
        String[] empresa = {};

        switch (opcion) {
        case 1:
            String[] empresa1 = { direccion1, codigo1, pais1, ciudad1 };
            empresa = empresa1;
            break;

        case 2:
            String[] empresa2 = { direccion2, codigo2, pais2, ciudad2 };
            empresa = empresa2;
            break;

        case 3:
            String[] empresa3 = {direccion3, codigo3, pais3, ciudad3};
            empresa = empresa3;
            break;

        default:
            break;
        }

        return empresa;
    }
}
