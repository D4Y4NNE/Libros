
public class Main
{
    public static void main (String args[])
    {
        Libros libros = new Libros();
        libros.setTitulo("ABC");

        libros.agregarAutor(new Autor("Blue", "Layrily", 01234));
        libros.agregarAutor(new Autor("Sky", "Payu", 56789));

        System.out.println(libros.getAutor() + libros.getTitulo());
    }
}
