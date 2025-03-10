import bridge.abst.AtaqueMagico;
import bridge.abst.RpgAction;
import bridge.impl.RpgCharacter;
import bridge.impl.Clerigo;
import bridge.impl.Guerreiro;

public class Main{
   
    public static void main(String args[]){


        RpgCharacter clerigo;
        RpgCharacter guerreiro;

        RpgAction magia;

        clerigo = new Clerigo();
        guerreiro = new Guerreiro();

        magia = new AtaqueMagico(clerigo, 0.3);

        magia.atacar(guerreiro);

    }
    



}