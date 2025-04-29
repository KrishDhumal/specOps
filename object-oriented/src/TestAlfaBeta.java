class Alfa {
    Alfa() {
        System.out.println("Alfa Constructor");
    }

    void demo() {
        System.out.println("Alfa Demo");
    }
}

class Beta extends Alfa {
    Beta() {
        System.out.println("Beta Constructor");
    }

    void show() {
        System.out.println("Beta Show");
    }

    @Override
    void demo() {
        System.out.println("Beta Demo");
    }
}

public class TestAlfaBeta {
    public static void main(String[] args) {

        System.out.println("Creating Alfa object:");
        Alfa a = new Alfa();    
        a.demo(); 

        System.out.println("\nCreating Beta object:");
        Beta b = new Beta();   
        b.show(); 
        b.demo();  

        System.out.println("\nUpcasting Beta to Alfa:");
        Alfa ab = b; 
        ab.demo();  

        System.out.println("\nDowncasting Alfa ");
        Beta ba = (Beta) ab; 
        ba.show();   
        ba.demo();   
 
       
    }
}
