/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Name.inc
 */
public class Peso {
     //atributos Peso
    private double Pes_Agua;
    private double Pes_Solidos;
    private double Pes_Aire;
    private double Pes_Total;
    
     //Constructor
    public Peso() {
        this.Pes_Agua = 0;
        this.Pes_Solidos = 0;
        this.Pes_Aire = 0;
        this.Pes_Total = 0;
    }
    //Metodos Peso

    public double getPes_Agua() {
        return Pes_Agua;
    }

    public void setPes_Agua(double Pes_Agua) {
        this.Pes_Agua = Pes_Agua;
    }

    public double getPes_Solidos() {
        return Pes_Solidos;
    }

    public void setPes_Solidos(double Pes_Solidos) {
        this.Pes_Solidos = Pes_Solidos;
    }

    public double getPes_Aire() {
        return Pes_Aire;
    }

    public void setPes_Aire(double Pes_Aire) {
        this.Pes_Aire = Pes_Aire;
    }

    public double getPes_Total() {
        return Pes_Total;
    }

    public void setPes_Total(double Pes_Total) {
        this.Pes_Total = Pes_Total;
    }

    
}
