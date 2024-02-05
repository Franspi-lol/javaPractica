public class Plataforma {
    private String nombre;
    private String fabricante;
    private int lanzamiento;
    private String[] specs;

    public Plataforma(String nombre, String fabricante, int lanzamiento, String[] specs) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.lanzamiento = lanzamiento;
        this.specs = specs;
    }

    public String getNombre() {
        return nombre;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getLanzamiento() {
        return lanzamiento;
    }
    public String getSpecs() {
        String specs = "";
        for (int i = 0; i < this.specs.length; i++) {
            specs += this.specs[i];
            if (i < this.specs.length - 1) {
                specs += ", ";
            }
        }
        return specs;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    public void setSpecs(String[] specs) {
        this.specs = specs;
    }

    public String printPlataforma() {
        return "Nombre: " + getNombre() + "\nFabricante: " + getFabricante() + "\nLanzamiento: " + getLanzamiento() + "\nSpecs: " + getSpecs();
    }
}
