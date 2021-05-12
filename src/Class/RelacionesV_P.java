package Class;

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
        double Resp_FV = Math.round((Resp_Vacios) * 100.0) / 100.0;
        this.Relacion_vacios = Resp_FV;
    }

    public double getPorosidad() {
        return Porosidad;
    }

    public void setPorosidad(double Vv, double Vt) {
        double Resp_Porosidad = (Vv / Vt) * 100;
        double Resp_FP = Math.round((Resp_Porosidad) * 100.0) / 100.0;
        this.Porosidad = Resp_FP;
    }

    public double getGrado_Saturacion() {
        return grado_Saturacion;
    }

    public void setGrado_Saturacion(double Vw, double Vv) {
        double Resp_Gs = (Vw / Vv) * 100;
        double Resp_FGS = Math.round((Resp_Gs) * 100.0) / 100.0;
        this.grado_Saturacion = Resp_FGS;
    }

    //Metodos Gravimetricas
    public double getHumedad() {
        return Humedad;
    }

    public void setHumedad(double Ww, double Ws) {
        double Resp_Hum = (Ww / Ws) * 100;
        double Resp_FH = Math.round((Resp_Hum) * 100.0) / 100.0;
        this.Humedad = Resp_FH;
    }

    public double getPeso_Espec() {
        return Peso_Espec;
    }

    public void setPeso_Espec(double Wt, double Vt) {
        double Resp_PesEs = (Wt / Vt);
        double Resp_FPE = Math.round((Resp_PesEs) * 100.0) / 100.0;
        this.Peso_Espec = Resp_FPE;
    }

    public double getPeso_Espec_Seco() {
        return Peso_Espec_Seco;
    }

    public void setPeso_Espec_Seco(double Ws, double Vt) {
        double Resp_PesEsSec = (Ws / Vt) * 100;
        double Resp_FPES = Math.round((Resp_PesEsSec) * 100.0) / 100.0;
        this.Peso_Espec_Seco = Resp_FPES;
    }

    public double getGrav_Espec_sol() {
        return Grav_Espec_sol;
    }

    public void setGrav_Espec_sol(double Ws, double Vs) {
        //peso especifico del agua Y0=1
        Double Y0 = 1.0;
        double Resp_GravEsp = (Ws) / (Vs * Y0);
        double Resp_GE = Math.round((Resp_GravEsp) * 100.0) / 100.0;
        this.Grav_Espec_sol = Resp_GE;
    }

}
