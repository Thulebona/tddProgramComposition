package za.ac.cput.tddProgram;

/**
 * Created by student on 2015/02/26.
 */
public class Car extends Vehicle {

   private String v_type;

    public Car() {
    }

    public Car(String v_maker, String v_model, int v_year, String v_type) {
        super(v_maker, v_model, v_year);
        this.v_type = v_type;
    }

    public String getV_type() {
        return v_type;
    }

    public void setV_type(String v_type) {
        this.v_type = v_type;
    }

}
