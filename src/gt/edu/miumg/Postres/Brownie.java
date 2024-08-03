package gt.edu.miumg.Postres;

class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, String tipoChocolate) {
        super(nombre, tamaño, precio);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public void preparar() { /* Implementar preparación */ }
    @Override
    public void servir() { /* Implementar servicio */ }

    // Getter y setter
    public String getTipoChocolate() { return tipoChocolate; }
    public void setTipoChocolate(String tipoChocolate) { this.tipoChocolate = tipoChocolate; }
}
