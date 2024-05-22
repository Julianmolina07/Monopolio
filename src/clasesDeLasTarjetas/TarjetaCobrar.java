package clasesDeLasTarjetas;
import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public abstract class TarjetaCobrar extends Tarjeta{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta(tipoTarjeta);
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje(mensaje);
    
       }
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
                  
        }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
   