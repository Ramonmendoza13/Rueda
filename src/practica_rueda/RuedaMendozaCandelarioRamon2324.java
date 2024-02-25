package practica_rueda;

/**
 * Clase que representa una rueda con información sobre combustible, capacidad y consumo.
 * 
 * @author Ramon Mendoza Candelario
 */
public class RuedaMendozaCandelarioRamon2324 {
    
    // Atributos de la clase

    private int combustible_queda;  // Combustible actual en la rueda.
    private double centimos_litro;  // Costo en céntimos por litro de combustible.
    private int capacidad;           // Capacidad máxima del depósito en litros.
    private int consumoRMC = 6;      // Consumo de combustible en litros a los cien kilómetros.

    // Constructores

    /**
     * Constructor por defecto de la clase RuedaMendozaCandelarioRamon2324.
     */
    public RuedaMendozaCandelarioRamon2324() {
    }

    /**
     * Constructor que permite inicializar los atributos de la clase.
     *
     * @param combustible_queda Cantidad actual de combustible en la rueda.
     * @param centimos_litro Costo en céntimos por litro de combustible.
     * @param capacidad Capacidad máxima del depósito en litros.
     */
    public RuedaMendozaCandelarioRamon2324(int combustible_queda, int centimos_litro, int capacidad) {
        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;
    }

    // Métodos de la clase

    /**
     * Obtiene la cantidad actual de combustible en la rueda.
     *
     * @return La cantidad actual de combustible.
     */
    public int getcombustible() {
        return getCombustible_queda();
    }

    /**
     * Realiza un viaje, disminuyendo la cantidad de combustible en función de la distancia y el consumo.
     *
     * @param km Distancia a recorrer en kilómetros.
     * @throws Exception Si no hay suficiente combustible para la distancia o la distancia no es positiva.
     */
    public void viaje(int km) throws Exception {
        if (km * this.getConsumoRMC()/100 > this.getCombustible_queda()) {
            throw new Exception("No hay suficiente combustible para esa distancia");
        }
        if (km <= 0) {
            throw new Exception("No tiene sentido recorrer una distancia que no sea positiva");
        }
        this.setCombustible_queda(this.getCombustible_queda() - (km * this.getConsumoRMC() / 100)); 
    }

    /**
     * Rellena el depósito de combustible con la cantidad de litros especificada, utilizando dinero.
     *
     * @param litros Cantidad de litros a añadir al depósito.
     * @param dinero Dinero disponible para la operación.
     * @throws Exception Si el dinero o la cantidad de litros no son válidos, o se supera la capacidad del depósito.
     */
    public void rellenar(int litros, double dinero) throws Exception {
        if ((dinero <= 0)  || (litros <= 0)){
            throw new Exception("No se puede rellenar el depósito.");
        }
       
        if (this.getCombustible_queda() + litros > getCapacidad()) {
            throw new Exception("No se puede rellenar, porque se supera la capacidad del depósito");
        }
        if (dinero < litros * getCentimos_litro()) {
            throw new Exception("No tiene dinero suficiente para rellenar el depósito.");
        }
        this.setCombustible_queda(this.getCombustible_queda() + litros);
    }

    // Métodos getters y setters

    /**
     * Obtiene la cantidad actual de combustible en la rueda.
     *
     * @return La cantidad actual de combustible.
     */
    public int getCombustible_queda() {
        return combustible_queda;
    }

    /**
     * Establece la cantidad actual de combustible en la rueda.
     *
     * @param combustible_queda La nueva cantidad actual de combustible.
     */
    public void setCombustible_queda(int combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    /**
     * Obtiene el costo en céntimos por litro de combustible.
     *
     * @return El costo en céntimos por litro.
     */
    public double getCentimos_litro() {
        return centimos_litro;
    }

    /**
     * Establece el costo en céntimos por litro de combustible.
     *
     * @param centimos_litro El nuevo costo en céntimos por litro.
     */
    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }

    /**
     * Obtiene la capacidad máxima del depósito en litros.
     *
     * @return La capacidad máxima del depósito.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad máxima del depósito en litros.
     *
     * @param capacidad La nueva capacidad máxima del depósito.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene el consumo de combustible en litros a los cien kilómetros.
     *
     * @return El consumo de combustible.
     */
    public int getConsumoRMC() {
        return consumoRMC;
    }

    /**
     * Establece el consumo de combustible en litros a los cien kilómetros.
     *
     * @param consumoRMC El nuevo consumo de combustible.
     */
    public void setConsumoRMC(int consumoRMC) {
        this.consumoRMC = consumoRMC;
    }
}
