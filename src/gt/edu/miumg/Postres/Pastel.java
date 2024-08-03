package gt.edu.miumg.Postres;

class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, String sabor) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
    }

    @Override
    public void preparar() { /* Implementar preparación */ }
    @Override
    public void servir() { /* Implementar servicio */ }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }
}
