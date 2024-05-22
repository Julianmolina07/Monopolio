package clasesDeMonopolio;

import clasesDeLasCasillas.Propiedad;
import clasesDeLasCasillas.Construccion;
import java.util.ArrayList;

public class Banco {

    private int dinero;
    private final ArrayList<Construccion> mejoras;
    private final ArrayList<Propiedad> propiedades;

    public Banco(ArrayList propiedades) {
        this.mejoras = new ArrayList<>();
        this.propiedades = propiedades;
        this.dinero = 100000000;
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

    public ArrayList<Construccion> getMejoras() {
        return mejoras;
    }

    public boolean agregarMejora(String tipoMejora) {
        try {
            mejoras.add(new Construccion(tipoMejora));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarMejora(String tipoMejora) {
        for (Construccion m : mejoras) {
            if (m.getTipoMejora().equals(tipoMejora)) {
                mejoras.remove(m);
                return true;
            }
        }
        return false;
    }

    public boolean agregarPropiedad(Propiedad propiedad) {
        try {
            propiedades.add(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarPorpiedad(Propiedad propiedad) {
        try {
            propiedades.remove(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void agregarDinero(int dinero) {
        this.dinero += dinero;
    }

    public void restarDinero(int dinero) {
        this.dinero -= dinero;
        if (this.dinero <= 0) {
            this.dinero = 1000000;
        }
    }
}
