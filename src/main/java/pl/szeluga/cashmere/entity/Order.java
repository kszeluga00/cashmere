package pl.szeluga.cashmere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "order_number", nullable = false)
    private String orderNumber;
    @OneToMany(targetEntity = OrderedItem.class, cascade = ALL)
    @JoinColumn(name = "ordered_item", referencedColumnName = "id")
    private List<OrderedItem> orderedItem;
    @OneToOne
    @JoinColumn(name = "buyer", referencedColumnName = "id")
    private User buyer;
    @Column(name = "date_of_order", nullable = false)
    private Timestamp dateOfOrder;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<OrderedItem> getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(List<OrderedItem> orderedItem) {
        this.orderedItem = orderedItem;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Timestamp getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Timestamp dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
