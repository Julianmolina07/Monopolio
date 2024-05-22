package clasesDeLasCasillas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class CasillaDeParada extends CasillaEspecial {
    
    public CasillaDeParada(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_PARADA_LIBRE);
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
    }
    
}
