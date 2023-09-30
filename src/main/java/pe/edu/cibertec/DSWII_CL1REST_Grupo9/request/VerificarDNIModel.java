package pe.edu.cibertec.DSWII_CL1REST_Grupo9.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerificarDNIModel {
    private int anoNacimiento;

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }
}
