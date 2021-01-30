package turdasan.elysian.interview.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "drugs")
public class Drug {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    private String name;

    @Column
    private String type;

    @OneToMany(
            mappedBy = "drugs",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Stock> stocks;

   public Drug() { }

   public Drug(String name, String type){
       this.name = name;
       this.type = type;
   }

   //getters and setters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
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
