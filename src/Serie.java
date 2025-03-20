public class Serie implements Entregable {

    //ATRIBUTOS
    private String titulo;
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero = "No sabemos";
    private String creador;


    //CONSTRUCTORES
    public Serie(){}

    public Serie (String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }


    //GETTERS
    public  String getTitulo(){
        return titulo;
    }
    public  int getNumeroDeTemporadas(){
        return  numeroDeTemporadas;
    }
    public String getGenero(){
        return genero;
    }
    public String getCreador(){
        return  creador;
    }

    //SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setNumeroDeTemporadas(int numeroDeTemporadas){
        this.numeroDeTemporadas = numeroDeTemporadas;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCreador(String creador){
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo  + "\n" +
                "Numero de Temporadas: " + numeroDeTemporadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Genero: " + genero + "\n" +
                "Creador: " + creador;
     }

    @Override
    public boolean entregar() {
        entregado = true;
        return entregado;
    }

    @Override
    public boolean devolver() {
        entregado = false;
        return entregado;
    }

    @Override
    public boolean isEntregado() {
        return  entregado;
    }
}
