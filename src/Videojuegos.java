public class Videojuegos implements Entregable{

    //ATRIBUTOS
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "No sabemos";
    private String company;


    //CONSTRUCTORES
    public Videojuegos () {}

    public Videojuegos (String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuegos (String titulo, int horasEstimadas, String genero, String company){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
    }


    //GETERS
    public String getTitulo(){
        return  titulo;
    }
    public  int getHorasEstimadas(){
        return horasEstimadas;
    }
    public String getGenero(){
        return genero;
    }
    public  String getCompany(){
        return company;
    }

    //SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas = horasEstimadas;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCompany(String company){
        this.company = company;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\n" +
                "Horas Estimadas de Juego: " + horasEstimadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Genero: " + genero + "\n" +
                "Compañia: " + company;
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
        return entregado;
    }

}
