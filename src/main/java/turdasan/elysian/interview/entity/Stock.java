package turdasan.elysian.interview.entity;

import javax.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pharmacy_id")
    private Pharmacy pharmacies;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drug_id")
    private Drug drugs;

    @Column(name = "quantity")
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Pharmacy getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacy pharmacies) {
        this.pharmacies = pharmacies;
    }


    public Drug getDrugs(){
        return drugs;
    }

    public void setDrugs(Drug drugs) {
        this.drugs = drugs;
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