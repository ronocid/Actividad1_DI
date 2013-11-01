
package actividad1;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class ModeloCombo implements ComboBoxModel {

    @Override
    public void setSelectedItem(Object anItem) {
        this.setSelectedItem(anItem);
    }

    @Override
    public Object getSelectedItem() {
        return this.getSelectedItem();
    }

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
    
    public void addElement(Object elemento){
        this.addElement(elemento);
    }
    
    public void removeElement(Object elemento){
        this.removeElement(elemento);
    }
}
