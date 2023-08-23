

public class DVD extends Elemento
{
    private String director;
    
    public DVD(String elTitulo, String elDirector, int tiempo)
    {
        super(elTitulo, tiempo);
        director = elDirector;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public void print()
    {
        System.out.println("DVD");
        System.out.println("Titulo"+getTitulo());
        System.out.println("Director"+director);
    }

}
