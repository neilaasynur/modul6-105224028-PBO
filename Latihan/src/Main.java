import game.Hero;
import game.HeroStrength;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Li LianHua", 100, 47);
        HeroStrength hero2 = new HeroStrength("Li ChengZou", 100, 67);

        hero1.display();
        hero2.display();

        hero1.berlatih();
        hero2.berlatih();

        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        hero1.display();
        hero2.display();
    }
}
