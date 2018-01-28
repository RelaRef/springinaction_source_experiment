package packageNameA.implementations;

import packageNameA.interfeces.InterA;

public class InterAImplInj implements InterA {
    public void identify() {
        System.out.println("This is the INJECTED implementation which has replaced the default via xml property injection.");
    }
}
