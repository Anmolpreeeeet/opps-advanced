package com.example.mortezasaadat.app29;

/**
 * Created by mortezasaadat on 6/30/16.
 */
public abstract class Sport extends Object implements LifeInsurance {

    private String name;
    private String rules;
    private String uniform;
    private int speedRequired;
    private int powerRequired;


    public Sport(String name, String rules, String uniform, int speedRequired, int powerRequired) {

        this.name = name;
        this.rules = rules;
        this.uniform = uniform;
        this.speedRequired = speedRequired;
        this.powerRequired = powerRequired;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public int getSpeedRequired() {
        return speedRequired;
    }

    public void setSpeedRequired(int speedRequired) {
        this.speedRequired = speedRequired;
    }

    public int getPowerRequired() {
        return powerRequired;
    }

    public void setPowerRequired(int powerRequired) {
        this.powerRequired = powerRequired;
    }


    @Override
    public String toString() {

        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %d%n%s: %d","Name", getName(),"Rules",
                getRules(),"Uniform", getUniform(), "Speed Rquired", getSpeedRequired(),
                "Power Required", getPowerRequired());

    }


}
