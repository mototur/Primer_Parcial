package gt.edu.miumg.Postres;

class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() { /* Implementar preparación */ }
    @Override
    public void servir() { /* Implementar servicio */ }

    // Getter y setter
    public String getTipoQueso() { return tipoQueso; }
    public void setTipoQueso(String tipoQueso) { this.tipoQueso = tipoQueso; }
}
