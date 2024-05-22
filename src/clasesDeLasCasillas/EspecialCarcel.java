package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class EspecialCarcel extends CasillaEspecial {
    
    public EspecialCarcel(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_CARCEL);
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);
        jugador.getFicha().setPosicion(this.getPosicion());
    }
    
}
