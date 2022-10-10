package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(11) +2, new Random().nextInt(11) +2);
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
    //class Knight
//   - attributes: int power=from 2 to 12, int hp=from 2 to 12
//           - methods: void kick(Character c) { like lotr.King }
//class CharacterFactory
//   - methods: Character createCharacter() {
//           returns random instance of any existing character
//           }
}
