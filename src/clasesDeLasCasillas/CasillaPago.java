package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class CasillaPago extends CasillaEspecial {

    private static final int SUELDO = 200;

    public CasillaPago(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_PAGO);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.getCuenta().agregarDinero(SUELDO);
        juego.getBanco().restarDinero(SUELDO);
    }

}
