
public class Libros
{
    private String titulo;
    private Integer codigo;
    private Autor autor[];
    private int contadorAutor;
    private int anioPublicacion;
    private Capitulo capitulo[];
    private int contadorCapitulo;

    public Libros()
    {
        this.autor = new autor[2];
        this.contadorAutor = 0;
        this.capitulo = new capitulo[2];
        this.contadorCapitulo = 0;
    }

    public Libros(String titulo, Integer codigo, int anioPublicacion, int contadorCapitulo)
    {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.contadorCapitulo = contadorCapitulo;
    }
    public void agregarAutor(Autor autor)
    {
        this.autor[contadorAutor] = autor;
    }

    public Autor[] getAutor()
    {
        return this.autor;
    }
    public void ordenar()
    {
        for(int i=0; i<autor.length; i++)
        {
            for(int j=i+1; j<autor.length; j++)
            {
                if(autor[i].getCodigo()>autor[j].getCodigo())
                {
                    Autor temp=autor[i];
                    autor[i]=autor[j];
                    autor[j]=temp;
                }
            }
        }
    }
    // set y get TITULO

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public String getTitulo()
    {
        return titulo;
    }
}