
public class Capitulo
{
    private String nombreCapitulo;
    private Tema tema[];
    private int contadorTema;

    public Capitulo()
    {
        this.tema = new Tema[3];
        this.contadorTema = 0;
    }

    public Capitulo(String nombreCapitulo)
    {
        this.nombreCapitulo = nombreCapitulo;
    }
    public  void agregarTema(Tema tema)
    {
        this.tema[contadorTema] = tema;
    }

    public Tema[] getTema()
    {
        return this.tema;
    }
}