package com.example.mortezasaadat.app29;

/**
 * Created by mortezasaadat on 6/30/16.
 */
public class Boxing extends Sport {


    private int punchingPowerRequired;
    private int punchingSpeedRequired;
    private int costOfInsurance;


    public Boxing(String name, String rules, String uniform, int speedRquired, int powerRequired,
                  int punchingPowerRequired, int punchingSpeedRequired, int costOfInsurance) {


        super(name, rules, uniform, speedRquired, powerRequired);

        this.punchingPowerRequired = punchingPowerRequired;
        this.punchingSpeedRequired = punchingSpeedRequired;
        this.costOfInsurance = costOfInsurance;

    }


    public int getPunchingPowerRequired() {
        return punchingPowerRequired;
    }

    public void setPunchingPowerRequired(int punchingPowerRequired) {
        this.punchingPowerRequired = punchingPowerRequired;
    }

    public int getPunchingSpeedRequired() {
        return punchingSpeedRequired;
    }

    public void setPunchingSpeedRequired(int punchingSpeedRequired) {
        this.punchingSpeedRequired = punchingSpeedRequired;
    }


    @Override
    public double evaluateCostOfInsurance() {

        return costOfInsurance;
    }


    @Override
    public String toString() {

        return String.format("%s%n%s: %d%n%s: %d", super.toString(),
                "Punching Power Required", getPunchingPowerRequired(), "Punching Speed Rquired",
                getPunchingSpeedRequired());
    }
}
