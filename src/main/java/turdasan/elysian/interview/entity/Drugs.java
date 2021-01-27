//package turdasan.elysian.interview.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="drugs")
//public class Drugs {
//
//    public enum Types{
//        COMPRIMATE,
//        SIROP,
//        UNGUENT,
//        SPARY
//    }
//
//    @Id
//    @GeneratedValue()
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "type")
//    @Enumerated(EnumType.STRING)
//    private Types type;
//
//   public Drugs() {
//
//   }
//
//   public Drugs(String name, Types type){
//       this.name = name;
//       this.type = type;
//   }
//
//   //getters and setters
//
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Types getType() {
//        return type;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setType(Types type) {
//        this.type = type;
//    }
//}
