package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TPagoJugadores extends Tpago{
   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagaa los demas $50"); 
       
    }
    
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=50;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero - cobro );
        juego.getBanco().agregarDinero(cobro);
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
