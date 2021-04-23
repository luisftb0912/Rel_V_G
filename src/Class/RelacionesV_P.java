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
public class RelacionesV_P {

    //atributos Volumetricas
    private int Relacion_vacios;
    private int Porosidad;
    private int grado_Saturacion;
    //Atributos Gravimetricas
    private double Humedad;
    private int Peso_Espec;
    private int Peso_Espec_Seco;
    private int Grav_Espec_sol;
    //Metodos

    public int getRelacion_vacios() {
        return Relacion_vacios;
    }

    public void setRelacion_vacios(int Vv, int Vs) {
        int Resp_Vacios = Vv / Vs;
        this.Relacion_vacios = Resp_Vacios;
    }

    public int getPorosidad() {
        return Porosidad;
    }

    public void setPorosidad(int Vv, int Vt) {
        int Resp_Porosidad = (Vv / Vt) * 100;
        this.Porosidad = Resp_Porosidad;
    }

    public int getGrado_Saturacion() {
        return grado_Saturacion;
    }

    public void setGrado_Saturacion(int Vw, int Vv) {
        int Resp_Gs = (Vw / Vv) * 100;
        this.grado_Saturacion = Resp_Gs;
    }

    public double getHumedad() {
        return Humedad;
    }

    public void setHumedad(double Ww, double Ws) {
        double Resp_Hum =  Math. round(((Ww / Ws) * 100)*100.0)/100.0;;
        this.Humedad = Resp_Hum;
    }

    public int getPeso_Espec() {
        return Peso_Espec;
    }

    public void setPeso_Espec(int Wt,int Vt) {
         int Resp_PesEs = (Wt / Vt) * 100;
        this.Peso_Espec = Resp_PesEs ;
    }

    public int getPeso_Espec_Seco() {
        return Peso_Espec_Seco;
    }

    public void setPeso_Espec_Seco(int Ws,int Vt) {
        int Resp_PesEsSec = (Ws / Vt) * 100;
        this.Peso_Espec_Seco = Resp_PesEsSec;
    }

    public int getGrav_Espec_sol() {
        return Grav_Espec_sol;
    }

    public void setGrav_Espec_sol(int Grav_Espec_sol) {
        this.Grav_Espec_sol = Grav_Espec_sol;
    }

}
