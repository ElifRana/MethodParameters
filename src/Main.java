public class Main {

    public void name(){
        System.out.println("Parametresiz metod");
    }

    public void name1(String a){
        System.out.println("Parametreli metod: " + a);
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.name();
        obj.name1("Rana");
    }
}
