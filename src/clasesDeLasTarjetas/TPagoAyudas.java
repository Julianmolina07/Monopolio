package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TPagoAyudas extends Tpago{
   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagar ayuda a dagnificados$ 15"); 
       
    }
    
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=15;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero - cobro );
        juego.getBanco().agregarDinero(cobro);
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}