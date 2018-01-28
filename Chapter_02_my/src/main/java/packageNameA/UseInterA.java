package packageNameA;


import packageNameA.implementations.InterAImplDef;
import packageNameA.interfeces.InterA;

public class UseInterA implements InterA {
    private InterA interA;

    public UseInterA(){
        this.interA = getInterA();
    }

    public InterA getInterA(){
        return new InterAImplDef();
    }


    public void setInterA(InterA interA) {
        this.interA = interA;
    }

    public void identify() {
        interA.identify();
    }
}
