package gt.edu.miumg.Ingredientes;

class Cobertura implements Ingredientes {
    private String tipo;
    private double cantidad;

    public Cobertura(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() { return tipo; }
    @Override
    public double obtenerCantidad() { return cantidad; }


    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
}
