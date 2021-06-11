public class App {
    public static void main(String[] args) {
        Bank abc = new Bank_ABC();
        Bank def = new Bank_DEF();
        Bank xyz = new Bank_XYZ();

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());
        System.out.println(abc.GetHelloMessage());
        System.out.println(def.GetHelloMessage());
        System.out.println(xyz.GetHelloMessage());
    }
}
