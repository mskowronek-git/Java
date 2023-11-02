/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Hideout<T> {
    private T hiddenObject;

    public void putIntoHideout(T toHide) {
        if (this.hiddenObject != null && hiddenObject.equals(toHide)) {
            takeFromHideout();
        } else {
            this.hiddenObject = toHide;
        }
    }
    
    public T takeFromHideout() {
        T ourObject = this.hiddenObject;
        this.hiddenObject = null;
        return ourObject;
    }
    
    public boolean isInHideout() {
        return this.hiddenObject != null;
    }
    
    
}
