package cuteness;

public class KittenTester
{
    public static void main(String[] args)
    {
        Kitten cuteKitten = new Kitten(7);
        Kitten superCuteKitten = new Kitten(6);
        Kitten middleSuperCuteKitten = new Kitten(5);
        Kitten alsoSuperCuteKitten = new Kitten(2);
        Kitten notSoCuteKitten = new Kitten(1);
        
        System.out.println("Actual: " + cuteKitten.getCuteness());
        System.out.println("Expected: cute"); 
        System.out.println("Actual: " + superCuteKitten.getCuteness());
        System.out.println("Expected: super cute");
        System.out.println("Actual: " + middleSuperCuteKitten.getCuteness());
        System.out.println("Expected: super cute");
        System.out.println("Actual: " + alsoSuperCuteKitten.getCuteness());
        System.out.println("Expected: super cute");
        System.out.println("Actual: " + notSoCuteKitten.getCuteness());
        System.out.println("Expected: not so cute");
    }
}