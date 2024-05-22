package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public abstract class Tarjeta {

private String mensaje;
private String tipoTarjeta;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
   public abstract void ejecutarAccion(Jugador jugador, Juego juego);
}
