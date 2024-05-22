package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TCasillaPropiedad extends TCasilla{
@Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Ir a Ilinois"); 
    
       }
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
    
}
