package pe.edu.cibertec.DSWII_CL1REST_Grupo9.model;

public class NotaModel {

    public double calcularPromedio(double[] notas){
        double minNota = Double.MAX_VALUE;
        double total = 0;

        for (double nota : notas){
            if(nota < minNota){
                minNota = nota;
            }
            total += nota;
        }

        /*Restar mínima nota del total*/
        total -= minNota;

        return (notas[0] * 0.2) + (notas[1] * 0.3) + (notas[2] * 0.5);
    }
}

