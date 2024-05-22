package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TarjetaCarcelSalirCarcel extends TarjetaCarcel{

   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
   @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Salida carcel, si no esta en la carcel conserva comodin");
    
       }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.setEstado(Jugador.ESTADO_LIBRE);
    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
    
}
