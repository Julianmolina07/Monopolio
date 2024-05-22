package clasesDeMonopolio;

import clasesDeLasCasillas.Propiedad;
import clasesDeLasCasillas.propiedadT;

public class Jugador {

    public static final String ESTADO_ENCARCELDADO = "encarcelado";
    public static final String ESTADO_LIBRE = "libre";

    private final Cuenta cuenta;
    private String estado;
    private final Ficha ficha;
    private final String nombre;

    public Jugador(Ficha ficha, String nombre) {
        this.cuenta = new Cuenta();
        this.ficha = ficha;
        this.nombre = nombre;
        this.estado = Jugador.ESTADO_LIBRE;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public boolean comprarPropiedad(Banco banco, Propiedad propiedad) {
        if (getCuenta().restarDinero(propiedad.getValor())) {
            banco.agregarDinero(propiedad.getValor());
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                propiedad.setPropietario(this);
                return true;
            } else {
                getCuenta().agregarDinero(propiedad.getValor());
            }
        }
        return false;
    }

    public boolean comprarPropiedad(Jugador jugador, Propiedad propiedad) {
        if (jugador.getCuenta().borraPropiedad(propiedad)) {
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                propiedad.setPropietario(this);
                return true;
            }
        }
        return false;
    }

    public boolean venderPropiedad(Banco banco, Propiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (banco.agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.DISPONIBLE);
                propiedad.setPropietario(null);
                return true;
            }
        }
        return false;
    }

    public boolean venderPropiedad(Jugador jugador, Propiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (jugador.getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                propiedad.setPropietario(jugador);
                return true;
            }
        }
        return false;
    }

    public boolean hipotecar(Banco banco, Propiedad propiedad) {
        int hipoteca = propiedad.getValorHipoteca();
        if (cuenta.getPropiedades().contains(propiedad)) {
            banco.restarDinero(hipoteca);
            getCuenta().agregarDinero(hipoteca);
            propiedad.setEstado(propiedad.HIPOTECADA);
            return true;
        }
        return false;
    }

    public boolean deshipotecar(Banco banco, Propiedad propiedad) {
        int deshipoteca = (int) (propiedad.getValorHipoteca() * 1.1);
        if (cuenta.getPropiedades().contains(propiedad)) {
            if (propiedad.getEstado().equals(propiedad.HIPOTECADA)) {
                if (getCuenta().restarDinero(deshipoteca)) {
                    banco.agregarDinero(deshipoteca);
                    propiedad.setEstado(propiedad.ADQUIRIDA);
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean cobrarRenta(Propiedad propiedad, Jugador jugador) {
        int renta = propiedad.getRenta();
        if (jugador.getCuenta().restarDinero(renta)) {
            getCuenta().agregarDinero(renta);
            return true;
        }
        return false;
    }

    public void pagarRenta(propiedadT propiedad) {
    }
}
