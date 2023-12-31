
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        LicensePlate objLicense = (LicensePlate) obj;
        
        if (!this.country.equals(objLicense.country)) {
            return false;
        }
        if (!this.liNumber.equals(objLicense.liNumber)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.liNumber);
        hash = 71 * hash + Objects.hashCode(this.country);
        return hash;
    }
    
    
    
    

}
