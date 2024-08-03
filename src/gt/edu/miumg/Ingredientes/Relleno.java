package gt.edu.miumg.Ingredientes;

class Relleno implements Ingredientes {
    private String sabor;
    private double cantidad;

    public Relleno(String sabor, double cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() { return sabor; }
    @Override
    public double obtenerCantidad() { return cantidad; }


    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }
    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
}
