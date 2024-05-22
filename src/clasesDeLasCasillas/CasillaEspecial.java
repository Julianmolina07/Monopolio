package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public abstract class CasillaEspecial extends Casilla {

    public static final String TIPO_CASILLA_ESPECIAL_CARCEL = "carcel";
    public static final String TIPO_CASILLA_ESPECIAL_DELITO = "delito";
    public static final String TIPO_CASILLA_ESPECIAL_EVENTUALIDAD = "evento";
    public static final String TIPO_CASILLA_ESPECIAL_IMPUESTO = "impuesto";
    public static final String TIPO_CASILLA_ESPECIAL_PARADA_LIBRE = "libre";
    public static final String TIPO_CASILLA_PAGO = "sueldo";

    private String tipoCasillaEspecial;

    public CasillaEspecial(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasilla(Casilla.TIPO_CASILLA_ESPECIAL);
    }

    public String getTipoCasillaEspecial() {
        return tipoCasillaEspecial;
    }

    public void setTipoCasillaEspecial(String tipoCasillaEspecial) {
        this.tipoCasillaEspecial = tipoCasillaEspecial;
    }

    public abstract void ejecutarAccion(Jugador jugador, Juego juego);
}
