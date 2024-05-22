package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class EspecialDePreso extends CasillaEspecial {

    public EspecialDePreso(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_DELITO);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {

        jugador.getFicha().setPosicion(11);
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);
    }

}
