/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Class.*;

/**
 *
 * @author Alexis
 */
public class Interface extends javax.swing.JFrame {

    private SueloMuestra suelo = new SueloMuestra();
    private RelacionesV_P Rel_V_P = new RelacionesV_P();

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CB_Vt = new javax.swing.JCheckBox();
        CB_Vw = new javax.swing.JCheckBox();
        CB_Vv = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtVol_Agua = new javax.swing.JTextField();
        jtVol_Total = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CB_Vs = new javax.swing.JCheckBox();
        jtVol_solidos = new javax.swing.JTextField();
        jtVol_Aire = new javax.swing.JTextField();
        CB_Va = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jtVol_Vacio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        CB_Wt = new javax.swing.JCheckBox();
        CB_Ws = new javax.swing.JCheckBox();
        CB_Ww = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CB_Wa = new javax.swing.JCheckBox();
        jtPes_Total = new javax.swing.JTextField();
        jtPes_Agua = new javax.swing.JTextField();
        jtPes_Solid = new javax.swing.JTextField();
        jtPes_Aire = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CB_MSat = new javax.swing.JCheckBox();
        CB_MNorm = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jtPoros = new javax.swing.JTextField();
        jtRel_Vacios = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtGrad_Sat = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jtPes_Esp = new javax.swing.JTextField();
        jtGrav_EspSol = new javax.swing.JTextField();
        jtHumed = new javax.swing.JTextField();
        jtPes_EspeSec = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        B_Calcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("CALCULO VOLUMETRICO Y GRAVIMETRICO DEL SUELO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 520, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("PESO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("VOLUMEN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));

        jLabel10.setText("Vw");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 51, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FASE SOLIDA");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, 90));

        jLabel9.setText("Wt");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel8.setText("Ws");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 40, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 40, -1));

        jLabel12.setText("Vv");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel7.setText("Ww");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 40, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 40, -1));

        jLabel11.setText("Vs");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel6.setText("Wa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FASE GASEOSA");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 150, 90));

        jLabel13.setText("Vt");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 102, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FASE LIQUIDA");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 90));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 50, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 50, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 50, -1));

        jLabel2.setText("Va");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 490, 300));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel2.setToolTipText("Datos");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Volumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_Vt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_VtActionPerformed(evt);
            }
        });
        jPanel3.add(CB_Vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        CB_Vw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_VwActionPerformed(evt);
            }
        });
        jPanel3.add(CB_Vw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        CB_Vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_VvActionPerformed(evt);
            }
        });
        jPanel3.add(CB_Vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel21.setText("Volumen de vacíos");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel22.setText("Volumen total");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel23.setText("Volumen de agua");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jtVol_Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_AguaActionPerformed(evt);
            }
        });
        jPanel3.add(jtVol_Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 70, -1));

        jtVol_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_TotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtVol_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, -1));

        jLabel24.setText("Volumen de sólidos");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        CB_Vs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_VsActionPerformed(evt);
            }
        });
        jPanel3.add(CB_Vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jtVol_solidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_solidosActionPerformed(evt);
            }
        });
        jPanel3.add(jtVol_solidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));

        jtVol_Aire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_AireActionPerformed(evt);
            }
        });
        jPanel3.add(jtVol_Aire, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, -1));

        CB_Va.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_VaActionPerformed(evt);
            }
        });
        jPanel3.add(CB_Va, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel25.setText("Volumen del aire");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jtVol_Vacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVol_VacioActionPerformed(evt);
            }
        });
        jPanel3.add(jtVol_Vacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 70, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 153, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_Wt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_WtActionPerformed(evt);
            }
        });
        jPanel4.add(CB_Wt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        CB_Ws.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_WsActionPerformed(evt);
            }
        });
        jPanel4.add(CB_Ws, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        CB_Ww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_WwActionPerformed(evt);
            }
        });
        jPanel4.add(CB_Ww, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel26.setText("Peso de agua");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel27.setText("Peso total");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel28.setText("Peso de sólidos");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel29.setText("Peso del aire");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        CB_Wa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_WaActionPerformed(evt);
            }
        });
        jPanel4.add(CB_Wa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jtPes_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_TotalActionPerformed(evt);
            }
        });
        jPanel4.add(jtPes_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, -1));

        jtPes_Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_AguaActionPerformed(evt);
            }
        });
        jPanel4.add(jtPes_Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 70, -1));

        jtPes_Solid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_SolidActionPerformed(evt);
            }
        });
        jPanel4.add(jtPes_Solid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 70, -1));

        jtPes_Aire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_AireActionPerformed(evt);
            }
        });
        jPanel4.add(jtPes_Aire, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 300, 180));

        jLabel30.setText("Muestra:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        CB_MSat.setText("Saturado");
        CB_MSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MSatActionPerformed(evt);
            }
        });
        jPanel2.add(CB_MSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        CB_MNorm.setText("Normal");
        CB_MNorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MNormActionPerformed(evt);
            }
        });
        jPanel2.add(CB_MNorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 340, 480));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel5.setToolTipText("Datos");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Volumétricas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Relación de vacíos");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel32.setText("Porosidad (n)");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jtPoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPorosActionPerformed(evt);
            }
        });
        jPanel6.add(jtPoros, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 80, -1));

        jtRel_Vacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRel_VaciosActionPerformed(evt);
            }
        });
        jPanel6.add(jtRel_Vacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, -1));

        jLabel17.setText("Grado de Saturación (S)");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtGrad_Sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGrad_SatActionPerformed(evt);
            }
        });
        jPanel6.add(jtGrad_Sat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("%");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 20, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("%");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 20, 20));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, 160));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Gravimétricas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 153, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Contenido de humedad");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setText("Gravedad especifica de sólidos");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel33.setText("Peso específico");
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jtPes_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_EspActionPerformed(evt);
            }
        });
        jPanel7.add(jtPes_Esp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 80, -1));

        jtGrav_EspSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGrav_EspSolActionPerformed(evt);
            }
        });
        jPanel7.add(jtGrav_EspSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 80, -1));

        jtHumed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHumedActionPerformed(evt);
            }
        });
        jPanel7.add(jtHumed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, -1));

        jtPes_EspeSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPes_EspeSecActionPerformed(evt);
            }
        });
        jPanel7.add(jtPes_EspeSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, -1));

        jLabel34.setText("Peso específico seco");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("%");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 20, 20));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, 160));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 330, 400));

        B_Calcular.setText("Calcular");
        B_Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CalcularMouseClicked(evt);
            }
        });
        B_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(B_Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        jButton2.setText("Mostrar pasos");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_VtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_VtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_VtActionPerformed

    private void CB_VwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_VwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_VwActionPerformed

    private void CB_VvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_VvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_VvActionPerformed

    private void jtVol_AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_AguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_AguaActionPerformed

    private void jtVol_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_TotalActionPerformed

    private void jtPes_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_TotalActionPerformed

    private void CB_VsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_VsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_VsActionPerformed

    private void jtVol_solidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_solidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_solidosActionPerformed

    private void jtVol_AireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_AireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVol_AireActionPerformed

    private void CB_VaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_VaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_VaActionPerformed

    private void CB_WtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_WtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_WtActionPerformed

    private void CB_WsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_WsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_WsActionPerformed

    private void CB_WwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_WwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_WwActionPerformed

    private void CB_WaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_WaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_WaActionPerformed

    private void jtVol_VacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVol_VacioActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jtVol_VacioActionPerformed

    private void jtPes_AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_AguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_AguaActionPerformed

    private void jtPes_SolidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_SolidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_SolidActionPerformed

    private void jtPes_AireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_AireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_AireActionPerformed

    private void CB_MSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MSatActionPerformed

    private void CB_MNormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MNormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MNormActionPerformed

    private void jtPorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPorosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPorosActionPerformed

    private void jtRel_VaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRel_VaciosActionPerformed

    }//GEN-LAST:event_jtRel_VaciosActionPerformed

    private void jtGrad_SatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGrad_SatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGrad_SatActionPerformed

    private void jtPes_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_EspActionPerformed

    private void jtGrav_EspSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGrav_EspSolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGrav_EspSolActionPerformed

    private void jtHumedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHumedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHumedActionPerformed

    private void jtPes_EspeSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPes_EspeSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPes_EspeSecActionPerformed

    private void B_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CalcularActionPerformed
        // TODO add your handling code here:
        // Capturar Datos
        /*suelo.setVol_Vacios(Integer.parseInt(jtVol_Vacio.getText()));
        suelo.setVol_Solidos(Integer.parseInt(jtVol_solidos.getText()));
        suelo.setVol_Agua(Integer.parseInt(jtVol_Agua.getText()));
        suelo.setVol_Aire(Integer.parseInt(jtVol_Aire.getText()));
        suelo.setVol_Total(Integer.parseInt(jtVol_Total.getText()));
        */suelo.setPes_Agua(Integer.parseInt(jtPes_Agua.getText()));
        suelo.setPes_Solidos(Integer.parseInt(jtPes_Solid.getText()));
        /*suelo.setPes_Aire(Integer.parseInt(jtPes_Aire.getText()));
        suelo.setPes_Total(Integer.parseInt(jtPes_Total.getText()));
        //Relacion de Vacios
        Rel_V_P.setRelacion_vacios(suelo.getVol_Vacios(), suelo.getVol_Solidos());
        jtRel_Vacios.setText(Integer.toString(Rel_V_P.getRelacion_vacios()));
        //Porosidad
        Rel_V_P.setPorosidad(suelo.getVol_Vacios(), suelo.getVol_Total());
        jtPoros.setText(Integer.toString(Rel_V_P.getPorosidad()));
        //Grado de Saturación
        Rel_V_P.setGrado_Saturacion(suelo.getVol_Agua(), suelo.getVol_Solidos());
        jtGrad_Sat.setText(Integer.toString(Rel_V_P.getGrado_Saturacion()));
        *///Contenido de Humedad
        Rel_V_P.setHumedad(suelo.getPes_Agua(), suelo.getPes_Solidos());
        jtHumed.setText(Double.toString(Rel_V_P.getHumedad()));
        /*//Peso Especifico
        Rel_V_P.setPeso_Espec(suelo.getPes_Total(), suelo.getVol_Total());
        jtHumed.setText(Integer.toString(Rel_V_P.getPeso_Espec()));
        //Peso Especifico Seco
        Rel_V_P.setPeso_Espec_Seco(suelo.getPes_Solidos(), suelo.getVol_Total());
        jtHumed.setText(Integer.toString(Rel_V_P.getPeso_Espec_Seco()));
        //Gravedad Especifica de Solidos*/
    }//GEN-LAST:event_B_CalcularActionPerformed

    private void B_CalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CalcularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_CalcularMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Calcular;
    private javax.swing.JCheckBox CB_MNorm;
    private javax.swing.JCheckBox CB_MSat;
    private javax.swing.JCheckBox CB_Va;
    private javax.swing.JCheckBox CB_Vs;
    private javax.swing.JCheckBox CB_Vt;
    private javax.swing.JCheckBox CB_Vv;
    private javax.swing.JCheckBox CB_Vw;
    private javax.swing.JCheckBox CB_Wa;
    private javax.swing.JCheckBox CB_Ws;
    private javax.swing.JCheckBox CB_Wt;
    private javax.swing.JCheckBox CB_Ww;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jtGrad_Sat;
    private javax.swing.JTextField jtGrav_EspSol;
    private javax.swing.JTextField jtHumed;
    private javax.swing.JTextField jtPes_Agua;
    private javax.swing.JTextField jtPes_Aire;
    private javax.swing.JTextField jtPes_Esp;
    private javax.swing.JTextField jtPes_EspeSec;
    private javax.swing.JTextField jtPes_Solid;
    private javax.swing.JTextField jtPes_Total;
    private javax.swing.JTextField jtPoros;
    private javax.swing.JTextField jtRel_Vacios;
    private javax.swing.JTextField jtVol_Agua;
    private javax.swing.JTextField jtVol_Aire;
    private javax.swing.JTextField jtVol_Total;
    private javax.swing.JTextField jtVol_Vacio;
    private javax.swing.JTextField jtVol_solidos;
    // End of variables declaration//GEN-END:variables
}
