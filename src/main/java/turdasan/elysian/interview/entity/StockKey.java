//package turdasan.elysian.interview.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//
//@Embeddable
//public class StockKey implements Serializable {
//
//    @Column(name = "pharmacy_id")
//    private int pharmacyId;
//
//    @Column(name = "drug_id")
//    private int drugId;
//
//    public StockKey(){}
//    public StockKey(int pharmacyId, int drugId){
//        this.pharmacyId = pharmacyId;
//        this.drugId = drugId;
//    }
//
//    public int getPharmacyId() {
//        return pharmacyId;
//    }
//
//    public void setPharmacyId(int pharmacyId) {
//        this.pharmacyId = pharmacyId;
//    }
//
//    public int getDrugId() {
//        return drugId;
//    }
//
//    public void setDrugId(int drugId) {
//        this.drugId = drugId;
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//}
