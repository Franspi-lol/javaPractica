/**
 * Videojuego
 */
public class Videojuego extends Media{

    private Plataforma[] plataformas;
    private String desarrollador;
    private String distribuidor;

    public Videojuego(String title, int year, String[] genre, String director, Plataforma[] plataformas, String desarrollador, String distribuidor) {
        super(title, year, genre, director);
        this.plataformas = plataformas;
        this.desarrollador = desarrollador;
        this.distribuidor = distribuidor;
    }

    public Plataforma[] getPlataformas() {
        return plataformas;
    }
    public String getDesarrollador() {
        return desarrollador;
    }
    public String getDistribuidor() {
        return distribuidor;
    }
    public void setPlataformas(Plataforma[] plataformas) {
        this.plataformas = plataformas;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    

    public String printVideojuego() {
        return "Title: " + getTitle() + "\nYear: " + getYear() + "\nGenre: " + getGenre() + "\nDirector: " + getDirector() + "\nPlataformas: " + getPlataformas() + "\nDesarrollador: " + getDesarrollador() + "\nDistribuidor: " + getDistribuidor();
    }
}