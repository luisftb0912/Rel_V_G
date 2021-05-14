package Class;

public class Peso {
    //atributos Peso

    private double Pes_Agua;
    private double Pes_Solidos;
    private double Pes_Aire;
    private double Pes_Total;

    //Constructor
    public Peso() {
        this.Pes_Agua = 0.0;
        this.Pes_Solidos = 0.0;
        this.Pes_Aire = 0.0;
        this.Pes_Total = 0.0;
    }
    //Metodos Peso

    public double getPes_Agua() {
        return Pes_Agua;
    }

    public void setPes_Agua(double Pes_Agua) {
        if (Pes_Agua != 0) {
            this.Pes_Agua = Pes_Agua;
        } else {
             if (getPes_Solidos() <= getPes_Total() && getPes_Solidos() != 0) {
                this.Pes_Agua = getPes_Total() - getPes_Solidos();
            }else{
                 this.Pes_Agua = 0.0;
             }
        }
    }

    public double getPes_Solidos() {
        return Pes_Solidos;
    }

    public void setPes_Solidos(double Pes_Solidos) {
        if (Pes_Solidos != 0) {
            this.Pes_Solidos = Pes_Solidos;
        } else {
            if ((getPes_Aire() + getPes_Agua()+getPes_Solidos()) <= getPes_Total() && getPes_Agua() != 0 ) {
                this.Pes_Solidos = getPes_Total() - (getPes_Agua() + getPes_Aire());
            }else{
                this.Pes_Total =0.0;
            }
        }
    }

    public double getPes_Aire() {
        return Pes_Aire;
    }

    public void setPes_Aire(double Pes_Aire) {
        if (Pes_Aire != 0.0) {
            this.Pes_Aire = Pes_Aire;
        } else {
                this.Pes_Aire = 0.0;
        }

    }

    public double getPes_Total() {
        return Pes_Total;
    }

    public void setPes_Total(double Pes_Total) {
        if (Pes_Total != 0) {
            if (Pes_Total >= (getPes_Agua() + getPes_Aire() + getPes_Solidos())) {
                this.Pes_Total = Pes_Total;
                /*if (getPes_Aire() != 0) {
                    this.Pes_Aire = 0.0;
                }
                if (getPes_Solidos() != 0) {
                    this.Pes_Solidos = 0.0;
                }
                if (getPes_Agua() != 0) {
                    this.Pes_Agua = 0.0;
                }*/
            } else {
                this.Pes_Total = getPes_Agua() + getPes_Aire() + getPes_Solidos();
            }
        } else {
            if (getPes_Agua() != 0 || getPes_Aire() != 0 || getPes_Solidos() != 0) {
                this.Pes_Total = getPes_Agua() + getPes_Aire() + getPes_Solidos();
            }else{
                this.Pes_Total =0.0;
            }
        }
    }
}
