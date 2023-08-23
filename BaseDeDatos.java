import java.util.ArrayList;

public class BaseDeDatos
{
    private ArrayList<Elemento> items;
    
    public BaseDeDatos()
    {
        items = new ArrayList<Elemento>();
    }
    
    public void addElemento(Elemento elElemento)
    {
        items.add(elElemento);
    }
    
    public void list()
    {
        for(Elemento item : items)
        {
            item.print();
            System.out.println();//Imprime linea vacia
        }
    }

}
