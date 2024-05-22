package clasesDeMonopolio;

import clasesDeLasCasillas.Casilla;
import clasesDeLasCasillas.CasillaEspecial;
import clasesDeLasCasillas.Propiedad;
import clasesDeLasCasillas.Tablero;
import clasesDeLasTarjetas.Tarjeta;
import clasesDeLasTarjetas.TarjetaCarcelIrCarcel;
import clasesDeLasTarjetas.TarjetaCarcelSalirCarcel;
import clasesDeLasTarjetas.TarjetaCobrarAcciones;
import clasesDeLasTarjetas.TarjetaCobrarBanco;
import clasesDeLasTarjetas.TarjetaCobrarImpuestosPrestamos;
import clasesDeLasTarjetas.TCasillaPropiedad;
import clasesDeLasTarjetas.TProximaU;
import clasesDeLasTarjetas.TMejoras;
import clasesDeLasTarjetas.TPagoCyH;
import clasesDeLasTarjetas.TPagoJugadores;
import clasesDeLasTarjetas.TPagoAyudas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Juego {

    private final Banco banco;
    private final Tablero tablero;
    private final MonopolioGUI gui;
    private final Dado dadoA;
    private final Dado dadoB;
    private final ArrayList<Tarjeta> tarjetasArcaComun;
    private final ArrayList<Tarjeta> tarjetasCasualidad;
    private final ArrayList<Jugador> jugadores;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.dadoA = new Dado();
        this.dadoB = new Dado();
        this.tablero = new Tablero();
        this.banco = new Banco(tablero.getCasillas());
        this.gui = new MonopolioGUI();
        this.tarjetasArcaComun = new ArrayList<>();
        this.tarjetasCasualidad = new ArrayList<>();
        this.gui.getJButtonLanzar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getGui().getJButtonLanzar().setEnabled(false);
                jugar();
                getGui().getJButtonLanzar().setEnabled(true);
            }
        });
        this.gui.getJButtonRegistrar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = getGui().getJTextFieldUsuario().getText();
                    if (nombre.length() > 1) {
                        registrarJugador(nombre);
                        getGui().mostrarJugadoresEnTabla(getJugadores());
                        habilitarJuego();
                    } else {
                        JOptionPane.showMessageDialog(getGui(), ":(");
                    }
                    getGui().getJTextFieldUsuario().setText("");
                    getGui().getJTextFieldUsuario().requestFocus();
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(getGui(), "Ingrese un nombre válido.");
                }
            }
        });
        this.gui.getJButtonIniciar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getGui().getJButtonIniciar().setEnabled(false);
                getGui().getJButtonRegistrar().setEnabled(false);
                getGui().getJTextFieldUsuario().setEnabled(false);
                getGui().getJButtonLanzar().setEnabled(true);
            }
        });
    }
    
    
     public void iniciar() {
        this.gui.setVisible(true);
        crearTarjetas();
    }

    public void siguienteJugador() {
        getJugadores().add(getJugadores().get(0));
        getJugadores().remove(0);
    }

    public int lanzarDados() {
        return dadoA.getNumero() + dadoB.getNumero();
    }

    public void registrarJugador(String nombre) {
        Ficha ficha = new Ficha("Ficha" + nombre);
        Jugador jugador = new Jugador(ficha, nombre);
        getJugadores().add(jugador);
    }

    public void habilitarJuego() {
        if (getJugadores().size() > 1) {
            getGui().getJButtonIniciar().setEnabled(true);
        }
        if (getJugadores().size() > 7) {
            getGui().getJButtonRegistrar().setEnabled(false);
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Tarjeta getTarjetaArcaComun() {
        int tarjeta = (int) (Math.random() * tarjetasArcaComun.size() - 1);
        return tarjetasArcaComun.get(tarjeta);
    }

    public Tarjeta getTarjetaCasualidad() {
        int tarjeta = (int) (Math.random() * tarjetasCasualidad.size() - 1);
        return tarjetasCasualidad.get(tarjeta);
    }

    public void crearTarjetas() {

        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel = new TarjetaCarcelSalirCarcel();
        TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel = new TarjetaCarcelIrCarcel();
        TPagoCyH tarjetaPagarCasasHoteles = new TPagoCyH();
        TarjetaCobrarAcciones tarjetaCobrarAcciones = new TarjetaCobrarAcciones();

        tarjetasArcaComun.add(tarjetaCarcelSalirCarcel);
        tarjetasArcaComun.add(tarjetaCarcelIrCarcel);
        tarjetasArcaComun.add(tarjetaPagarCasasHoteles);
        tarjetasArcaComun.add(tarjetaCobrarAcciones);

        TCasillaPropiedad tarjetaIrIllinois = new TCasillaPropiedad();
        TProximaU tarjetaIrCasillaProximaUtilidad = new TProximaU();
        TProximaU tarjetaIrProximoFerro = new TProximaU();
        TProximaU tarjetaIrProximoFerro1 = new TProximaU();
        TCasillaPropiedad tarjetaIrStCharles = new TCasillaPropiedad();
        TarjetaCobrarBanco tarjetaCobrarBanco = new TarjetaCobrarBanco();
        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel1 = new TarjetaCarcelSalirCarcel();
        TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel1 = new TarjetaCarcelIrCarcel();
        TMejoras tarjetaPagarArreglosMejoras = new TMejoras();
        TPagoAyudas tarjetaPagarPobres = new TPagoAyudas();
        TProximaU tarjetaIrCasillaReadingFerro = new TProximaU();
        TCasillaPropiedad TarjetaIrCasillaBoardWalk = new TCasillaPropiedad();
        TPagoJugadores tarjetaPagarJugadores = new TPagoJugadores();
        TarjetaCobrarImpuestosPrestamos tarjetaCobrarImpuestosPrestamos = new TarjetaCobrarImpuestosPrestamos();

        tarjetasCasualidad.add(tarjetaIrIllinois);
        tarjetasCasualidad.add(tarjetaIrCasillaProximaUtilidad);
        tarjetasCasualidad.add(tarjetaIrProximoFerro);
        tarjetasCasualidad.add(tarjetaIrProximoFerro1);
        tarjetasCasualidad.add(tarjetaIrStCharles);
        tarjetasCasualidad.add(tarjetaCobrarBanco);
        tarjetasCasualidad.add(tarjetaCarcelSalirCarcel1);
        tarjetasCasualidad.add(tarjetaCarcelIrCarcel1);
        tarjetasCasualidad.add(tarjetaPagarPobres);
        tarjetasCasualidad.add(tarjetaIrCasillaReadingFerro);
        tarjetasCasualidad.add(TarjetaIrCasillaBoardWalk);
        tarjetasCasualidad.add(tarjetaPagarJugadores);
        tarjetasCasualidad.add(tarjetaCobrarImpuestosPrestamos);
    }

    public void jugar() {
        Jugador jugador = getJugadores().get(0);
        int valorDados = lanzarDados();
        jugador.getFicha().aumentarPosicion(valorDados);
        int pos = jugador.getFicha().getPosicion();
        Casilla casilla = tablero.getCasillaByPos(pos);
        JOptionPane.showMessageDialog(getGui(), "El jugador " + jugador.getNombre()
                + " sacó " + valorDados + "\nCallo en la posicion " + pos + "\n"
                + "" + casilla.getNombre());
        switch (casilla.getTipoCasilla()) {
            case Casilla.TIPO_CASILLA_PROPIEDAD:
                Propiedad propiedad = (Propiedad) casilla;
                JOptionPane.showMessageDialog(getGui(), "Propiedad " + propiedad.getNombre().toString() + " Valor " + propiedad.getValor());
                switch (propiedad.getEstado()) {
                    case Propiedad.ADQUIRIDA:
                        JOptionPane.showMessageDialog(getGui(), "Adquirida");
                        if (!jugador.getCuenta().getPropiedades().contains(propiedad)) {
                            JOptionPane.showMessageDialog(getGui(), "Paga renta.");
                            if (propiedad.getPropietario().cobrarRenta(propiedad, jugador)) {
                                JOptionPane.showMessageDialog(getGui(), jugador.getNombre() + "\n"
                                        + "paga " + propiedad.getRenta() + " \n" + propiedad.getPropietario().getNombre());
                            } else {
                                JOptionPane.showMessageDialog(getGui(), "El jugador no pudo pagar renta\n"
                                        + "queda endeudado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(getGui(), "Propia, no paga renta.");
                        }
                        break;
                    case Propiedad.DISPONIBLE:
                        JOptionPane.showMessageDialog(getGui(), "Disponible");
                        int opcion = JOptionPane.showConfirmDialog(getGui(), "¿Desea comprar esta propiedad?");
                        if (opcion == 0) {
                            jugador.comprarPropiedad(banco, propiedad);
                        }
                        break;
                    case Propiedad.HIPOTECADA:
                        JOptionPane.showMessageDialog(getGui(), "Hipotecada.\n"
                                + "no se paga renta.");
                        break;
                }
                break;
            case Casilla.TIPO_CASILLA_ESPECIAL:
                JOptionPane.showMessageDialog(getGui(), "Especial");
                CasillaEspecial especial = (CasillaEspecial) casilla;
                switch (especial.getTipoCasillaEspecial()) {
                    case (CasillaEspecial.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD):
                        JOptionPane.showMessageDialog(getGui(), "Coge tarjeta");
                        break;
                    default:
                        JOptionPane.showMessageDialog(getGui(), "Ejecuta accion ");
                        especial.ejecutarAccion(jugador, this);
                }
                break;
        }
        siguienteJugador();
        getGui().mostrarJugadoresEnTabla(getJugadores());
    }

    public MonopolioGUI getGui() {
        return gui;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
