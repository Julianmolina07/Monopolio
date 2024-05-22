package clasesDeLasCasillas;

import java.util.ArrayList;
import java.util.Collection;

public class propiedadT extends Propiedad {

    public static final String COLOR_LIGHT_GREEN = "Verde claro";
    public static final String COLOR_VIOLET = "Violeta";
    public static final String COLOR_ORANGE = "Naranja";
    public static final String COLOR_RED = "Rojo";
    public static final String COLOR_YELLOW = "Amarillo";
    public static final String COLOR_DARK_GREEN = "Verde oscuro";
    public static final String COLOR_DARK_BLUE = "Azul oscuro";
    public static final String COLOR_PURPLE = "Purpura";

    private final int costoCasa;
    private final int costoHotel;
    private final String color;
    private final ArrayList<Construccion> mejoras;

    public propiedadT(String nombre, int posicion,
            int valor, int rentaBase, int valorHipoteca,
            int costoCasa, int costoHotel, String color) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedad(Propiedad.TIPO_CASILLA_PROPIEDAD_TERRENO);
        this.color = color;
        this.costoCasa = costoCasa;
        this.costoHotel = costoHotel;
        this.mejoras = new ArrayList<>();
    }

    public int getCostoCasa() {
        return costoCasa;
    }

    public int getCostoHotel() {
        return costoHotel;
    }

    public String getColor() {
        return color;
    }

    public Collection<Construccion> getMejoras() {
        return mejoras;
    }

    public void addMejora(Construccion mejora) {
        int contCasas;
        if (mejoras.isEmpty() == true && mejora.getTipoMejora().equals("hotel")) {
            System.out.println("Un hotel sin casa? traqueto o que?");
        } else if (mejoras.isEmpty() == true && mejora.getTipoMejora().equals("casa")) {
            mejoras.add(mejora);
        } else {
            contCasas = cuentaCasas();
            if (contCasas < 4 && mejora.getTipoMejora().equals("casa")) {
                mejoras.add(mejora);
            } else {
                System.out.print("No mas espacio para casas, se agrega un hotel");
                for (Construccion mejora1 : mejoras) {    //hacer un metodo para remover todas las casas de una.
                    if (mejora1.getTipoMejora().equals("casa")) {
                        mejoras.remove(mejora1);
                    }
                }
                mejoras.add(mejora);
            }
        }
    }

    public void removeMejora(String tipoMejora) {
        for (Construccion mejora : mejoras) {
            if (mejora.getTipoMejora().equals(tipoMejora)) {
                mejoras.remove(mejora);
                return;
            }
        }
    }

    @Override
    public void calculaRenta() {
        int renta = getRentaBase();
        if (mejoras.isEmpty() == true) {
            setRenta(renta);
        } else {
            for (Construccion mejora : mejoras) {
                switch (mejora.getTipoMejora()) {
                    case "casa":
                        renta += renta + costoCasa;
                        break;
                    case "hotel":
                        renta += renta + costoHotel;
                        break;
                }
            }
            setRenta(renta);
        }
    }

    public int cuentaCasas() {
        int contCasas = 0;
        for (Construccion mejora1 : mejoras) {
            if (mejora1.getTipoMejora().equals("casa")) {
                contCasas++;
            }
        }
        return contCasas;
    }

    public int cuentaHoteles() {
        int contHoteles = 0;
        for (Construccion mejora1 : mejoras) {
            if (mejora1.getTipoMejora().equals("hotel")) {
                contHoteles++;
            }
        }
        return contHoteles;
    }
}
