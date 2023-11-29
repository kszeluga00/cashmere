package pl.szeluga.cashmere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = OrderedItem.class, cascade = ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ordered_items", referencedColumnName = "id")
    private List<OrderedItem> orderedItems;
    @ManyToOne(targetEntity = User.class, cascade = ALL)
    @JoinColumn(name = "buyer", referencedColumnName = "id")
    private User buyer;
    @Column(name = "date_of_cart_cleaning", nullable = false)
    private Timestamp dateOfCartCleaning;

    public Cart() {
    }

    public Cart(Long id, List<OrderedItem> orderedItems, User buyer, Timestamp dateOfCartCleaning) {
        this.id = id;
        this.orderedItems = orderedItems;
        this.buyer = buyer;
        this.dateOfCartCleaning = dateOfCartCleaning;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<OrderedItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Timestamp getDateOfCartCleaning() {
        return dateOfCartCleaning;
    }

    public void setDateOfCartCleaning(Timestamp dateOfCartCleaning) {
        this.dateOfCartCleaning = dateOfCartCleaning;
    }
}
