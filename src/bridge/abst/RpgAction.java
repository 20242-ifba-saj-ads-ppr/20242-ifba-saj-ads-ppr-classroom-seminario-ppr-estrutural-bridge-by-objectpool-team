package bridge.abst;

import bridge.impl.RpgCharacter;

public abstract class RpgAction {

    protected RpgCharacter bridge;

    public RpgAction(RpgCharacter bridge){
        this.bridge = bridge;
    }

    public abstract void atacar(RpgCharacter target);

    public String getClassName(Object o){
        return o.getClass().getSimpleName();
    }
}
