/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Class.*;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alexis
 */
public final class Interface extends javax.swing.JFrame {

    private RelacionesV_P Rel_V_P = new RelacionesV_P();
    private Volumen volumen = new Volumen();
    private Peso peso = new Peso();

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Botones/graf_suelo.png")));
        //Imagenes Botones
        B_Formulas.setIcon(setIcono("/Imagenes/Botones/imgFormula.jpg", B_Formulas));
        B_Formulas.setPressedIcon(setIconoPress("/Imagenes/Botones/imgFormula.jpg", B_Formulas, 10, 10));
        B_Procedimiento.setIcon(setIcono("/Imagenes/Botones/imgProced.png", B_Procedimiento));
        B_Procedimiento.setPressedIcon(setIconoPress("/Imagenes/Botones/imgProced.png", B_Procedimiento, 10, 10));
        B_Graf.setIcon(setIcono("/Imagenes/Botones/graf_suelo.png", B_Graf));
        B_Graf.setPressedIcon(setIconoPress("/Imagenes/Botones/graf_suelo.png", B_Graf, 10, 10));
        B_limpiar.setIcon(setIcono("/Imagenes/Botones/imgLimpiar.png", B_limpiar));
        B_limpiar.setPressedIcon(setIconoPress("/Imagenes/Botones/imgLimpiar.png", B_limpiar, 10, 10));

        //edicion desactivada
        graf_Vt.setEditable(false);
        graf_Vv.setEditable(false);
        graf_Va.setEditable(false);
        graf_Vw.setEditable(false);
        graf_Vs.setEditable(false);
        graf_Wa.setEditable(false);
        graf_Ws.setEditable(false);
        graf_Wt.setEditable(false);
        graf_Ww.setEditable(false);

        TxtArea_Resultado.setEditable(false);
        //TxtArea_Resultado.setLineWrap(true);
        //Desactivar panel de R.V Y R.G
        for (Component RV : jPanelRelacionesVolumetricas.getComponents()) {
            RV.setEnabled(false);
        }
        for (Component RG : jPanelRelacionesGravimetricas.getComponents()) {
            RG.setEnabled(false);
        }
        for (Component PGraf : jPanelGraficaMuestra.getComponents()) {
            PGraf.setEnabled(false);
        }
        for (Component PG : panelGaseoso.getComponents()) {
            PG.setEnabled(false);
        }
        B_Graf.setEnabled(false);
        B_Calcular.setEnabled(false);

        B_limpiar.setEnabled(false);

        //Panel de datos
        //Volumen
        jtVol_Vacio.setEnabled(false);
        jtVol_Agua.setEnabled(false);
        jtVol_Aire.setEnabled(false);
        jtVol_Total.setEnabled(false);
        jtVol_solidos.setEnabled(false);
        jCB_VolAire.setEnabled(false);
        //Peso
        jtPes_Agua.setEnabled(false);
        jtPes_Aire.setEnabled(false);
        jtPes_Solid.setEnabled(false);
        jtPes_Total.setEnabled(false);
        jCB_PesoAire.setEnabled(false);
        flech3.setVisible(false);
        texttitmuestra1.setVisible(true);
        texttitmuestra2.setVisible(false);
        //Inicializar datos
        //Volumen
        jtVol_Aire.setText("0.0");
        jtVol_Total.setText("0.0");
        jtVol_Vacio.setText("0.0");
        jtVol_solidos.setText("0.0");
        jtVol_Agua.setText("0.0");
        graf_Va.setText("0.0");
        graf_Vw.setText("0.0");
        graf_Vs.setText("0.0");
        graf_Vv.setText("0.0");
        graf_Vt.setText("0.0");

        //Peso
        jtPes_Agua.setText("0.0");
        jtPes_Aire.setText("0.0");
        jtPes_Solid.setText("0.0");
        jtPes_Total.setText("0.0");
        graf_Wa.setText("0.0");
        graf_Ws.setText("0.0");
        graf_Ww.setText("0.0");
        graf_Wt.setText("0.0");
        //
        B_Procedimiento.setEnabled(false);
    }
    private int countcal = 0;

    public void Limpiar(JPanel panel) {
        for (Object RVG : panel.getComponents()) {
            if (RVG instanceof JTextField) {
                ((JTextField) RVG).setText("0.0");
                ((JTextField) RVG).setEnabled(false);
            }
            if (RVG instanceof JTextArea) {
                ((JTextArea) RVG).setText("");
            }
            if (RVG instanceof JCheckBox) {
                ((JCheckBox) RVG).setSelected(false);
                ((JCheckBox) RVG).setEnabled(false);
            }

        }

        TxtArea_Resultado.setText("");
        B_Graf.setEnabled(false);
        B_Calcular.setEnabled(false);
        B_Procedimiento.setEnabled(false);
        B_limpiar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulodelAplicativo = new javax.swing.JLabel();
        jPanelGraficaMuestra = new javax.swing.JPanel();
        jLabelPESO = new javax.swing.JLabel();
        jLabelVOLUMEN = new javax.swing.JLabel();
        jLabelVw = new javax.swing.JLabel();
        jLabelFASESOLIDA = new javax.swing.JLabel();
        jLabelWt = new javax.swing.JLabel();
        jLabelWs = new javax.swing.JLabel();
        graf_Vw = new javax.swing.JTextField();
        graf_Wt = new javax.swing.JTextField();
        graf_Ww = new javax.swing.JTextField();
        jLabelWw = new javax.swing.JLabel();
        graf_Ws = new javax.swing.JTextField();
        jLabelVs = new javax.swing.JLabel();
        jLabelVt = new javax.swing.JLabel();
        graf_Vs = new javax.swing.JTextField();
        graf_Vt = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        flech2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        flech1 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        flech3 = new javax.swing.JPanel();
        texttitmuestra1 = new javax.swing.JLabel();
        texttitmuestra2 = new javax.swing.JLabel();
        jLabelFASELIQUIDA = new javax.swing.JLabel();
        panelGaseoso = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        graf_Wa = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        graf_Vv = new javax.swing.JTextField();
        graf_Va = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelvolumen = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtVol_Agua = new javax.swing.JTextField();
        jtVol_Total = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtVol_solidos = new javax.swing.JTextField();
        jtVol_Aire = new javax.swing.JTextField();
        textaire = new javax.swing.JLabel();
        jtVol_Vacio = new javax.swing.JTextField();
        jCB_VolAire = new javax.swing.JCheckBox();
        panelpeso = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textaire2 = new javax.swing.JLabel();
        jtPes_Total = new javax.swing.JTextField();
        jtPes_Agua = new javax.swing.JTextField();
        jtPes_Solid = new javax.swing.JTextField();
        jtPes_Aire = new javax.swing.JTextField();
        jCB_PesoAire = new javax.swing.JCheckBox();
        B_Graf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelQCalc = new javax.swing.JPanel();
        jPanelRelacionesVolumetricas = new javax.swing.JPanel();
        jCBRelacionVacio = new javax.swing.JCheckBox();
        jCBPorosidad = new javax.swing.JCheckBox();
        jCBGradoSaturacion = new javax.swing.JCheckBox();
        jPanelRelacionesGravimetricas = new javax.swing.JPanel();
        jCBContenidoHumedad = new javax.swing.JCheckBox();
        jCBPesoEspecifico = new javax.swing.JCheckBox();
        jCBPesoEspecificoSeco = new javax.swing.JCheckBox();
        jCBGravedadEspecifica = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButtonNormal = new javax.swing.JButton();
        jButtonSaturado = new javax.swing.JButton();
        B_Formulas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea_Resultado = new javax.swing.JTextArea();
        B_Calcular = new javax.swing.JButton();
        B_Procedimiento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        B_limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulodelAplicativo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelTitulodelAplicativo.setText("CÁLCULO  DE RELACIONES ENTRE LAS FASES DEL SUELO");
        getContentPane().add(jLabelTitulodelAplicativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 520, -1));

        jPanelGraficaMuestra.setBackground(new java.awt.Color(255, 204, 51));
        jPanelGraficaMuestra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPESO.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelPESO.setText("PESO (g)");
        jPanelGraficaMuestra.add(jLabelPESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 110, -1));

        jLabelVOLUMEN.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelVOLUMEN.setText("VOLUMEN (cm3)");
        jPanelGraficaMuestra.add(jLabelVOLUMEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, -1));

        jLabelVw.setText("Vw");
        jPanelGraficaMuestra.add(jLabelVw, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 170, 20, -1));

        jLabelFASESOLIDA.setBackground(new java.awt.Color(153, 51, 0));
        jLabelFASESOLIDA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFASESOLIDA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFASESOLIDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFASESOLIDA.setText("FASE SOLIDA");
        jLabelFASESOLIDA.setOpaque(true);
        jPanelGraficaMuestra.add(jLabelFASESOLIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 90));

        jLabelWt.setText("Wt");
        jPanelGraficaMuestra.add(jLabelWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabelWs.setText("Ws");
        jPanelGraficaMuestra.add(jLabelWs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        jPanelGraficaMuestra.add(graf_Vw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 50, -1));
        jPanelGraficaMuestra.add(graf_Wt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 50, -1));
        jPanelGraficaMuestra.add(graf_Ww, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 50, -1));

        jLabelWw.setText("Ww");
        jPanelGraficaMuestra.add(jLabelWw, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));
        jPanelGraficaMuestra.add(graf_Ws, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 50, -1));

        jLabelVs.setText("Vs");
        jPanelGraficaMuestra.add(jLabelVs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabelVt.setText("Vt");
        jPanelGraficaMuestra.add(jLabelVt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanelGraficaMuestra.add(graf_Vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 50, -1));
        jPanelGraficaMuestra.add(graf_Vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, -1));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 30));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 30));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, 50));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, -1));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 40, -1));

        flech2.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(flech2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 20, -1));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 40, -1));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 140, -1));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, 20));

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, -1));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 30));

        flech1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(flech1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 70));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 20));

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 110));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 110));

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 10, 30));

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 80, -1));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 10, 30));

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, -1));

        flech3.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(flech3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));

        texttitmuestra1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        texttitmuestra1.setText("Muestra Normal");
        jPanelGraficaMuestra.add(texttitmuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        texttitmuestra2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        texttitmuestra2.setText("Muestra Saturado");
        jPanelGraficaMuestra.add(texttitmuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabelFASELIQUIDA.setBackground(new java.awt.Color(0, 102, 204));
        jLabelFASELIQUIDA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFASELIQUIDA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFASELIQUIDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFASELIQUIDA.setText("FASE LIQUIDA");
        jLabelFASELIQUIDA.setOpaque(true);
        jPanelGraficaMuestra.add(jLabelFASELIQUIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, 90));

        panelGaseoso.setBackground(new java.awt.Color(255, 204, 51));
        panelGaseoso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setText("Vv");
        panelGaseoso.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        panelGaseoso.add(graf_Wa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 50, -1));

        jLabel55.setText("Wa");
        panelGaseoso.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));
        panelGaseoso.add(graf_Vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, 30));
        panelGaseoso.add(graf_Va, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, -1));

        jLabel58.setText("Va");
        panelGaseoso.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 30));

        jPanel48.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 20));

        jPanel50.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 140, -1));

        jPanel54.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 120));

        jPanel55.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, -1));

        jPanel57.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 30));

        jPanel58.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 120));

        jPanel59.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 70));

        jPanel61.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 40));

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FASE LIQUIDA");
        jLabel12.setOpaque(true);
        panelGaseoso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, 90));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FASE LIQUIDA");
        jLabel6.setOpaque(true);
        panelGaseoso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 150, 90));

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));
        panelGaseoso.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 30));

        jPanelGraficaMuestra.add(panelGaseoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 120));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGraficaMuestra.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 10, 30));

        getContentPane().add(jPanelGraficaMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 530, 350));

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanelDatos.setToolTipText("Datos");
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setToolTipText("Ingresar Datos");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelvolumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Volumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(204, 0, 204))); // NOI18N
        panelvolumen.setToolTipText("Volumen");
        panelvolumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Volumen de vacíos");
        panelvolumen.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel22.setText("Volumen total");
        panelvolumen.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel23.setText("Volumen de agua");
        panelvolumen.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jtVol_Agua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVol_AguaKeyReleased(evt);
            }
        });
        panelvolumen.add(jtVol_Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, -1));

        jtVol_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVol_TotalKeyReleased(evt);
            }
        });
        panelvolumen.add(jtVol_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, -1));

        jLabel24.setText("Volumen de sólidos");
        panelvolumen.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jtVol_solidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_solidosActionPerformed(evt);
            }
        });
        jtVol_solidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVol_solidosKeyReleased(evt);
            }
        });
        panelvolumen.add(jtVol_solidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        jtVol_Aire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_AireActionPerformed(evt);
            }
        });
        jtVol_Aire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVol_AireKeyReleased(evt);
            }
        });
        panelvolumen.add(jtVol_Aire, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 70, -1));

        textaire.setText("Volumen del aire");
        panelvolumen.add(textaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jtVol_Vacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_VacioActionPerformed(evt);
            }
        });
        jtVol_Vacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVol_VacioKeyReleased(evt);
            }
        });
        panelvolumen.add(jtVol_Vacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jCB_VolAire.setToolTipText("Editar");
        jCB_VolAire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_VolAireActionPerformed(evt);
            }
        });
        panelvolumen.add(jCB_VolAire, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jPanel1.add(panelvolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 200));

        panelpeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        panelpeso.setToolTipText("Peso");
        panelpeso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Peso de agua");
        panelpeso.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel27.setText("Peso total");
        panelpeso.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel28.setText("Peso de sólidos");
        panelpeso.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        textaire2.setText("Peso del aire");
        panelpeso.add(textaire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jtPes_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_TotalActionPerformed(evt);
            }
        });
        jtPes_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPes_TotalKeyReleased(evt);
            }
        });
        panelpeso.add(jtPes_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 70, -1));

        jtPes_Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_AguaActionPerformed(evt);
            }
        });
        jtPes_Agua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPes_AguaKeyReleased(evt);
            }
        });
        panelpeso.add(jtPes_Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

        jtPes_Solid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_SolidActionPerformed(evt);
            }
        });
        jtPes_Solid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPes_SolidKeyReleased(evt);
            }
        });
        panelpeso.add(jtPes_Solid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

        jtPes_Aire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_AireActionPerformed(evt);
            }
        });
        jtPes_Aire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPes_AireKeyReleased(evt);
            }
        });
        panelpeso.add(jtPes_Aire, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, -1));

        jCB_PesoAire.setToolTipText("Editar");
        jCB_PesoAire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_PesoAireActionPerformed(evt);
            }
        });
        panelpeso.add(jCB_PesoAire, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jPanel1.add(panelpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 240, 140));

        B_Graf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_GrafActionPerformed(evt);
            }
        });
        jPanel1.add(B_Graf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 60, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Gráfico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jPanelDatos.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 560, 250));

        panelQCalc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Que desea calcular?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panelQCalc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRelacionesVolumetricas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Volumétricas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(204, 0, 204))); // NOI18N
        jPanelRelacionesVolumetricas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCBRelacionVacio.setText("Relación de vacíos (e)");
        jCBRelacionVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRelacionVacioActionPerformed(evt);
            }
        });
        jPanelRelacionesVolumetricas.add(jCBRelacionVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jCBPorosidad.setText("Porosidad (n)");
        jCBPorosidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPorosidadActionPerformed(evt);
            }
        });
        jPanelRelacionesVolumetricas.add(jCBPorosidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jCBGradoSaturacion.setText("Grado de Saturación (S)");
        jCBGradoSaturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGradoSaturacionActionPerformed(evt);
            }
        });
        jPanelRelacionesVolumetricas.add(jCBGradoSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        panelQCalc.add(jPanelRelacionesVolumetricas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 100));

        jPanelRelacionesGravimetricas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Gravimétricas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanelRelacionesGravimetricas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCBContenidoHumedad.setText("Humedad (w)");
        jCBContenidoHumedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBContenidoHumedadActionPerformed(evt);
            }
        });
        jPanelRelacionesGravimetricas.add(jCBContenidoHumedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jCBPesoEspecifico.setText("Peso Esp. Húmedo (Y)");
        jCBPesoEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPesoEspecificoActionPerformed(evt);
            }
        });
        jPanelRelacionesGravimetricas.add(jCBPesoEspecifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jCBPesoEspecificoSeco.setText("Peso específico seco (Yd)");
        jCBPesoEspecificoSeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPesoEspecificoSecoActionPerformed(evt);
            }
        });
        jPanelRelacionesGravimetricas.add(jCBPesoEspecificoSeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jCBGravedadEspecifica.setText("Gravedad Esp. Sólido (Gs)");
        jCBGravedadEspecifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGravedadEspecificaActionPerformed(evt);
            }
        });
        jPanelRelacionesGravimetricas.add(jCBGravedadEspecifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        panelQCalc.add(jPanelRelacionesGravimetricas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 370, 100));

        jPanelDatos.add(panelQCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 720, 150));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Muestra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonNormal.setText("Normal");
        jButtonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNormalActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        jButtonSaturado.setText("Saturado");
        jButtonSaturado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaturadoActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSaturado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        jPanelDatos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 250, 80));

        B_Formulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FormulasActionPerformed(evt);
            }
        });
        jPanelDatos.add(B_Formulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 60, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fórmulas");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 90, 60, -1));

        getContentPane().add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1320, 290));

        jPanelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanelResultados.setToolTipText("Resultados");
        jPanelResultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtArea_Resultado.setColumns(20);
        TxtArea_Resultado.setRows(5);
        jScrollPane1.setViewportView(TxtArea_Resultado);

        jPanelResultados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 430, 280));

        getContentPane().add(jPanelResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 490, 340));

        B_Calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_Calcular.setText("Calcular");
        B_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(B_Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 80, 60));

        B_Procedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ProcedimientoActionPerformed(evt);
            }
        });
        getContentPane().add(B_Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 490, 60, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Procedimiento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, -1, -1));

        B_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(B_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 80, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Limpiar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPes_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_TotalActionPerformed

    private void jtVol_solidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_solidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_solidosActionPerformed

    private void jtVol_AireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_AireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_AireActionPerformed

    private void jtPes_AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_AguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_AguaActionPerformed

    private void jtPes_SolidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_SolidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_SolidActionPerformed

    private void jtPes_AireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_AireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_AireActionPerformed

    private void B_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CalcularActionPerformed
        // TODO add your handling code here:
        //evento cantidad boton
        B_Procedimiento.setEnabled(true);
        countcal++;
        if (countcal > 1) {
            TxtArea_Resultado.setText("");
        }
        //
        if (jCBRelacionVacio.isSelected() == true || jCBGradoSaturacion.isSelected() == true || jCBPorosidad.isSelected() == true) {
            TxtArea_Resultado.append("                                   Relaciones Volumétricas     " + "\n" + "\n");
        }
        //Relacion de Vacios
        if (jCBRelacionVacio.isSelected() == true) {
            Rel_V_P.setRelacion_vacios(volumen.getVol_Vacios(), volumen.getVol_Solidos());
            TxtArea_Resultado.append("Relación de Vacios: " + Double.toString(Rel_V_P.getRelacion_vacios()) + "\n" + "\n");
        }
        //Porosidad
        if (jCBPorosidad.isSelected() == true) {
            Rel_V_P.setPorosidad(volumen.getVol_Vacios(), volumen.getVol_Total());
            TxtArea_Resultado.append("Porosidad: " + Rel_V_P.getPorosidad() + " %" );
            if (29.0 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 50) {
                TxtArea_Resultado.append(" <------ Arena Limpia y uniforme" + "\n" + "\n");
            } else if (23 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 47) {
                TxtArea_Resultado.append(" <------ Arena Limosa" + "\n" + "\n");
            } else if (29 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 55) {
                TxtArea_Resultado.append(" <------ Arena Micácea" + "\n" + "\n");
            } else if (29 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 52) {
                TxtArea_Resultado.append(" <------ Limo Inorgánico" + "\n" + "\n");
            } else if (12 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 46) {
                TxtArea_Resultado.append(" <------ Arena Limosa Grava" + "\n" + "\n");
            } else if (17 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 49) {
                TxtArea_Resultado.append(" <------ Arena Fina a Gruesa" + "\n" + "\n");
            }
        }
        //Grado de Saturación
        if (jCBGradoSaturacion.isSelected() == true) {
            Rel_V_P.setGrado_Saturacion(volumen.getVol_Agua(), volumen.getVol_Vacios());
            TxtArea_Resultado.append("\n"+"Grado de Saturación: " + Double.toString(Rel_V_P.getGrado_Saturacion()) + "%");
            if (0 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 25) {
                TxtArea_Resultado.append(" <------ Suelo Seco" + "\n" + "\n");
            } else if (26 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 50) {
                TxtArea_Resultado.append(" <------ Suelo Húmedo" + "\n" + "\n");
            } else if (51 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 80) {
                TxtArea_Resultado.append(" <------ Suelo Muy Húmedo" + "\n" + "\n");
            } else if (81 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 95) {
                TxtArea_Resultado.append(" <------ Suelo Altamente Saturado" + "\n" + "\n");
            } else if (96 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 100) {
                TxtArea_Resultado.append(" <------ Suelo Saturado" + "\n" + "\n");
            }
        }
        if (jCBContenidoHumedad.isSelected() == true || jCBPesoEspecifico.isSelected() == true || jCBPesoEspecificoSeco.isSelected() == true || jCBGravedadEspecifica.isSelected() == true) {
            TxtArea_Resultado.append("\n" + "                                   Relaciones Gravimétricas    " + "\n" + "\n");
        }
        //Contenido de Humedad
        if (jCBContenidoHumedad.isSelected() == true) {
            Rel_V_P.setHumedad(peso.getPes_Agua(), peso.getPes_Solidos());
            TxtArea_Resultado.append("Humedad: " + Double.toString(Rel_V_P.getHumedad()) + " %" + "\n" + "\n");
        }
        //Peso Especifico
        if (jCBPesoEspecifico.isSelected() == true) {
            Rel_V_P.setPeso_Espec(peso.getPes_Total(), volumen.getVol_Total());
            TxtArea_Resultado.append("Peso Específico Húmedo: " + Double.toString(Rel_V_P.getPeso_Espec()) + " g/cm3" + "\n" + "\n");
        }
        //Peso Especifico Seco
        if (jCBPesoEspecificoSeco.isSelected() == true) {
            Rel_V_P.setPeso_Espec_Seco(peso.getPes_Solidos(), volumen.getVol_Total());
            TxtArea_Resultado.append("Peso Específico Seco: " + Double.toString(Rel_V_P.getPeso_Espec_Seco()) + " g/cm3" );
            if (1.33 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.89) {
                TxtArea_Resultado.append(" <------ Arena Limpia y uniforme" + "\n" + "\n");
            } else if (1.39 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.03) {
                TxtArea_Resultado.append(" <------ Arena Micácea" + "\n" + "\n");
            } else if (1.22 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.92) {
                TxtArea_Resultado.append(" <------ Limo Inorgánico" + "\n" + "\n");
            } else if (1.28 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.89) {
                TxtArea_Resultado.append(" <------ Arena Limosa Grava" + "\n" + "\n");
            } else if (1.42 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.34) {
                TxtArea_Resultado.append(" <------ Arena Fina a Gruesa" + "\n" + "\n");
            } else if (1.36 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.21) {
                TxtArea_Resultado.append(" <------ Arena Limosa" + "\n" + "\n");
            }
        }
        //Gravedad Especifica de Solidos
        if (jCBGravedadEspecifica.isSelected() == true) {
            Rel_V_P.setGrav_Espec_sol(peso.getPes_Solidos(), volumen.getVol_Solidos());
            TxtArea_Resultado.append("Gravedad Específica: " + Double.toString(Rel_V_P.getGrav_Espec_sol()) + " g/cm3" + "\n" + "\n");
        }
    }//GEN-LAST:event_B_CalcularActionPerformed

    private void jtVol_VacioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVol_VacioKeyReleased
        // TODO add your handling code here:
        String Vv = jtVol_Vacio.getText();
        if ((Vv.equals("") == false && Vv.matches("[a-z].*") == false) || Vv.contains(".")) {
            volumen.setVol_Vacios(Double.parseDouble(Vv));
        } else {
            volumen.setVol_Vacios(0.0);
        }

    }//GEN-LAST:event_jtVol_VacioKeyReleased

    private void jtVol_AireKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVol_AireKeyReleased
        // TODO add your handling code here:
        String Va = jtVol_Aire.getText();
        if ((Va.equals("") == false && Va.matches("[a-z].*") == false) || Va.contains(".")) {
            volumen.setVol_Aire(Double.parseDouble(Va));
        } else {
            volumen.setVol_Aire(0.0);
        }

    }//GEN-LAST:event_jtVol_AireKeyReleased

    private void jtPes_AguaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPes_AguaKeyReleased
        // TODO add your handling code here:
        String Ww = jtPes_Agua.getText();

        if (Ww.equals("") == false && Ww.matches("[a-z].*") == false || Ww.contains(".")) {
            peso.setPes_Agua(Double.parseDouble(Ww));
        } else {
            peso.setPes_Agua(0.0);
        }
    }//GEN-LAST:event_jtPes_AguaKeyReleased

    private void jtPes_SolidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPes_SolidKeyReleased
        // TODO add your handling code here:
        String Ws = jtPes_Solid.getText();
        if (Ws.equals("") == false && Ws.matches("[a-z].*") == false || Ws.contains(".")) {

            peso.setPes_Solidos(Double.parseDouble(Ws));
        } else {
            peso.setPes_Solidos(0.0);
        }
    }//GEN-LAST:event_jtPes_SolidKeyReleased

    private void jtPes_TotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPes_TotalKeyReleased
        // TODO add your handling code here:
        String Wt = jtPes_Total.getText();
        if (Wt.equals("") == false && Wt.matches("[a-z].*") == false || Wt.contains(".")) {
            peso.setPes_Total(Double.parseDouble(Wt));
        } else {
            peso.setPes_Total(0.0);
        }
    }//GEN-LAST:event_jtPes_TotalKeyReleased

    private void jtPes_AireKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPes_AireKeyReleased
        // TODO add your handling code here:
        String Wa = jtPes_Aire.getText();
        if (Wa.equals("") == false && Wa.matches("[a-z].*") == false || Wa.contains(".")) {
            graf_Wt.setText(Double.toString(peso.getPes_Total()));
        } else {
            peso.setPes_Aire(0.0);
        }
    }//GEN-LAST:event_jtPes_AireKeyReleased

    private void jCBRelacionVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRelacionVacioActionPerformed
        // TODO add your handling code here:
        if (jCBRelacionVacio.isSelected() == true) {
            if (jtVol_Vacio.isEnabled() == false) {
                jtVol_Vacio.setEnabled(true);
            }
            if (jtVol_solidos.isEnabled() == false) {
                jtVol_solidos.setEnabled(true);
            }
        } else {
            if (jCBPorosidad.isSelected() == true || jCBGradoSaturacion.isSelected() == true) {
                jtVol_Vacio.setEnabled(true);
            } else {

                jtVol_Vacio.setEnabled(false);
                volumen.setVol_Vacios(0.0);
            }
            if (jCBGravedadEspecifica.isSelected() == true) {
                jtVol_solidos.setEnabled(true);
            } else {
                jtVol_solidos.setEnabled(false);
                volumen.setVol_Solidos(0.0);
            }
        }
    }//GEN-LAST:event_jCBRelacionVacioActionPerformed

    private void jCBPorosidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPorosidadActionPerformed
        // TODO add your handling code here:
        if (jCBPorosidad.isSelected() == true) {
            if (jtVol_Vacio.isEnabled() == false) {
                jtVol_Vacio.setEnabled(true);
            }
            if (jtVol_Total.isEnabled() == false) {
                jtVol_Total.setEnabled(true);
            }
        } else {
            if (jCBRelacionVacio.isSelected() == true || jCBPorosidad.isSelected() == true) {
                jtVol_Vacio.setEnabled(true);
            } else {
                jtVol_Vacio.setEnabled(false);
                volumen.setVol_Vacios(0.0);
            }
            if (jCBPesoEspecifico.isSelected() == true || jCBPesoEspecificoSeco.isSelected() == true) {
                jtVol_Total.setEnabled(true);
            } else {
                jtVol_Total.setEnabled(false);
                volumen.setVol_Total(0.0);
            }
        }
    }//GEN-LAST:event_jCBPorosidadActionPerformed

    private void jCBGradoSaturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGradoSaturacionActionPerformed
        // TODO add your handling code here:
        if (jCBGradoSaturacion.isSelected() == true) {
            if (jtVol_Vacio.isEnabled() == false) {
                jtVol_Vacio.setEnabled(true);
            }
            if (jtVol_Agua.isEnabled() == false) {
                jtVol_Agua.setEnabled(true);
            }
        } else {
            if (jCBRelacionVacio.isSelected() == true || jCBPorosidad.isSelected() == true) {
                jtVol_Vacio.setEnabled(true);
            } else {
                jtVol_Vacio.setEnabled(false);
                volumen.setVol_Vacios(0.0);
            }
            jtVol_Agua.setEnabled(false);
            volumen.setVol_Agua(0.0);
        }
    }//GEN-LAST:event_jCBGradoSaturacionActionPerformed

    private void jCBContenidoHumedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBContenidoHumedadActionPerformed
        // TODO add your handling code here:
        if (jCBContenidoHumedad.isSelected() == true) {
            if (jtPes_Agua.isEnabled() == false) {
                jtPes_Agua.setEnabled(true);
            }
            if (jtPes_Solid.isEnabled() == false) {
                jtPes_Solid.setEnabled(true);
            }
        } else {
            if (jCBPesoEspecifico.isSelected() == true || jCBGravedadEspecifica.isSelected() == true) {
                jtPes_Solid.setEnabled(true);
            } else {
                jtPes_Solid.setEnabled(false);
            }
            jtPes_Agua.setEnabled(false);
        }
    }//GEN-LAST:event_jCBContenidoHumedadActionPerformed

    private void jCBPesoEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPesoEspecificoActionPerformed
        // TODO add your handling code here:
        if (jCBPesoEspecifico.isSelected() == true) {
            if (jtVol_Total.isEnabled() == false) {
                jtVol_Total.setEnabled(true);
            }
            if (jtPes_Total.isEnabled() == false) {
                jtPes_Total.setEnabled(true);
            }
        } else {
            if (jCBPesoEspecificoSeco.isSelected() == true || jCBPorosidad.isSelected() == true) {
                jtVol_Total.setEnabled(true);
            } else {
                jtVol_Total.setEnabled(false);
            }
            jtPes_Total.setEnabled(false);
        }
    }//GEN-LAST:event_jCBPesoEspecificoActionPerformed

    private void jCBPesoEspecificoSecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPesoEspecificoSecoActionPerformed
        // TODO add your handling code here:
        if (jCBPesoEspecificoSeco.isSelected() == true) {
            if (jtPes_Solid.isEnabled() == false) {
                jtPes_Solid.setEnabled(true);
            }
            if (jtVol_Total.isEnabled() == false) {
                jtVol_Total.setEnabled(true);
            }
        } else {
            if (jCBGravedadEspecifica.isSelected() == true || jCBContenidoHumedad.isSelected() == true) {
                jtPes_Solid.setEnabled(true);
            } else {
                jtPes_Solid.setEnabled(false);
            }
            if (jCBPesoEspecifico.isSelected() == true || jCBPorosidad.isSelected() == true) {
                jtVol_Total.setEnabled(true);
            } else {
                jtVol_Total.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCBPesoEspecificoSecoActionPerformed

    private void jCBGravedadEspecificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGravedadEspecificaActionPerformed
        // TODO add your handling code here:
        if (jCBGravedadEspecifica.isSelected() == true) {
            if (jtVol_solidos.isEnabled() == false) {
                jtVol_solidos.setEnabled(true);
            }
            if (jtPes_Solid.isEnabled() == false) {
                jtPes_Solid.setEnabled(true);
            }
        } else {
            if (jCBPesoEspecificoSeco.isSelected() == true || jCBContenidoHumedad.isSelected() == true) {
                jtPes_Solid.setEnabled(true);
            } else {
                jtPes_Solid.setEnabled(false);
            }
            if (jCBRelacionVacio.isSelected() == true) {
                jtVol_solidos.setEnabled(true);
            } else {
                jtVol_solidos.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCBGravedadEspecificaActionPerformed

    private void jButtonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNormalActionPerformed
        // TODO add your handling code here:
        panelGaseoso.setVisible(true);
        flech1.setVisible(true);
        flech2.setVisible(true);
        flech3.setVisible(false);
        textaire.setVisible(true);
        textaire2.setVisible(true);
        jtVol_Aire.setVisible(true);
        jtPes_Aire.setVisible(true);
        texttitmuestra2.setVisible(false);
        texttitmuestra1.setVisible(true);
        jCB_VolAire.setVisible(true);
        jCB_PesoAire.setVisible(true);
        jCB_VolAire.setEnabled(true);
        jCB_PesoAire.setEnabled(true);
        //activar paneles de R.V y R.G
        for (Component RV : jPanelRelacionesVolumetricas.getComponents()) {
            RV.setEnabled(true);
        }
        for (Component RG : jPanelRelacionesGravimetricas.getComponents()) {
            RG.setEnabled(true);
        }

        B_Graf.setEnabled(true);


    }//GEN-LAST:event_jButtonNormalActionPerformed

    private void jButtonSaturadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaturadoActionPerformed
        // TODO add your handling code here:

        panelGaseoso.setVisible(false);
        texttitmuestra1.setVisible(false);
        texttitmuestra2.setVisible(true);
        flech1.setVisible(false);
        flech2.setVisible(false);
        flech3.setVisible(true);
        textaire.setVisible(false);
        textaire2.setVisible(false);
        jtVol_Aire.setVisible(false);
        jtPes_Aire.setVisible(false);
        jCB_VolAire.setVisible(false);
        jCB_PesoAire.setVisible(false);
        //activar paneles de R.V y R.G
        for (Component RV : jPanelRelacionesVolumetricas.getComponents()) {
            RV.setEnabled(true);
        }
        for (Component RG : jPanelRelacionesGravimetricas.getComponents()) {
            RG.setEnabled(true);
        }
        B_Graf.setEnabled(true);


    }//GEN-LAST:event_jButtonSaturadoActionPerformed

    private void jCB_PesoAireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_PesoAireActionPerformed
        // TODO add your handling code here:
        if (jCB_PesoAire.isSelected() == true) {
            jtPes_Aire.setEnabled(true);
        } else {
            jtPes_Aire.setEnabled(false);
        }
    }//GEN-LAST:event_jCB_PesoAireActionPerformed

    private void jCB_VolAireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_VolAireActionPerformed

        if (jCB_VolAire.isSelected() == true) {
            jtVol_Aire.setEnabled(true);

        } else {
            jtVol_Aire.setEnabled(false);
        }
    }//GEN-LAST:event_jCB_VolAireActionPerformed

    private void jtVol_TotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVol_TotalKeyReleased
        // TODO add your handling code here:
        String Vt = jtVol_Total.getText();
        if ((Vt.equals("") == false && Vt.matches("[a-z].*") == false) || Vt.contains(".")) {
            volumen.setVol_Total(Double.parseDouble(Vt));
        } else {
            volumen.setVol_Total(0.0);
        }
    }//GEN-LAST:event_jtVol_TotalKeyReleased

    private void jtVol_AguaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVol_AguaKeyReleased
        // TODO add your handling code here:
        String Vw = jtVol_Agua.getText();
        if ((Vw.equals("") == false && Vw.matches("[a-z].*") == false) || Vw.contains(".")) {
            volumen.setVol_Agua(Double.parseDouble(Vw));
        } else {
            volumen.setVol_Agua(0.0);
        }
    }//GEN-LAST:event_jtVol_AguaKeyReleased

    private void jtVol_solidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVol_solidosKeyReleased
        // TODO add your handling code here:
        String Vs = jtVol_solidos.getText();
        if ((Vs.equals("") == false && Vs.matches("[a-z].*") == false) || Vs.contains(".")) {
            volumen.setVol_Solidos(Double.parseDouble(Vs));
        } else {
            volumen.setVol_Solidos(0.0);
        }
    }//GEN-LAST:event_jtVol_solidosKeyReleased

    private void B_FormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FormulasActionPerformed
        // TODO add your handling code here:
        Formulas vent_formulas = new Formulas();
        vent_formulas.setVisible(true);
    }//GEN-LAST:event_B_FormulasActionPerformed

    private void B_ProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ProcedimientoActionPerformed
        // TODO add your handling code here:
        Procedimiento vent_proced = new Procedimiento();
        vent_proced.setVisible(true);
        //RELACIONES VOLUMÉTRICAS
        //Relacion de Vacios
        if (jCBRelacionVacio.isSelected() == true) {
            Procedimiento.V2_JB_e.setVisible(true);
            Procedimiento.JTXTA_Pe.append(" Relaciones Volumétricas" + "\n" + "\n");
            Rel_V_P.setRelacion_vacios(volumen.getVol_Vacios(), volumen.getVol_Solidos());
            Procedimiento.JTXTA_Pe.append("Datos: " + "\n" + "Volumen de Vacios (Vv): " + volumen.getVol_Vacios() + "\n"
                    + "Volumen de Sólidos (Vs): " + volumen.getVol_Solidos() + "\n" + "Solución:" + "\n" + "e= Vv / Vs" + "\n" + "e= "
                    + volumen.getVol_Vacios() + " / " + volumen.getVol_Solidos() + "\n" + "e= " + Rel_V_P.getRelacion_vacios());
        }
        //Porosidad
        if (jCBPorosidad.isSelected() == true) {
            Procedimiento.V2_JB_n.setVisible(true);
            Procedimiento.JTXTA_Pn.append(" Relaciones Volumétricas" + "\n" + "\n");
            Rel_V_P.setPorosidad(volumen.getVol_Vacios(), volumen.getVol_Total());
            Procedimiento.JTXTA_Pn.append("Datos: " + "\n" + "Volumen de Vacios (Vv): " + volumen.getVol_Vacios() + "\n"
                    + "Volumen de Total (Vt): " + volumen.getVol_Total() + "\n" + "Solución:" + "\n" + "n= (Vv / Vs) x 100" + "\n" + "n= "
                    + "(" + volumen.getVol_Vacios() + " / " + volumen.getVol_Total() + ")" + " x 100" + "\n" + "n= " + Rel_V_P.getPorosidad() + " %");
            if (29 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 50) {
                Procedimiento.JTXTA_Pn.append(" <------ Arena Limpia y uniforme" + "\n" + "\n");
            } else if (23 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 47) {
                Procedimiento.JTXTA_Pn.append(" <------ Arena Limosa" + "\n" + "\n");
            } else if (29 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 55) {
                Procedimiento.JTXTA_Pn.append(" <------ Arena Micácea" + "\n" + "\n");
            } else if (29 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 52) {
                Procedimiento.JTXTA_Pn.append(" <------ Limo Inorgánico" + "\n" + "\n");
            } else if (12 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 46) {
                Procedimiento.JTXTA_Pn.append(" <------ Arena Limosa Grava" + "\n" + "\n");
            } else if (17 <= Rel_V_P.getPorosidad() && Rel_V_P.getPorosidad() <= 49) {
                Procedimiento.JTXTA_Pn.append(" <------ Arena Fina a Gruesa" + "\n" + "\n");
            }
        }
        //Grado de Saturación
        if (jCBGradoSaturacion.isSelected() == true) {
            Procedimiento.V2_JB_S.setVisible(true);
            Procedimiento.JTXTA_PS.append(" Relaciones Volumétricas" + "\n" + "\n");
            Rel_V_P.setGrado_Saturacion(volumen.getVol_Agua(), volumen.getVol_Vacios());
            Procedimiento.JTXTA_PS.append("Datos: " + "\n" + "Volumen de Agua (Vw): " + volumen.getVol_Agua() + "\n"
                    + "Volumen de Vacíos (Vv): " + volumen.getVol_Vacios() + "\n" + "Solución:" + "\n" + "S= (Vw / Vv) x 100" + "\n" + "S= "
                    + "(" + volumen.getVol_Agua() + " / " + volumen.getVol_Vacios() + ")" + " x 100" + "\n" + "S= " + Rel_V_P.getGrado_Saturacion() + " %");
            if (0 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 25) {
                Procedimiento.JTXTA_PS.append(" <------ Suelo Seco" + "\n" + "\n");
            } else if (26 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 50) {
                Procedimiento.JTXTA_PS.append(" <------ Suelo Húmedo" + "\n" + "\n");
            } else if (51 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 80) {
                Procedimiento.JTXTA_PS.append(" <------ Suelo Muy Húmedo" + "\n" + "\n");
            } else if (81 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 95) {
                Procedimiento.JTXTA_PS.append(" <------ Suelo Altamente Saturado" + "\n" + "\n");
            } else if (96 <= Rel_V_P.getGrado_Saturacion() && Rel_V_P.getGrado_Saturacion() <= 100) {
                Procedimiento.JTXTA_PS.append(" <------ Suelo Saturado" + "\n" + "\n");
            }

        }
        //RELACIONES GRAVIMÉTRICAS
        //Contenido de Humedad
        if (jCBContenidoHumedad.isSelected() == true) {
            Procedimiento.V2_JB_W.setVisible(true);
            Procedimiento.JTXTA_PW.append("\n" + " Relaciones Gravimétricas" + "\n" + "\n");
            Rel_V_P.setHumedad(peso.getPes_Agua(), peso.getPes_Solidos());
            Procedimiento.JTXTA_PW.append("Datos: " + "\n" + "Peso de Agua (Ww): " + peso.getPes_Agua() + "\n"
                    + "Peso de Sólido (Ws): " + peso.getPes_Solidos() + "\n" + "Solución:" + "\n" + "W= (Ww / Ws) x 100" + "\n" + "W= "
                    + "(" + peso.getPes_Agua() + " / " + peso.getPes_Solidos() + ")" + " x 100" + "\n" + "W= " + Rel_V_P.getHumedad() + " %");

        }
        //Peso Especifico
        if (jCBPesoEspecifico.isSelected() == true) {
            Procedimiento.V2_JB_Y.setVisible(true);
            Procedimiento.JTXTA_PY.append(" Relaciones Gravimétricas" + "\n" + "\n");
            Rel_V_P.setPeso_Espec(peso.getPes_Total(), volumen.getVol_Total());
            Procedimiento.JTXTA_PY.append("Datos: " + "\n" + "Peso Total (Wt): " + peso.getPes_Total() + "\n"
                    + "Volumen Total (Vt): " + volumen.getVol_Total() + "\n" + "Solución:" + "\n" + "Y= Wt / Vt" + "\n" + "Y= "
                    + peso.getPes_Total() + " / " + volumen.getVol_Total() + "\n" + "Y= " + Rel_V_P.getPeso_Espec() + " g/cm3");
        }
        //Peso Especifico Seco
        if (jCBPesoEspecificoSeco.isSelected() == true) {
            Procedimiento.V2_JB_Yd.setVisible(true);
            Procedimiento.JTXTA_PYd.append(" Relaciones Gravimétricas" + "\n" + "\n");
            Rel_V_P.setPeso_Espec_Seco(peso.getPes_Solidos(), volumen.getVol_Total());
            Procedimiento.JTXTA_PYd.append("Datos: " + "\n" + "Peso de Sólido (Ws): " + peso.getPes_Solidos() + "\n"
                    + "Volumen Total (Vt): " + volumen.getVol_Total() + "\n" + "Solución:" + "\n" + "Yd= Ws / Vt" + "\n" + "Yd= "
                    + peso.getPes_Solidos() + " / " + volumen.getVol_Total() + "\n" + "Yd= " + Rel_V_P.getPeso_Espec_Seco() + " g/cm3");
            if (1.33 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.89) {
                Procedimiento.JTXTA_PYd.append(" <------ Arena Limpia y uniforme" + "\n" + "\n");
            } else if (1.39 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.03) {
                Procedimiento.JTXTA_PYd.append(" <------ Arena Micácea" + "\n" + "\n");
            } else if (1.22 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.92) {
                Procedimiento.JTXTA_PYd.append(" <------ Limo Inorgánico" + "\n" + "\n");
            } else if (1.28 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 1.89) {
                Procedimiento.JTXTA_PYd.append(" <------ Arena Limosa Grava" + "\n" + "\n");
            } else if (1.42 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.34) {
                Procedimiento.JTXTA_PYd.append(" <------ Arena Fina a Gruesa" + "\n" + "\n");
            } else if (1.36 <= Rel_V_P.getPeso_Espec_Seco() && Rel_V_P.getPeso_Espec_Seco() <= 2.21) {
                Procedimiento.JTXTA_PYd.append(" <------ Arena Limosa" + "\n" + "\n");
            }
        }
        //Gravedad Especifica de Solidos
        if (jCBGravedadEspecifica.isSelected() == true) {
            Procedimiento.V2_JB_Gs.setVisible(true);
            Procedimiento.JTXTA_PGs.append(" Relaciones Gravimétricas" + "\n" + "\n");
            Rel_V_P.setGrav_Espec_sol(peso.getPes_Solidos(), volumen.getVol_Solidos());
            Procedimiento.JTXTA_PGs.append("Datos: " + "\n" + "Peso de Sólido (Ws): " + peso.getPes_Solidos() + "\n"
                    + "Volumen De Sólido (Vs): " + volumen.getVol_Solidos() + "\n" + "Peso Esp. del Agua (Yw): " + "1 " + "\n" + "(Se asume 1 [agua en condiciones de laboratorio])"
                    + "\n" + "Solución:" + "\n" + "Yd= Ws / (VsxYw)" + "\n" + "Yd= "
                    + peso.getPes_Solidos() + " / (" + volumen.getVol_Total() + "x 1" + ")" + "\n" + "Yd= " + Rel_V_P.getPeso_Espec_Seco() + " g/cm3");
        }


    }//GEN-LAST:event_B_ProcedimientoActionPerformed

    private void jtVol_VacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_VacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_VacioActionPerformed

    private void B_GrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_GrafActionPerformed
        // TODO add your handling code here:

        String Ww = jtPes_Agua.getText();
        String Wa = jtPes_Aire.getText();
        String Ws = jtPes_Solid.getText();
        String Wt = jtPes_Total.getText();

        String Va = jtVol_Aire.getText();
        String Vw = jtVol_Agua.getText();
        String Vv = jtVol_Vacio.getText();
        String Vs = jtVol_solidos.getText();
        String Vt = jtVol_Total.getText();

        peso.setPes_Agua(Double.parseDouble(Ww));
        peso.setPes_Aire(Double.parseDouble(Wa));
        peso.setPes_Solidos(Double.parseDouble(Ws));
        peso.setPes_Total(Double.parseDouble(Wt));

        graf_Ww.setText(Double.toString(peso.getPes_Agua()));
        graf_Wa.setText(Double.toString(peso.getPes_Aire()));
        graf_Ws.setText(Double.toString(peso.getPes_Solidos()));
        graf_Wt.setText(Double.toString(peso.getPes_Total()));

        //
        volumen.setVol_Aire(Double.parseDouble(Va));
        volumen.setVol_Agua(Double.parseDouble(Vw));
        volumen.setVol_Solidos(Double.parseDouble(Vs));
        volumen.setVol_Vacios(Double.parseDouble(Vv));
        volumen.setVol_Total(Double.parseDouble(Vt));
        //
        graf_Va.setText(Double.toString(volumen.getVol_Aire()));
        graf_Vw.setText(Double.toString(volumen.getVol_Agua()));
        graf_Vs.setText(Double.toString(volumen.getVol_Solidos()));
        graf_Vv.setText(Double.toString(volumen.getVol_Vacios()));
        graf_Vt.setText(Double.toString(volumen.getVol_Total()));

        //activar grafico
        for (Component PGraf : jPanelGraficaMuestra.getComponents()) {
            PGraf.setEnabled(true);
        }
        for (Component PG : panelGaseoso.getComponents()) {
            PG.setEnabled(true);
        }
        B_Graf.setEnabled(true);
        B_Calcular.setEnabled(true);
        B_limpiar.setEnabled(true);

    }//GEN-LAST:event_B_GrafActionPerformed

    private void B_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_limpiarActionPerformed
        // TODO add your handling code here:
        Limpiar(panelGaseoso);
        Limpiar(jPanelGraficaMuestra);
        Limpiar(jPanelRelacionesVolumetricas);
        Limpiar(jPanelRelacionesGravimetricas);
        Limpiar(panelvolumen);
        Limpiar(panelpeso);


    }//GEN-LAST:event_B_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPress(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int an_width = boton.getWidth() - ancho;
        int al_height = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(an_width, al_height, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Calcular;
    private javax.swing.JButton B_Formulas;
    private javax.swing.JButton B_Graf;
    private javax.swing.JButton B_Procedimiento;
    private javax.swing.JButton B_limpiar;
    private javax.swing.JTextArea TxtArea_Resultado;
    private javax.swing.JPanel flech1;
    private javax.swing.JPanel flech2;
    private javax.swing.JPanel flech3;
    private javax.swing.JTextField graf_Va;
    private javax.swing.JTextField graf_Vs;
    private javax.swing.JTextField graf_Vt;
    private javax.swing.JTextField graf_Vv;
    private javax.swing.JTextField graf_Vw;
    private javax.swing.JTextField graf_Wa;
    private javax.swing.JTextField graf_Ws;
    private javax.swing.JTextField graf_Wt;
    private javax.swing.JTextField graf_Ww;
    private javax.swing.JButton jButtonNormal;
    private javax.swing.JButton jButtonSaturado;
    private javax.swing.JCheckBox jCBContenidoHumedad;
    private javax.swing.JCheckBox jCBGradoSaturacion;
    private javax.swing.JCheckBox jCBGravedadEspecifica;
    private javax.swing.JCheckBox jCBPesoEspecifico;
    private javax.swing.JCheckBox jCBPesoEspecificoSeco;
    private javax.swing.JCheckBox jCBPorosidad;
    private javax.swing.JCheckBox jCBRelacionVacio;
    private javax.swing.JCheckBox jCB_PesoAire;
    private javax.swing.JCheckBox jCB_VolAire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFASELIQUIDA;
    private javax.swing.JLabel jLabelFASESOLIDA;
    private javax.swing.JLabel jLabelPESO;
    private javax.swing.JLabel jLabelTitulodelAplicativo;
    private javax.swing.JLabel jLabelVOLUMEN;
    private javax.swing.JLabel jLabelVs;
    private javax.swing.JLabel jLabelVt;
    private javax.swing.JLabel jLabelVw;
    private javax.swing.JLabel jLabelWs;
    private javax.swing.JLabel jLabelWt;
    private javax.swing.JLabel jLabelWw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelGraficaMuestra;
    private javax.swing.JPanel jPanelRelacionesGravimetricas;
    private javax.swing.JPanel jPanelRelacionesVolumetricas;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtPes_Agua;
    private javax.swing.JTextField jtPes_Aire;
    private javax.swing.JTextField jtPes_Solid;
    private javax.swing.JTextField jtPes_Total;
    private javax.swing.JTextField jtVol_Agua;
    private javax.swing.JTextField jtVol_Aire;
    private javax.swing.JTextField jtVol_Total;
    private javax.swing.JTextField jtVol_Vacio;
    private javax.swing.JTextField jtVol_solidos;
    private javax.swing.JPanel panelGaseoso;
    private javax.swing.JPanel panelQCalc;
    private javax.swing.JPanel panelpeso;
    private javax.swing.JPanel panelvolumen;
    private javax.swing.JLabel textaire;
    private javax.swing.JLabel textaire2;
    private javax.swing.JLabel texttitmuestra1;
    private javax.swing.JLabel texttitmuestra2;
    // End of variables declaration//GEN-END:variables
}
