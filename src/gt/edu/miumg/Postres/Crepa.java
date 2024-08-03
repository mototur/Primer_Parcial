package gt.edu.miumg.Postres;

class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() { /* Implementar preparación */ }
    @Override
    public void servir() { /* Implementar servicio */ }

    // Getter y setter
    public String getTipoMasa() { return tipoMasa; }
    public void setTipoMasa(String tipoMasa) { this.tipoMasa = tipoMasa; }
}
