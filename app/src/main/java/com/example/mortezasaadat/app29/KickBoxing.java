package com.example.mortezasaadat.app29;

/**
 * Created by mortezasaadat on 6/30/16.
 */
public class KickBoxing extends Boxing {


    private int kickPowerRequired;
    private int kickSpeedRequired;

    public KickBoxing(String name, String rules, String uniform, int speedRequired, int powerRequired,
                      int punchingPowerRequired, int punchingSpeedRequired,
                      int kickPowerRequired, int kickSpeedRequired, int costOfInsurance) {

        super(name, rules, uniform, speedRequired, powerRequired, punchingPowerRequired,
                punchingSpeedRequired, costOfInsurance);

        this.kickPowerRequired = kickPowerRequired;
        this.kickSpeedRequired = kickSpeedRequired;

    }

    public int getKickPowerRequired() {
        return kickPowerRequired;
    }

    public void setKickPowerRequired(int kickPowerRequired) {
        this.kickPowerRequired = kickPowerRequired;
    }

    public int getKickSpeedRequired() {
        return kickSpeedRequired;
    }

    public void setKickSpeedRequired(int kickSpeedRequired) {
        this.kickSpeedRequired = kickSpeedRequired;
    }

    @Override
    public String toString() {

        return String.format("%s%n%s: %d%n%s: %d", super.toString(),
                "Kick Power Required", getKickPowerRequired(),
                "Kick Speed Required", getKickSpeedRequired());
    }
}
