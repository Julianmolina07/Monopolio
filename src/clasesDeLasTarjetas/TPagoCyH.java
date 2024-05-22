package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TPagoCyH extends Tpago{
     @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagar $25 Casa y Hotel $100"); 
       
    }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {

        int cobro=25;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero - cobro );
       juego.getBanco().agregarDinero(cobro);
        }
    

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}

