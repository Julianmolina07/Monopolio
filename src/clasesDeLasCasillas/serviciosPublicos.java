package clasesDeLasCasillas;

public class serviciosPublicos extends CasillaDeServicios {

    public serviciosPublicos(String nombre, int posicion,
            int valor, int rentaBase, int valorHipoteca) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedadServicio(CasillaDeServicios.TIPO_CASILLA_PROPIEDAD_SERVICIO_PUBLICO);
    }

    @Override
    public void calculaRenta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
