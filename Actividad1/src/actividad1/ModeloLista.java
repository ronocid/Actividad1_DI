
package actividad1;

import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


public class ModeloLista implements ListModel{

    @Override
    public int getSize() {
        return this.getSize();
    }

    @Override
    public Object getElementAt(int index) {
        return this.getElementAt(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.addListDataListener(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
       this.removeListDataListener(l);
    }
    
    public void removeElement(Object elemento){
        this.removeElement(elemento);
    }
    
    public void addElement(Object elemento){
        this.addElement(elemento);
    }
}
