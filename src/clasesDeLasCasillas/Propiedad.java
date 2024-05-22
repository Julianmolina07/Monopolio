package clasesDeLasCasillas;

import clasesDeMonopolio.Jugador;

public abstract class Propiedad extends Casilla {

    public static final String TIPO_CASILLA_PROPIEDAD_TERRENO = "Casa";
    public static final String TIPO_CASILLA_PROPIEDAD_SERVICIO = "servicio";

    public static final String HIPOTECADA = "hipotecada";
    public static final String DISPONIBLE = "disponible";
    public static final String ADQUIRIDA = "adquirida";

    private String estado;
    private int renta;
    private final int rentaBase;
    private String tipoCasillaPropiedad;
    private final int valor;
    private final int valorHipoteca;
    private Jugador propietario;

    public Propiedad(int posicion, String nombre, int rentaBase,
            int valor, int valorHipoteca) {
        super(posicion, nombre);
        this.setTipoCasilla(Casilla.TIPO_CASILLA_PROPIEDAD);
        this.rentaBase = rentaBase;
        this.valor = valor;
        this.valorHipoteca = valorHipoteca;
        this.estado = Propiedad.DISPONIBLE;
        this.renta = this.rentaBase;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
    }

    public int getRentaBase() {
        return rentaBase;
    }

    public String getTipoCasillaPropiedad() {
        return tipoCasillaPropiedad;
    }

    public int getValor() {
        return valor;
    }

    public int getValorHipoteca() {
        return valorHipoteca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void calculaRenta();

    public void setTipoCasillaPropiedad(String tipoCasillaPropiedad) {
        this.tipoCasillaPropiedad = tipoCasillaPropiedad;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

}
