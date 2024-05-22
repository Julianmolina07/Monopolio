package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TProximaU extends TCasilla{

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Avanza al proximo ferrocarril o servicio publico y paga doble, Si no tiene dueño puedes comprar"); 
       
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
        }
    

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
    
}
