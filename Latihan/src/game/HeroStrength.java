//ini berguna untuk soal 3 
package game;

public class HeroStrength extends Hero {
    String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower, String tipe) {
        super(nama, health, attackPower);
        this.tipe = tipe;
    }
}
