public class Herirarchical {

    public static void main(String[] args) {

        System.out.println("PARENT CLASS");
        F1Teams obj = new F1Teams();
        
        System.out.println("FIRST SUBCLASS");
        OracleRedbullracing team1 = new OracleRedbullracing();

        System.out.println("SECOND SUBCLASS");
        AMGMercedes team2  = new AMGMercedes();

    }
    
}

class F1Teams{

    F1Teams() {
        System.out.println("F1 Teams");
    }
    
}

class OracleRedbullracing extends F1Teams{

     OracleRedbullracing() {
        System.out.println("Oracle Redbull racing");
    }
    
}

class AMGMercedes extends F1Teams{

    AMGMercedes() {
        System.out.println("AMG Petronass Mercedes");
    }
    
}