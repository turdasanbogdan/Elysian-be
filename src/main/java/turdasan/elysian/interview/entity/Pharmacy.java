package turdasan.elysian.interview.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pharmacies")
public class Pharmacy {

    @Id
    @GeneratedValue()
    private int id;

    @Column()
    private String name;

    @Column()
    private String address;

    @Column()
    private String city;

    @Column()
    private String phone;

    @OneToMany(
            mappedBy = "pharmacies",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Stock> stocks;

    public Pharmacy(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
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
