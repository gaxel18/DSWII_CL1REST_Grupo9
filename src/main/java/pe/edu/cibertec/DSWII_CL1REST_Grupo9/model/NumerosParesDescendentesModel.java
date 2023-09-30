package pe.edu.cibertec.DSWII_CL1REST_Grupo9.model;

public class NumerosParesDescendentesModel {
    public int calcularNumero(int num1) {
        for (int i = 20; i >= 10; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return num1;
    }
}
