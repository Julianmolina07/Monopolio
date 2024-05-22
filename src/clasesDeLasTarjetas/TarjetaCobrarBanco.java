package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TarjetaCobrarBanco extends TarjetaCobrar {
    
     @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Cobra al banco$50 "); 
    
       }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=50;
        jugador.getCuenta().agregarDinero(cobro);
        juego.getBanco().restarDinero(cobro);
        

    }
    
    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
