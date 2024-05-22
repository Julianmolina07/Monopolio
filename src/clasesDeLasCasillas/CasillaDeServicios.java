package clasesDeLasCasillas;

public abstract class CasillaDeServicios extends Propiedad {

    public static final String TIPO_CASILLA_PROPIEDAD_SERVICIO_PUBLICO = "publico";
    public static final String TIPO_CASILLA_PROPIEDAD_SERVICIO_FERROCARRIL = "ferrocarril";

    private String tipoCasillaPropiedadServicio;

    public CasillaDeServicios(int posicion, String nombre, int rentaBase,
            int valor, int valorHipoteca) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedad(Propiedad.TIPO_CASILLA_PROPIEDAD_SERVICIO);
    }

    public String getTipoCasillaPropiedadServicio() {
        return tipoCasillaPropiedadServicio;
    }

    public void setTipoCasillaPropiedadServicio(String tipoCasillaPropiedadServicio) {
        this.tipoCasillaPropiedadServicio = tipoCasillaPropiedadServicio;
    }

}
