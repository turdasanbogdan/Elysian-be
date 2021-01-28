package turdasan.elysian.interview.entity;

import javax.persistence.*;
import java.util.StringJoiner;

@Entity
@Table(name="drugs")
public class Drugs {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

   public Drugs() {

   }

   public Drugs(String name, String type){
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
}
