package turdasan.elysian.interview.entity;

import javax.persistence.*;

@Entity()
@Table(name = "stocks")
public class Stock {
    @EmbeddedId
    private StockKey id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pharmacyId")
    private Pharmacy pharmacies;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("drugId")
    private Drug drugs;

    @Column(name = "quantity")
    private int quantity;

    public Stock(Pharmacy p , Drug d){
        this.pharmacies = p;
        this.drugs = d;
        this.id = new StockKey(p.getId(), d.getId());
    }

    public StockKey getId() {
        return id;
    }

    public void setId(StockKey id) {
        this.id = id;
    }

    public Pharmacy getPharmacy() {
        return pharmacies;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacies = pharmacy;
    }

    public Drug getDrug() {
        return drugs;
    }

    public void setDrug(Drug drugs) {
        this.drugs = drugs;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
