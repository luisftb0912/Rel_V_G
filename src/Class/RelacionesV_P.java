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

    // Volumetricas
    private double Relacion_vacios;
    private double Porosidad;
    private double grado_Saturacion;
    // Gravimetricas
    private double Humedad;
    private double Peso_Espec;
    private double Peso_Espec_Seco;
    private double Grav_Espec_sol;
    
    //Metodos Volumetricas
    public double getRelacion_vacios() {
        return Relacion_vacios;
    }

    public void setRelacion_vacios(double Vv, double Vs) {
        double Resp_Vacios = Vv / Vs;
        this.Relacion_vacios = Resp_Vacios;
    }

    public double getPorosidad() {
        return Porosidad;
    }

    public void setPorosidad(double Vv, double Vt) {
        double Resp_Porosidad = (Vv / Vt) * 100;
        this.Porosidad = Resp_Porosidad;
    }

    public double getGrado_Saturacion() {
        return grado_Saturacion;
    }

    public void setGrado_Saturacion(double Vw, double Vv) {
        double Resp_Gs = (Vw / Vv) * 100;
        this.grado_Saturacion = Resp_Gs;
    }
    
    //Metodos Gravimetricas

    public double getHumedad() {
        return Humedad;
    }

    public void setHumedad(double Ww, double Ws) {
        double Resp_Hum =  Math. round(((Ww / Ws) * 100)*100.0)/100.0;;
        this.Humedad = Resp_Hum;
    }

    public double getPeso_Espec() {
        return Peso_Espec;
    }

    public void setPeso_Espec(double Wt,double Vt) {
         double Resp_PesEs = (Wt / Vt) * 100;
        this.Peso_Espec = Resp_PesEs ;
    }

    public double getPeso_Espec_Seco() {
        return Peso_Espec_Seco;
    }

    public void setPeso_Espec_Seco(double Ws,double Vt) {
        double Resp_PesEsSec = (Ws / Vt) * 100;
        this.Peso_Espec_Seco = Resp_PesEsSec;
    }

    public double getGrav_Espec_sol() {
        return Grav_Espec_sol;
    }

    public void setGrav_Espec_sol(double Ws,double Vs) {
        //peso especifico del agua Y0=1
        Double Y0=0.0;
        double Resp_GravEsp=(Ws)/(Vs*Y0);
        this.Grav_Espec_sol = Resp_GravEsp;
    }

}
