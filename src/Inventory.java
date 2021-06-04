import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        this.guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood,
                          String topWood,double price) {
        Guitar guitar = new Guitar(serialNumber,builder,model,type,backWood,topWood,price);
        guitars.add(guitar);
    }

    // me sepa loke katada one // tada tada tada
    public Guitar getGuitar(String serialNumber) {
        for (Iterable i = (Iterable) guitars.iterator(); ((Iterator<?>) i).hasNext();) {
            Guitar guitar = (Guitar) ((Iterator<?>) i).next();

            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

}
