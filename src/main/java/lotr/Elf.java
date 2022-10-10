package lotr;
import lotr.Character;
import lotr.Noble;

import java.util.Random;

public class Elf extends Character{

    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        }
        else {
            c.setPower(c.getPower()-1);
        }
    }
//   - attributes: int power=10, int hp=10
//           - methods: void kick(Character c) {
//           kill everybody weaker than him,
//           otherwise decrease the power of character by 1
//           }

}
