public class Main {
    public static void main(String[] args) {
        // Crear el concurso
        Concurso concurso = new Concurso(5);

        // Agregar canciones
        Cancion cancion1 = new Cancion("Let It Be - The Beatles");
        Cancion cancion2 = new Cancion("Bohemian Rhapsody - Queen");
        Cancion cancion3 = new Cancion("Stairway to Heaven - Led Zeppelin");

        concurso.agregarCancion(cancion1);
        concurso.agregarCancion(cancion2);
        concurso.agregarCancion(cancion3);

        // Realizar votaciones
        concurso.votar(0, 9);  // Votamos la primera canción con puntuación 9
        concurso.votar(1, 10); // Votamos la segunda canción con puntuación 10
        concurso.votar(2, 8);  // Votamos la tercera canción con puntuación 8

        // Mostrar las canciones y sus puntuaciones
        System.out.println("Canciones en el concurso:");
        concurso.mostrarCanciones();

        // Obtener y mostrar la canción ganadora
        Cancion ganador = concurso.obtenerGanador();
        System.out.println("\nLa canción ganadora es: " + ganador);
    }
}

