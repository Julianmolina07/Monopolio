package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class CasillaEvento extends CasillaEspecial {

    public static final String TIPO_CASILLA_EVENTO_COMUN = "arca comun";
    public static final String TIPO_CASILLA_EVENTO_CASUALIDAD = "casualidad";

    private final String tipoCasillaEspecialEventualidad;

    public CasillaEvento(int posicion, String nombre, String tipoCasillaEspecialEventualidad) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD);
        this.tipoCasillaEspecialEventualidad = tipoCasillaEspecialEventualidad;
    }

    public String getTipoCasillaEspecialEventualidad() {
        return tipoCasillaEspecialEventualidad;
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        switch (tipoCasillaEspecialEventualidad) {
            case CasillaEvento.TIPO_CASILLA_EVENTO_COMUN:
                juego.getTarjetaArcaComun().ejecutarAccion(jugador, juego);
                break;
            case CasillaEvento.TIPO_CASILLA_EVENTO_CASUALIDAD:
                juego.getTarjetaCasualidad().ejecutarAccion(jugador, juego);
                break;
        }
    }
}
