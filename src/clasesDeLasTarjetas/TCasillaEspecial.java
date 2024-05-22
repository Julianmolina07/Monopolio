package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TCasillaEspecial extends TCasilla{

    

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        throw new UnsupportedOperationException("Aún no es compatible.");
    }
    
}
