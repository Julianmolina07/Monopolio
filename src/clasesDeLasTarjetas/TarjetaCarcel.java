package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public abstract class TarjetaCarcel extends Tarjeta{
 
   

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades");
    }

       @Override
       public void setMensaje(String mensaje) {
       super.setMensaje("Carcel sin fianza");
    
       }
       
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);
        
    }
    @Override
    public String getMensaje() {
        return super.getMensaje();
    }

}