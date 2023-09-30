package pe.edu.cibertec.DSWII_CL1REST_Grupo9.model;


import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.AlmacenRequest;

public class AlmacenModel {
    public double calcularPrecioTotal(double precio, int cantidad) {

        double precioTotal = precio * cantidad;

        if (precioTotal > 200) {
            precioTotal -= precioTotal * 0.20;
        }

        return precioTotal;
    }

}
