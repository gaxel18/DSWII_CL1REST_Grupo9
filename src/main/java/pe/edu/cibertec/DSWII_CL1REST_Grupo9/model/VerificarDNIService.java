package pe.edu.cibertec.DSWII_CL1REST_Grupo9.model;

public class VerificarDNIService {

    private static final int EDAD_MAXIMA_DNI = 18;

    public boolean debeRenovarDNI(int anoNacimiento) {

        int anoActual = java.time.Year.now().getValue();

        int edad = anoActual - anoNacimiento;

        return edad >= EDAD_MAXIMA_DNI;
    }
}
