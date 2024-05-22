package clasesDeLasCasillas;

public class estacionDeTren extends CasillaDeServicios {

    public estacionDeTren(String nombre, int posicion,
            int valor, int rentaBase, int valorHipoteca) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedadServicio(CasillaDeServicios.TIPO_CASILLA_PROPIEDAD_SERVICIO_FERROCARRIL);
    }

    @Override
    public void calculaRenta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
