package bridge.impl;

public class Ladino implements RpgCharacter {
    
    
    @Override
    public int getVida() {
       return 50;
    }

    @Override
    public int getForca() {
        return 60;
    }

    @Override
    public int getVelocidade() {
        return 90;
    }

    @Override
    public int getResistencia() {
       return 40;
    }

    @Override
    public int getDestreza() {
        return 70;
    }

    @Override
    public int getInteligencia() {
        return 80;
    }
}
