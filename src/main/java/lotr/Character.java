package lotr;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    private int power, hp;


    public void kick(Character c){

    }
    boolean isAlive() {
        return False;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" +hp + ", power=" + power +"}";
    }


}

