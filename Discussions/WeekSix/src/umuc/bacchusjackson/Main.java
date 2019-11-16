package umuc.bacchusjackson;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        IPGuardNonGen ipGuardNonGen = new IPGuardNonGen();

        ipGuardNonGen.checkUser("192.168.1.5");
        ipGuardNonGen.checkUser("192.168.1.4");

        IPGuardGen ipGuardGen = new IPGuardGen();

        ipGuardGen.checkUser("192.168.1.5");
        ipGuardGen.checkUser("192.168.1.2");



    }
}
