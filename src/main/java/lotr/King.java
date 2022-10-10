package lotr;

import lotr.Character;
import lotr.Noble;

import java.util.Random;

public class King extends Noble {
    public King() {
        super(5, 15);
    }

    //class lotr.King
//   - attributes: int power=from 5 to 15, int hp=from 5 to 15
//           - methods: void kick(Character c) {
//           decrease number of hp of the enemy by random
//           number which will be in the range of his power
//           }
}
