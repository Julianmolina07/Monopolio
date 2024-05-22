package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TMejoras extends Tpago{
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcacomun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Paga mejoras calle $40 Casa $115 Hotel"); 
       
    }
    
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=40;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero - cobro );
        juego.getBanco().agregarDinero(cobro);
        }
    

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
