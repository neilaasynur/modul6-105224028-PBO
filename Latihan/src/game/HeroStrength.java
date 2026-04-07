//ini berguna untuk soal 3 
package game;

public class HeroStrength extends Hero {
    String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower, String tipe) {
        super(nama, health, attackPower);
        this.tipe = tipe;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Tipe: " + this.tipe);
    }
    public void terimaSerangan(double damage){
        this.health -= (0.5 * damage);
    }
}
