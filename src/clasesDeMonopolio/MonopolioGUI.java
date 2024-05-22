package clasesDeMonopolio;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MonopolioGUI extends javax.swing.JFrame {

    public MonopolioGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(jButtonLanzar);
        this.jButtonLanzar.setEnabled(false);
        this.jButtonSalir.setEnabled(true);
        this.jButtonIniciar.setEnabled(false);
        this.setVisible(true);
    }

    public void mostrarJugadoresEnTabla(ArrayList<Jugador> jugadores) {
        DefaultTableModel modelo = (DefaultTableModel) getTablaJugadores().getModel();
        modelo.setRowCount(0);
        for (Jugador j : jugadores) {
            Object[] row = new Object[5];
            row[0] = j.getNombre();
            row[1] = j.getFicha().getPosicion();
            row[2] = j.getCuenta().getDinero();
            row[3] = j.getCuenta().getPropiedades().size();
            row[4] = j.getEstado();
            modelo.addRow(row);
        }
        getTablaJugadores().setModel(modelo);
        getTablaJugadores().changeSelection(0, 0, false, false);
        centrarDatosTabla(jTableJugadores);
        updateRowHeights(jTableJugadores);
        getTablaJugadores().repaint();
        getTablaJugadores().revalidate();
    }

    public final void centrarDatosTabla(JTable t) {
        DefaultTableCellRenderer modeloCentrar = new DefaultTableCellRenderer();
        modeloCentrar.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < t.getColumnCount(); i++) {
            t.getColumnModel().getColumn(i).setCellRenderer(modeloCentrar);
        }

    }

    private void updateRowHeights(JTable j) {
        try {
            for (int row = 0; row < j.getRowCount(); row++) {
                int rowHeight = j.getRowHeight();

                for (int column = 0; column < j.getColumnCount(); column++) {
                    Component comp = j.prepareRenderer(j.getCellRenderer(row, column), row, column);
                    rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
                }

                j.setRowHeight(row, (rowHeight + 5));
            }
        } catch (ClassCastException e) {
        }
    }

    public JButton getJButtonLanzar() {
        return this.jButtonLanzar;
    }

    public JTable getTablaJugadores() {
        return this.jTableJugadores;
    }

    public JTextField getJTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public JButton getJButtonRegistrar() {
        return jButtonRegistrar;
    }

    public JButton getJButtonIniciar() {
        return jButtonIniciar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTbalero = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonLanzar = new javax.swing.JButton();
        lblTennAve = new javax.swing.JLabel();
        lblNYAve = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblParadaLibre = new javax.swing.JLabel();
        lblKentuckyAve = new javax.swing.JLabel();
        lblGo = new javax.swing.JLabel();
        lblCasualCasilla23 = new javax.swing.JLabel();
        lblMedAve = new javax.swing.JLabel();
        lblIndianaAve = new javax.swing.JLabel();
        lblArcaCasilla3 = new javax.swing.JLabel();
        lbIlliAve = new javax.swing.JLabel();
        lblBalticAve = new javax.swing.JLabel();
        lblFerroCasilla26 = new javax.swing.JLabel();
        lblTaxCasilla5 = new javax.swing.JLabel();
        lblAtlAve = new javax.swing.JLabel();
        lblFerroCasilla6 = new javax.swing.JLabel();
        lblVentnorAve = new javax.swing.JLabel();
        lblOrientalAve = new javax.swing.JLabel();
        lblCompCasilla29 = new javax.swing.JLabel();
        lblCasuCasilla8 = new javax.swing.JLabel();
        lblMarvin = new javax.swing.JLabel();
        lblVermontAve = new javax.swing.JLabel();
        lblConnAve = new javax.swing.JLabel();
        lblIrCarcel = new javax.swing.JLabel();
        lblPacificAve = new javax.swing.JLabel();
        lblNCAve = new javax.swing.JLabel();
        lblArcaCasilla34 = new javax.swing.JLabel();
        lblPennAve = new javax.swing.JLabel();
        lblFerroCasilla36 = new javax.swing.JLabel();
        lblCasualCasilla37 = new javax.swing.JLabel();
        lblCarcel = new javax.swing.JLabel();
        lblParkPlace = new javax.swing.JLabel();
        lblCharles = new javax.swing.JLabel();
        lblTaxCasilla39 = new javax.swing.JLabel();
        lblCompCasilla13 = new javax.swing.JLabel();
        lblBoardwalk = new javax.swing.JLabel();
        lblStatesAve = new javax.swing.JLabel();
        lblVirgAve = new javax.swing.JLabel();
        lblFerroCasilla16 = new javax.swing.JLabel();
        lblJames = new javax.swing.JLabel();
        lblArcaCasilla18 = new javax.swing.JLabel();
        jScrollPaneTablaJugadores = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelTbalero.setBackground(new java.awt.Color(102, 204, 255));
        jPanelTbalero.setToolTipText("");
        jPanelTbalero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("1");
        jPanelTbalero.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, 10, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("2");
        jPanelTbalero.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("3");
        jPanelTbalero.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("4");
        jPanelTbalero.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("5");
        jPanelTbalero.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("6");
        jPanelTbalero.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("7");
        jPanelTbalero.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("8");
        jPanelTbalero.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("9");
        jPanelTbalero.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("10");
        jPanelTbalero.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("11");
        jPanelTbalero.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText("12");
        jPanelTbalero.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("13");
        jPanelTbalero.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("14");
        jPanelTbalero.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 255));
        jLabel19.setText("15");
        jPanelTbalero.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 255));
        jLabel20.setText("16");
        jPanelTbalero.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 255));
        jLabel21.setText("17");
        jPanelTbalero.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 255));
        jLabel22.setText("18");
        jPanelTbalero.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 255));
        jLabel23.setText("19");
        jPanelTbalero.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 255));
        jLabel24.setText("20");
        jPanelTbalero.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 255));
        jLabel25.setText("21");
        jPanelTbalero.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 255));
        jLabel26.setText("22");
        jPanelTbalero.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 255));
        jLabel27.setText("23");
        jPanelTbalero.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 255));
        jLabel28.setText("24");
        jPanelTbalero.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 153, 255));
        jLabel29.setText("25");
        jPanelTbalero.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 255));
        jLabel30.setText("26");
        jPanelTbalero.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 255));
        jLabel31.setText("27");
        jPanelTbalero.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 255));
        jLabel32.setText("28");
        jPanelTbalero.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 255));
        jLabel33.setText("29");
        jPanelTbalero.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 255));
        jLabel34.setText("30");
        jPanelTbalero.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 255));
        jLabel35.setText("31");
        jPanelTbalero.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 255));
        jLabel36.setText("32");
        jPanelTbalero.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, -1));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 153, 255));
        jLabel37.setText("33");
        jPanelTbalero.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, -1, -1));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 153, 255));
        jLabel38.setText("34");
        jPanelTbalero.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 255));
        jLabel39.setText("35");
        jPanelTbalero.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, -1, -1));

        jLabel40.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 153, 255));
        jLabel40.setText("36");
        jPanelTbalero.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, -1, -1));

        jLabel41.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 255));
        jLabel41.setText("37");
        jPanelTbalero.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, -1, -1));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 153, 255));
        jLabel42.setText("38");
        jPanelTbalero.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, -1, -1));

        jLabel43.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 255));
        jLabel43.setText("39");
        jPanelTbalero.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("40");
        jPanelTbalero.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, -1, -1));

        jButtonLanzar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonLanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dados.png"))); // NOI18N
        jPanelTbalero.add(jButtonLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 60, 50));

        lblTennAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblTennAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTennAve.setToolTipText("");
        lblTennAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblTennAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblTennAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblTennAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 40));

        lblNYAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblNYAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYAve.setToolTipText("");
        lblNYAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblNYAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblNYAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblNYAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tabla.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelTbalero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 710, 490));

        lblParadaLibre.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblParadaLibre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParadaLibre.setToolTipText("");
        lblParadaLibre.setMaximumSize(new java.awt.Dimension(90, 20));
        lblParadaLibre.setMinimumSize(new java.awt.Dimension(90, 20));
        lblParadaLibre.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblParadaLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 100, 63));

        lblKentuckyAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblKentuckyAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKentuckyAve.setToolTipText("");
        lblKentuckyAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblKentuckyAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblKentuckyAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblKentuckyAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 50, 70));

        lblGo.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblGo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGo.setToolTipText("");
        lblGo.setMaximumSize(new java.awt.Dimension(90, 20));
        lblGo.setMinimumSize(new java.awt.Dimension(90, 20));
        lblGo.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 100, 70));

        lblCasualCasilla23.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCasualCasilla23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasualCasilla23.setToolTipText("");
        lblCasualCasilla23.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCasualCasilla23.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCasualCasilla23.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCasualCasilla23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 60, 70));

        lblMedAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblMedAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedAve.setToolTipText("");
        lblMedAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblMedAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblMedAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblMedAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 60, 70));

        lblIndianaAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblIndianaAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndianaAve.setToolTipText("");
        lblIndianaAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblIndianaAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblIndianaAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblIndianaAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 60, 70));

        lblArcaCasilla3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblArcaCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArcaCasilla3.setToolTipText("");
        lblArcaCasilla3.setMaximumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla3.setMinimumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla3.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblArcaCasilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 50, 70));

        lbIlliAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lbIlliAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIlliAve.setToolTipText("");
        lbIlliAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lbIlliAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lbIlliAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lbIlliAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 70));

        lblBalticAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblBalticAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalticAve.setToolTipText("");
        lblBalticAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblBalticAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblBalticAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblBalticAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 60, 70));

        lblFerroCasilla26.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblFerroCasilla26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFerroCasilla26.setToolTipText("");
        lblFerroCasilla26.setMaximumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla26.setMinimumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla26.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblFerroCasilla26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 60, 70));

        lblTaxCasilla5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblTaxCasilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaxCasilla5.setToolTipText("");
        lblTaxCasilla5.setMaximumSize(new java.awt.Dimension(90, 20));
        lblTaxCasilla5.setMinimumSize(new java.awt.Dimension(90, 20));
        lblTaxCasilla5.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblTaxCasilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 60, 70));

        lblAtlAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblAtlAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtlAve.setToolTipText("");
        lblAtlAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblAtlAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblAtlAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblAtlAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 60, 70));

        lblFerroCasilla6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblFerroCasilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFerroCasilla6.setToolTipText("");
        lblFerroCasilla6.setMaximumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla6.setMinimumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla6.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblFerroCasilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 60, 70));

        lblVentnorAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblVentnorAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentnorAve.setToolTipText("");
        lblVentnorAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblVentnorAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblVentnorAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblVentnorAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 60, 70));

        lblOrientalAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblOrientalAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrientalAve.setToolTipText("");
        lblOrientalAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblOrientalAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblOrientalAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblOrientalAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 50, 70));

        lblCompCasilla29.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCompCasilla29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompCasilla29.setToolTipText("");
        lblCompCasilla29.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCompCasilla29.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCompCasilla29.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCompCasilla29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 50, 70));

        lblCasuCasilla8.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCasuCasilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasuCasilla8.setToolTipText("");
        lblCasuCasilla8.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCasuCasilla8.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCasuCasilla8.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCasuCasilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 60, 70));

        lblMarvin.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblMarvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarvin.setToolTipText("");
        lblMarvin.setMaximumSize(new java.awt.Dimension(90, 20));
        lblMarvin.setMinimumSize(new java.awt.Dimension(90, 20));
        lblMarvin.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblMarvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 70));

        lblVermontAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblVermontAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVermontAve.setToolTipText("");
        lblVermontAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblVermontAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblVermontAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblVermontAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 60, 70));

        lblConnAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblConnAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConnAve.setToolTipText("");
        lblConnAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblConnAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblConnAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblConnAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 60, 70));

        lblIrCarcel.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblIrCarcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIrCarcel.setToolTipText("");
        lblIrCarcel.setMaximumSize(new java.awt.Dimension(90, 20));
        lblIrCarcel.setMinimumSize(new java.awt.Dimension(90, 20));
        lblIrCarcel.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblIrCarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 100, 70));

        lblPacificAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblPacificAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacificAve.setToolTipText("");
        lblPacificAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblPacificAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblPacificAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblPacificAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 100, 40));

        lblNCAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblNCAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCAve.setToolTipText("");
        lblNCAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblNCAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblNCAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblNCAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 100, 40));

        lblArcaCasilla34.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblArcaCasilla34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArcaCasilla34.setToolTipText("");
        lblArcaCasilla34.setMaximumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla34.setMinimumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla34.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblArcaCasilla34, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, 100, 30));

        lblPennAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblPennAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPennAve.setToolTipText("");
        lblPennAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblPennAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblPennAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblPennAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 100, 40));

        lblFerroCasilla36.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblFerroCasilla36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFerroCasilla36.setToolTipText("");
        lblFerroCasilla36.setMaximumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla36.setMinimumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla36.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblFerroCasilla36, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 100, 40));

        lblCasualCasilla37.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCasualCasilla37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasualCasilla37.setToolTipText("");
        lblCasualCasilla37.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCasualCasilla37.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCasualCasilla37.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCasualCasilla37, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 100, 40));

        lblCarcel.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCarcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarcel.setToolTipText("");
        lblCarcel.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCarcel.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCarcel.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 90, 70));

        lblParkPlace.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblParkPlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParkPlace.setToolTipText("");
        lblParkPlace.setMaximumSize(new java.awt.Dimension(90, 20));
        lblParkPlace.setMinimumSize(new java.awt.Dimension(90, 20));
        lblParkPlace.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblParkPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 100, 40));

        lblCharles.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCharles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCharles.setToolTipText("");
        lblCharles.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCharles.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCharles.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCharles, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 100, 40));

        lblTaxCasilla39.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblTaxCasilla39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaxCasilla39.setToolTipText("");
        lblTaxCasilla39.setMaximumSize(new java.awt.Dimension(90, 20));
        lblTaxCasilla39.setMinimumSize(new java.awt.Dimension(90, 20));
        lblTaxCasilla39.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblTaxCasilla39, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 100, 40));

        lblCompCasilla13.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblCompCasilla13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompCasilla13.setToolTipText("");
        lblCompCasilla13.setMaximumSize(new java.awt.Dimension(90, 20));
        lblCompCasilla13.setMinimumSize(new java.awt.Dimension(90, 20));
        lblCompCasilla13.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblCompCasilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 100, 40));

        lblBoardwalk.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblBoardwalk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBoardwalk.setToolTipText("");
        lblBoardwalk.setMaximumSize(new java.awt.Dimension(90, 20));
        lblBoardwalk.setMinimumSize(new java.awt.Dimension(90, 20));
        lblBoardwalk.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblBoardwalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 100, 40));

        lblStatesAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblStatesAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatesAve.setToolTipText("");
        lblStatesAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblStatesAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblStatesAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblStatesAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 100, 40));

        lblVirgAve.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblVirgAve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVirgAve.setToolTipText("");
        lblVirgAve.setMaximumSize(new java.awt.Dimension(90, 20));
        lblVirgAve.setMinimumSize(new java.awt.Dimension(90, 20));
        lblVirgAve.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblVirgAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 40));

        lblFerroCasilla16.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblFerroCasilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFerroCasilla16.setToolTipText("");
        lblFerroCasilla16.setMaximumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla16.setMinimumSize(new java.awt.Dimension(90, 20));
        lblFerroCasilla16.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblFerroCasilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 100, 40));

        lblJames.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblJames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJames.setToolTipText("");
        lblJames.setMaximumSize(new java.awt.Dimension(90, 20));
        lblJames.setMinimumSize(new java.awt.Dimension(90, 20));
        lblJames.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblJames, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, 40));

        lblArcaCasilla18.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblArcaCasilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArcaCasilla18.setToolTipText("");
        lblArcaCasilla18.setMaximumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla18.setMinimumSize(new java.awt.Dimension(90, 20));
        lblArcaCasilla18.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanelTbalero.add(lblArcaCasilla18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 100, 40));

        jTableJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Posicion", "Dinero", "Propiedades", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableJugadores.setOpaque(false);
        jScrollPaneTablaJugadores.setViewportView(jTableJugadores);

        jPanelTbalero.add(jScrollPaneTablaJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, 190));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel1.setText("OBTENGAN SU INFORMACION!");
        jPanelTbalero.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 20));

        jTextFieldUsuario.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jPanelTbalero.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 30));

        jButtonSalir.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelTbalero.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel3.setText("REGISTRATE TU Y TUS AMIGOS!");
        jPanelTbalero.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 37));

        jButtonRegistrar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jPanelTbalero.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, 30));

        jButtonIniciar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        jPanelTbalero.add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTbalero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTbalero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        jButtonIniciar.setEnabled(false);
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setEnabled(false);
        jButtonLanzar.setEnabled(false);
        Despedida des = new Despedida();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonLanzar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelTbalero;
    private javax.swing.JScrollPane jScrollPaneTablaJugadores;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel lbIlliAve;
    private javax.swing.JLabel lblArcaCasilla18;
    private javax.swing.JLabel lblArcaCasilla3;
    private javax.swing.JLabel lblArcaCasilla34;
    private javax.swing.JLabel lblAtlAve;
    private javax.swing.JLabel lblBalticAve;
    private javax.swing.JLabel lblBoardwalk;
    private javax.swing.JLabel lblCarcel;
    private javax.swing.JLabel lblCasuCasilla8;
    private javax.swing.JLabel lblCasualCasilla23;
    private javax.swing.JLabel lblCasualCasilla37;
    private javax.swing.JLabel lblCharles;
    private javax.swing.JLabel lblCompCasilla13;
    private javax.swing.JLabel lblCompCasilla29;
    private javax.swing.JLabel lblConnAve;
    private javax.swing.JLabel lblFerroCasilla16;
    private javax.swing.JLabel lblFerroCasilla26;
    private javax.swing.JLabel lblFerroCasilla36;
    private javax.swing.JLabel lblFerroCasilla6;
    private javax.swing.JLabel lblGo;
    private javax.swing.JLabel lblIndianaAve;
    private javax.swing.JLabel lblIrCarcel;
    private javax.swing.JLabel lblJames;
    private javax.swing.JLabel lblKentuckyAve;
    private javax.swing.JLabel lblMarvin;
    private javax.swing.JLabel lblMedAve;
    private javax.swing.JLabel lblNCAve;
    private javax.swing.JLabel lblNYAve;
    private javax.swing.JLabel lblOrientalAve;
    private javax.swing.JLabel lblPacificAve;
    private javax.swing.JLabel lblParadaLibre;
    private javax.swing.JLabel lblParkPlace;
    private javax.swing.JLabel lblPennAve;
    private javax.swing.JLabel lblStatesAve;
    private javax.swing.JLabel lblTaxCasilla39;
    private javax.swing.JLabel lblTaxCasilla5;
    private javax.swing.JLabel lblTennAve;
    private javax.swing.JLabel lblVentnorAve;
    private javax.swing.JLabel lblVermontAve;
    private javax.swing.JLabel lblVirgAve;
    // End of variables declaration//GEN-END:variables
}
