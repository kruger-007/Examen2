package cr.go.ucr.examen1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JeArag
 */
public class Rango {
    private Double menor;
    private Double mayor;
    private Double valor;

    public Rango(Double menor, Double mayor, Double valor) {
        this.menor = menor;
        this.mayor = mayor;
        this.valor = valor;
    }

    public Double getMenor() {
        return menor;
    }

    public void setMenor(Double menor) {
        this.menor = menor;
    }

    public Double getMayor() {
        return mayor;
    }

    public void setMayor(Double mayor) {
        this.mayor = mayor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

   
    
}