public class Concurso {
    private Cancion[] canciones;
    private int cantidadCanciones;

    // Constructor
    public Concurso(int maxCanciones) {
        canciones = new Cancion[maxCanciones];
        cantidadCanciones = 0;
    }

    // Agregar una canción al concurso
    public void agregarCancion(Cancion cancion) {
        if (cantidadCanciones < canciones.length) {
            canciones[cantidadCanciones] = cancion;
            cantidadCanciones++;
        }
    }

    public void mostrarCanciones() {
        for (int i = 0; i < cantidadCanciones; i++) {
            System.out.println(canciones[i]);
        }
    }

    // Método para realizar una votación
    public void votar(int indiceCancion, int puntuacion) {
        if (indiceCancion >= 0 && indiceCancion < cantidadCanciones) {
            canciones[indiceCancion].setPuntuacion(puntuacion);
        }
    }

    // Obtener la canción con la mayor puntuación
    public Cancion obtenerGanador() {
        Cancion ganador = canciones[0];
        for (int i = 1; i < cantidadCanciones; i++) {
            if (canciones[i].getPuntuacion() > ganador.getPuntuacion()) {
                ganador = canciones[i];
            }
        }
        return ganador;
    }
}

