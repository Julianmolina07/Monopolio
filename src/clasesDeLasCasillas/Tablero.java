package clasesDeLasCasillas;

import java.util.ArrayList;

public class Tablero {

    private final ArrayList<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<>();
        this.fillTablero();
    }

    public final void fillTablero() {
        crearCasillasEspeciales();
        crearCasillasPropieades();
    }

    public final void crearCasillasEspeciales() {
        Casilla casillaEspecialInicio = new CasillaDeParada(1, "GO");
        this.getCasillas().add(casillaEspecialInicio);

        Casilla casillaEspecialEventualidadArcaComunal3 = new CasillaEvento(3,
                "Eventualidad Arca Comun",CasillaEvento.TIPO_CASILLA_EVENTO_COMUN);
        this.getCasillas().add(casillaEspecialEventualidadArcaComunal3);

        Casilla casillaEspecialImpuesto5 = new impuestos(5, "Impuesto");
        this.getCasillas().add(casillaEspecialImpuesto5);

        Casilla casillaEspecialEventualidadCasualidad8 = new CasillaEvento(8,
                "Eventualidad Casualidad",CasillaEvento.TIPO_CASILLA_EVENTO_CASUALIDAD);
        this.getCasillas().add(casillaEspecialEventualidadCasualidad8);

        Casilla casillaEspecialCarcel = new EspecialCarcel(11, "Carcel");
        this.getCasillas().add(casillaEspecialCarcel);

        Casilla casillaEspecialEventualidadArcaComun18 = new CasillaEvento(18,
                "Eventualidad Arca Comun", CasillaEvento.TIPO_CASILLA_EVENTO_COMUN);
        this.getCasillas().add(casillaEspecialEventualidadArcaComun18);

        Casilla casillaespecialParadaLibre = new CasillaDeParada(21, "Parada Libre");
        this.getCasillas().add(casillaespecialParadaLibre);

        Casilla casillaEspecialCasualidad23 = new CasillaEvento(23,
                "Eventualidad Casualidad", CasillaEvento.TIPO_CASILLA_EVENTO_CASUALIDAD);
        this.getCasillas().add(casillaEspecialCasualidad23);

        Casilla casillaEspecialIrCarcel = new EspecialDePreso(31, "Delito, ir a la Carcel");
        this.getCasillas().add(casillaEspecialIrCarcel);

        Casilla casillaEspecialEventualidadArcaComun34 = new CasillaEvento(34,
                "Eventualidad Arca Comun",CasillaEvento.TIPO_CASILLA_EVENTO_COMUN);
        this.getCasillas().add(casillaEspecialEventualidadArcaComun34);

        Casilla casillaEspecialEventualidadCasualidad37 = new CasillaEvento(37,
                "Eventualidad Casualidad", CasillaEvento.TIPO_CASILLA_EVENTO_CASUALIDAD);
        this.getCasillas().add(casillaEspecialEventualidadCasualidad37);

        Casilla casillaEspecialImpuesto39 = new impuestos(39, "Impuesto al lujo");
        this.getCasillas().add(casillaEspecialImpuesto39);
    }

    public final void crearCasillasPropieades() {

        Casilla casillaPropiedadTerrenoMediterraneanAve = new propiedadT(
                "Mediterranean Ave.", 2, 60, 2, 30, 50, 50, propiedadT.COLOR_PURPLE);
        this.getCasillas().add(casillaPropiedadTerrenoMediterraneanAve);

        Casilla casillaPropiedadTerrenoBalticAve = new propiedadT(
                "Baltic Ave.", 4, 60, 2, 30, 50, 50, propiedadT.COLOR_PURPLE);
        this.getCasillas().add(casillaPropiedadTerrenoBalticAve);

        Casilla casillaPropiedadTerrenoOrientalAve = new propiedadT(
                "Oriental Ave.", 7, 100, 6, 50, 50, 50, propiedadT.COLOR_LIGHT_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoOrientalAve);

        Casilla casillaPropiedadTerrenoVermontAve = new propiedadT(
                "Vermont Ave.", 9, 100, 6, 50, 50, 50, propiedadT.COLOR_LIGHT_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoVermontAve);

        Casilla casillaPropiedadTerrenoConneticutAve = new propiedadT(
                "Conneticut Ave.", 10, 120, 6, 50, 50, 50, propiedadT.COLOR_LIGHT_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoConneticutAve);

        Casilla casillaPropiedadTerrenoStCharlesPlace = new propiedadT(
                "St. Charles Place.", 12, 140, 10, 50, 50, 50, propiedadT.COLOR_VIOLET);
        this.getCasillas().add(casillaPropiedadTerrenoStCharlesPlace);

        Casilla casillaPropiedadTerrenoStatesAve = new propiedadT(
                "States Ave.", 14, 140, 10, 70, 100, 100, propiedadT.COLOR_VIOLET);
        this.getCasillas().add(casillaPropiedadTerrenoStatesAve);

        Casilla casillaPropiedadTerrenoVirginiaAve = new propiedadT(
                "Virginia Ave.", 15, 160, 12, 80, 100, 100, propiedadT.COLOR_VIOLET);
        this.getCasillas().add(casillaPropiedadTerrenoVirginiaAve);

        Casilla casillaPropiedadTerrenoStJamesPlace = new propiedadT(
                "St. James Place", 17, 180, 14, 90, 100, 100, propiedadT.COLOR_ORANGE);
        this.getCasillas().add(casillaPropiedadTerrenoStJamesPlace);

        Casilla casillaPropiedadTerrenoTennesseeAve = new propiedadT(
                "Tennessee Ave.", 19, 180, 14, 90, 100, 100, propiedadT.COLOR_ORANGE);
        this.getCasillas().add(casillaPropiedadTerrenoTennesseeAve);

        Casilla casillaPropiedadTerrenoNewYork = new propiedadT(
                "New York Ave.", 20, 200, 16, 90, 100, 100, propiedadT.COLOR_ORANGE);
        this.getCasillas().add(casillaPropiedadTerrenoNewYork);

        Casilla casillaPropiedadTerrenoKentuckyAve = new propiedadT(
                "Kentucky Ave.", 22, 220, 18, 110, 150, 150, propiedadT.COLOR_RED);
        this.getCasillas().add(casillaPropiedadTerrenoKentuckyAve);

        Casilla casillaPropiedadTerrenoIndianaAve = new propiedadT(
                "Indiana Ave.", 24, 220, 18, 110, 150, 150, propiedadT.COLOR_RED);
        this.getCasillas().add(casillaPropiedadTerrenoIndianaAve);

        Casilla casillaPropiedadTerrenoIllinoisAve = new propiedadT(
                "Illinois Ave.", 25, 240, 20, 120, 150, 150, propiedadT.COLOR_RED);
        this.getCasillas().add(casillaPropiedadTerrenoIllinoisAve);

        Casilla casillaPropiedadTerrenoAtlanticAve = new propiedadT(
                "Atlantic Ave.", 27, 260, 22, 130, 150, 150, propiedadT.COLOR_YELLOW);
        this.getCasillas().add(casillaPropiedadTerrenoAtlanticAve);

        Casilla casillaPropiedadTerrenoVentorAve = new propiedadT(
                "Ventor Ave.", 28, 260, 22, 130, 150, 150, propiedadT.COLOR_YELLOW);
        this.getCasillas().add(casillaPropiedadTerrenoVentorAve);

        Casilla casillaPropiedadTerrenoMarvinGardens = new propiedadT(
                "Marvin Gardens", 30, 280, 22, 140, 150, 150, propiedadT.COLOR_YELLOW);
        this.getCasillas().add(casillaPropiedadTerrenoMarvinGardens);

        Casilla casillaPropiedadTerrenoPacificAve = new propiedadT(
                "Pacific Ave.", 32, 300, 26, 150, 200, 200, propiedadT.COLOR_DARK_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoPacificAve);

        Casilla casillaPropiedadTerrenoNorthCarolinaAve = new propiedadT(
                "North Carolina Ave.", 33, 300, 26, 150, 200, 200, propiedadT.COLOR_DARK_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoNorthCarolinaAve);

        Casilla casillaPropiedadTerrenoPennsylvaniaAve = new propiedadT(
                "Pennsylvania Ave.", 35, 320, 28, 160, 200, 200, propiedadT.COLOR_DARK_GREEN);
        this.getCasillas().add(casillaPropiedadTerrenoPennsylvaniaAve);

        Casilla casillaPropiedadTerrenoParkPlace = new propiedadT(
                "Park Place", 38, 350, 35, 175, 200, 200, propiedadT.COLOR_DARK_BLUE);
        this.getCasillas().add(casillaPropiedadTerrenoParkPlace);

        Casilla casillaPropiedadTerrenoBoardWalk = new propiedadT(
                "Board Walk", 40, 400, 50, 200, 200, 200, propiedadT.COLOR_DARK_BLUE);
        this.getCasillas().add(casillaPropiedadTerrenoBoardWalk);

        Casilla casillaPropiedadServicioPublicoElectricCompany13 = new serviciosPublicos(
                "Electric Company", 13, 150, 0, 75);
        this.getCasillas().add(casillaPropiedadServicioPublicoElectricCompany13);

        Casilla casillaPropiedadServicioPublicoWaterWorks29 = new serviciosPublicos(
                "Water Works", 29, 150, 0, 75);
        this.getCasillas().add(casillaPropiedadServicioPublicoWaterWorks29);

        Casilla casillaPropiedadServicioFerrocarrilReadingRailroad = new estacionDeTren(
                "Reading Railroad", 6, 200, 0, 100);
        this.getCasillas().add(casillaPropiedadServicioFerrocarrilReadingRailroad);

        Casilla casillaPropiedadServicioFerrocarrilPennsylvaniaRailroad = new estacionDeTren(
                "Pennsylvania Railroad", 16, 200, 0, 100);
        this.getCasillas().add(casillaPropiedadServicioFerrocarrilPennsylvaniaRailroad);

        Casilla casillaPropiedadServicioFerrocarrilBnORailroad = new estacionDeTren(
                "B. & O. Railroad", 26, 200, 0, 100);
        this.getCasillas().add(casillaPropiedadServicioFerrocarrilBnORailroad);

        Casilla casillaPropiedadServicioFerrocarrilShortLineRailroad = new estacionDeTren(
                "Short Line Railroad", 36, 200, 0, 100);
        this.getCasillas().add(casillaPropiedadServicioFerrocarrilShortLineRailroad);
    }

    public Casilla getCasillaByPos(int pos) {
        for (Casilla c : getCasillas()) {
            if (c.getPosicion() == pos) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }
}
