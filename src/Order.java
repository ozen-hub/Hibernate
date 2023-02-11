import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Orders")
public class Order {
    @Id
    private String id;
    private double cost;

    @ManyToOne()
    private Customer customer;

    public Order() {
    }

    public Order(String id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
