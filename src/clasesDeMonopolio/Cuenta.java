package clasesDeMonopolio;

import clasesDeLasCasillas.Propiedad;
import java.util.ArrayList;

public class Cuenta {

    private int dinero;
    private final ArrayList<Propiedad> propiedades;

    public Cuenta() {
        this.propiedades = new ArrayList<>();
        this.dinero = 2500;
    }

    public boolean agregarPropiedad(Propiedad p) {
        try {
            propiedades.add(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borraPropiedad(Propiedad propiedad) {
        try {
            propiedades.remove(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void agregarDinero(int dinero) {
        this.dinero += dinero;
    }

    public boolean restarDinero(int dinero) {
        this.dinero -= dinero;
        if (this.dinero < 0) {
            this.dinero += dinero;
            return false;
        }
        return true;
    }

}
