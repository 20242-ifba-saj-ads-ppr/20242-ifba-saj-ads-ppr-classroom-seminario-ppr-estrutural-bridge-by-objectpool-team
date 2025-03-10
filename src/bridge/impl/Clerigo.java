package bridge.impl;

public class Clerigo implements RpgCharacter {
    
    @Override
    public int getVida() {
       return 80;
    }

    @Override
    public int getForca() {
        return 30;
    }

    @Override
    public int getVelocidade() {
        return 40;
    }

    @Override
    public int getResistencia() {
       return 70;
    }

    @Override
    public int getDestreza() {
        return 50;
    }

    @Override
    public int getInteligencia() {
        return 100;
    }
}
