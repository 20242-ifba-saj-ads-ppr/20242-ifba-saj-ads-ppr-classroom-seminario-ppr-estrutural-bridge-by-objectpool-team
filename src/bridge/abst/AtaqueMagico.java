package bridge.abst;

import bridge.impl.RpgCharacter;

public class AtaqueMagico extends RpgAction {
    
    private double multi;

    public AtaqueMagico(RpgCharacter bridge, double multi){
        super(bridge);
        this.multi = multi;
    }

    public void atacar(RpgCharacter target){
        System.out.println(getClassName(super.bridge) + " atacou " + getClassName(target) + " com um " + getClassName(this));
        System.out.println( "A vida restante do alvo é de: " + (target.getVida() - (super.bridge.getInteligencia() * multi)) );
    }
}
