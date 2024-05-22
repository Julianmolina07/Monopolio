package clasesDeLasTarjetas;

import clasesDeMonopolio.Juego;
import clasesDeMonopolio.Jugador;

public class TarjetaCobrarAcciones extends TarjetaCobrar {

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun");
    }

    @Override
    public void setMensaje(String mensaje) {
        super.setMensaje("Acciones $50 ");
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int acciones = 50;
        jugador.getCuenta().agregarDinero(acciones);
        juego.getBanco().restarDinero(acciones);

    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
