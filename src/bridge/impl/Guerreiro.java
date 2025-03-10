package bridge.impl;

public class Guerreiro implements RpgCharacter {

    @Override
    public int getVida() {
       return 70;
    }

    @Override
    public int getForca() {
        return 80;
    }

    @Override
    public int getVelocidade() {
        return 50;
    }

    @Override
    public int getResistencia() {
       return 60;
    }

    @Override
    public int getDestreza() {
        return 50;
    }

    @Override
    public int getInteligencia() {
        return 50;
    }
    
}
