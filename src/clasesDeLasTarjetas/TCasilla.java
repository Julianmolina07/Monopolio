package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public abstract class TCasilla extends Tarjeta{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta(tipoTarjeta); 
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
    }
    
    
}
