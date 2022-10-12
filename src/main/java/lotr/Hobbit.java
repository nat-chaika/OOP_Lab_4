package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }
    @Override
    public void kick(Character c) {
        System.out.println("kick");
    }
    void toCry()  {

    }
}
//  - attributes: int power=0, int hp=3
//           - methods: void kick(Character c) { toCry() }

