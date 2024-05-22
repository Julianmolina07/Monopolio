package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TarjetaCobrarImpuestosPrestamos extends TarjetaCobrar{
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Cobrar impuestos"); 
    
       }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
 
        int cobro=20;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero + cobro );
        juego.getBanco().restarDinero(cobro);
    }
    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}

   
