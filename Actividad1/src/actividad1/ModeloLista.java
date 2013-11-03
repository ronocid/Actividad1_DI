
package actividad1;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class ModeloLista extends AbstractListModel{
    private ArrayList lista;
    
    public ModeloLista(){
        this.lista=new ArrayList ();
    }
    
    public ModeloLista(ArrayList list){
        this.lista=list;
    }

    @Override
    public int getSize() {
        return this.lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.lista.get(index);
    }
    
    public void addElement(Object element){
        this.lista.add(element);
        this.fireIntervalRemoved(this,this.lista.size(),this.lista.size()+1);
    }
    
    public void removeElement(Object element){
        this.lista.remove(element);
        this.fireIntervalAdded(this,this.lista.size(),this.lista.size()-1);
    }
    

}
