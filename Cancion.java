public class Cancion {
    private String nombre;
    private int puntuacion;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    @Override
    public String toString() {
        return "Cancion: " + nombre + " - Puntuación: " + puntuacion;
    }
}

