package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TarjetaCarcelIrCarcel extends TarjetaCarcel{

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
        }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Carcel o pagar 200");
    
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
