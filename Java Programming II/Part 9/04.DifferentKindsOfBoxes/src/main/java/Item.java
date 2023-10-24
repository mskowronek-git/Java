
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        
        if (this.getClass() != object.getClass()) {
            return false;
        }
        
        Item itemCompare = (Item) object;
        
        if (!this.name.equals(itemCompare.name)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
      
}
