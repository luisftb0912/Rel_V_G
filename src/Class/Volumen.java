package Class;

/**
 *
 * @author Name.inc
 */
public class Volumen {
    // atributos Volumen

    private double Vol_Vacios;
    private double Vol_Agua;
    private double Vol_Solidos;
    private double Vol_Aire;
    private double Vol_Total;
    //Constructor

    public Volumen() {
        this.Vol_Vacios = 0.0;
        this.Vol_Agua = 0.0;
        this.Vol_Solidos = 0.0;
        this.Vol_Aire = 0.0;
        this.Vol_Total = 0.0;

    } //Metodos Volumen

    public double getVol_Vacios() {
        return Vol_Vacios;
    }

    public void setVol_Vacios(double Vol_Vacios) {
        if (Vol_Vacios != 0) {
            if (getVol_Agua() != 0 || getVol_Aire() != 0) {
                if (Vol_Vacios >= (getVol_Agua() + getVol_Aire())) {
                    this.Vol_Vacios = Vol_Vacios;
                } else {
                    this.Vol_Vacios = getVol_Agua() + getVol_Aire();
                }
            } else {
                this.Vol_Vacios = Vol_Vacios;
            }

        } else {
            if (getVol_Agua() != 0 && getVol_Aire() != 0) {
                this.Vol_Vacios = getVol_Agua() + getVol_Aire();
            } else if ((getVol_Total() != 0 && getVol_Solidos() != 0) && (getVol_Total() >= getVol_Solidos())) {
                this.Vol_Vacios = getVol_Total() - getVol_Solidos();
            } else {
                this.Vol_Vacios = 0.0;
            }
        }
    }

    public double getVol_Agua() {
        return Vol_Agua;
    }

    public void setVol_Agua(double Vol_Agua) {
        if (Vol_Agua != 0) {
            if (getVol_Vacios() != 0) {
                if (Vol_Agua <= getVol_Vacios()) {
                    this.Vol_Agua = Vol_Agua;
                }
                if (Vol_Agua > getVol_Vacios()) {
                    this.Vol_Agua = 0.0;
                }
            } else {
                this.Vol_Agua = Vol_Agua;
            }
        } else {
            if (getVol_Vacios() != 0 && getVol_Aire() != 0 && (getVol_Vacios() >= getVol_Aire())) {
                this.Vol_Agua = getVol_Vacios() - getVol_Aire();
            } else if (getVol_Total() != 0 && getVol_Solidos() != 0 && getVol_Aire() == 0) {
                this.Vol_Agua = getVol_Total() - (getVol_Solidos() + getVol_Aire());
            } else {
                this.Vol_Agua = 0.0;
            }
        }

    }

    public double getVol_Solidos() {
        return Vol_Solidos;
    }

    public void setVol_Solidos(double Vol_Solidos) {
        if (Vol_Solidos != 0) {
            this.Vol_Solidos = Vol_Solidos;
        } else {
            if (getVol_Total() != 0 && getVol_Vacios() != 0 && (getVol_Total() >= getVol_Vacios())) {
                this.Vol_Solidos = getVol_Total() - getVol_Vacios();
            } else {
                this.Vol_Solidos = 0.0;
            }
        }
        if (Vol_Solidos != 0) {
            if (getVol_Total() != 0) {
                if (Vol_Solidos <= getVol_Total()) {
                    this.Vol_Solidos = Vol_Solidos;
                }
                if (Vol_Solidos > getVol_Total()) {
                    this.Vol_Solidos = 0.0;
                }
            } else {
                this.Vol_Solidos = Vol_Solidos;
            }
        } else {
            if (getVol_Total() != 0 && getVol_Vacios() != 0 && (getVol_Total() >= getVol_Vacios())) {
                this.Vol_Solidos = getVol_Total() - getVol_Vacios();
            } else {
                this.Vol_Solidos = 0.0;
            }
        }
    }

    public double getVol_Aire() {
        return Vol_Aire;
    }

    public void setVol_Aire(double Vol_Aire) {
        if (Vol_Aire != 0) {

            this.Vol_Aire = Vol_Aire;

        } else {

            this.Vol_Aire = 0.0;

        }
    }

    public double getVol_Total() {
        return Vol_Total;
    }

    public void setVol_Total(double Vol_Total) {
        if (Vol_Total != 0) {
                if (Vol_Total >= (getVol_Solidos() + getVol_Vacios())) {
                    this.Vol_Total = Vol_Total;

                } else {
                    this.Vol_Total = getVol_Solidos() + getVol_Agua() + getVol_Aire();
                }
            

        } else {
                if ((getVol_Solidos() != 0 && getVol_Agua() != 0) || getVol_Aire() != 0) {
                    this.Vol_Total = getVol_Solidos() + getVol_Agua() + getVol_Aire();
                } else if (getVol_Solidos() != 0 && getVol_Vacios() != 0) {
                    this.Vol_Total = getVol_Solidos() + getVol_Vacios();
                } else {
                    this.Vol_Total = 0.0;
                }
            

        }
    }

}
