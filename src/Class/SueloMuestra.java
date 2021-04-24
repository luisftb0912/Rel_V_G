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
public class SueloMuestra {

    // atributos Volumen
    private double Vol_Vacios;
    private double Vol_Agua;
    private double Vol_Solidos;
    private double Vol_Aire;
    private double Vol_Total;
    //atributos Peso
    private double Pes_Agua;
    private double Pes_Solidos;
    private double Pes_Aire;
    private double Pes_Total;

    //Constructor
    public SueloMuestra() {
        this.Vol_Vacios = 0;
        this.Vol_Agua = 0;
        this.Vol_Solidos = 0;
        this.Vol_Aire = 0;
        this.Vol_Total = 0;
        this.Pes_Agua = 0;
        this.Pes_Solidos = 0;
        this.Pes_Aire = 0;
        this.Pes_Total = 0;
    }

    //Metodos Volumen
    public double getVol_Vacios() {
        return Vol_Vacios;
    }

    public void setVol_Vacios(double Vol_Vacios) {
        this.Vol_Vacios = Vol_Vacios;
    }

    public double getVol_Agua() {
        return Vol_Agua;
    }

    public void setVol_Agua(double Vol_Agua) {
        this.Vol_Agua = Vol_Agua;
    }

    public double getVol_Solidos() {
        return Vol_Solidos;
    }

    public void setVol_Solidos(double Vol_Solidos) {
        this.Vol_Solidos = Vol_Solidos;
    }

    public double getVol_Aire() {
        return Vol_Aire;
    }

    public void setVol_Aire(double Vol_Aire) {
        this.Vol_Aire = Vol_Aire;
    }

    public double getVol_Total() {
        return Vol_Total;
    }

    public void setVol_Total(double Vol_Total) {
        if (getVol_Aire() != 0 && getVol_Agua() != 0 && getVol_Solidos() != 0) {
            this.Vol_Total = getVol_Aire() + getVol_Agua() + getVol_Solidos();
        } else if (getVol_Vacios() != 0 && getVol_Solidos() != 0) {
            this.Vol_Total = getVol_Vacios() + getVol_Solidos();
        } else {
            this.Vol_Total = Vol_Total;
        }
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
