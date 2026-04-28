public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean booleanValue = true;
        System.out.println("booleanValue = " + booleanValue);
        
        int intValue = 100;
        System.out.println("intValue = " + intValue);
        
        short shortValue = 100;
        System.out.println("shortValue = " + shortValue);
        
        booleanValue = intValue < shortValue;
        System.out.println("booleanValue = " + booleanValue);
        
        boolean esIgual = true == (2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
