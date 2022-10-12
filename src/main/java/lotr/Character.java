package lotr;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    private int power, hp;


    public void kick(Character c){

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
        if (hp > 0){
            this.hp = hp;}
        else {this.hp = 0;}
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" +hp + ", power=" + power +"}";
    }


}

