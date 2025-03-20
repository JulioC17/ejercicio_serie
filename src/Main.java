public class Main {
    public static void main(String[] args) {

        Serie [] series = new Serie[5];
        Videojuegos [] videojuegos = new Videojuegos[5];

        series[0] = new Serie();
        series[0].setTitulo("Juego de Tronos");
        series[0].setNumeroDeTemporadas(8);
        series[0].setGenero("Accion, Fantasia");
        series[0].setCreador("David Benioff y D.B. Weiss");

        series[1] = new Serie();
        series[1].setTitulo("Breaking Bad");
        series[1].setNumeroDeTemporadas(5);
        series[1].setGenero("Drama, Crimen");
        series[1].setCreador("Vince Gilligan");

        series[2] = new Serie();
        series[2].setTitulo("Stranger Things");
        series[2].setNumeroDeTemporadas(4);
        series[2].setGenero("Ciencia ficción, Terror");
        series[2].setCreador("The Duffer Brothers");

        series[3] = new Serie();
        series[3].setTitulo("The Witcher");
        series[3].setNumeroDeTemporadas(2);
        series[3].setGenero("Fantasía, Aventura");
        series[3].setCreador("Lauren Schmidt Hissrich");

        series[4] = new Serie();
        series[4].setTitulo("Friends");
        series[4].setNumeroDeTemporadas(10);
        series[4].setGenero("Comedia, Romance");
        series[4].setCreador("David Crane, Marta Kauffman");

        videojuegos[0] = new Videojuegos();
        videojuegos[0].setTitulo("The Witcher 3");
        videojuegos[0].setHorasEstimadas(50);
        videojuegos[0].setGenero("RPG");
        videojuegos[0].setCompany("CD Projekt Red");

        videojuegos[1] = new Videojuegos();
        videojuegos[1].setTitulo("Uncharted 4");
        videojuegos[1].setHorasEstimadas(20);
        videojuegos[1].setGenero("Aventura");
        videojuegos[1].setCompany("Naughty Dog");

        videojuegos[2] = new Videojuegos();
        videojuegos[2].setTitulo("Cyberpunk 2077");
        videojuegos[2].setHorasEstimadas(70);
        videojuegos[2].setGenero("Acción, RPG");
        videojuegos[2].setCompany("CD Projekt Red");

        videojuegos[3] = new Videojuegos();
        videojuegos[3].setTitulo("The Last of Us");
        videojuegos[3].setHorasEstimadas(15);
        videojuegos[3].setGenero("Acción, Aventura");
        videojuegos[3].setCompany("Naughty Dog");

        videojuegos[4] = new Videojuegos();
        videojuegos[4].setTitulo("Red Dead Redemption 2");
        videojuegos[4].setHorasEstimadas(60);
        videojuegos[4].setGenero("Acción, Aventura");
        videojuegos[4].setCompany("Rockstar Games");

        videojuegos[1].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        series[0].entregar();
        series[1].entregar();

        int serieCount = 0;
        int videojuegoCount = 0;

        for (Videojuegos videojuego : videojuegos){
            if (videojuego.isEntregado()){
                videojuegoCount = videojuegoCount  + 1;
            }
        }
        for (Serie serie : series){
            if(serie.isEntregado()){
                serieCount = serieCount  + 1;
            }
        }

        System.out.println("Hay "  + videojuegoCount + " videojuegos entregados");
        System.out.println("Hay " + serieCount + " series entregadas");
    }
}