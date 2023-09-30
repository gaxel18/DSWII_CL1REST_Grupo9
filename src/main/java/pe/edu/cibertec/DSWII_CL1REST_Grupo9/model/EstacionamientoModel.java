package pe.edu.cibertec.DSWII_CL1REST_Grupo9.model;

public class EstacionamientoModel {
    public double calcularTotal(int horas, int minutos) {
        double Totalmin = (horas * 60) + minutos;
        double Fraccionhora = Totalmin / 60;
        double CostoTotal = Fraccionhora * 1500;
        return CostoTotal;
    }
}
