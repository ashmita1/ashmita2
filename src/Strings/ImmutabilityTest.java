package Strings;

public class ImmutabilityTest {

    private String changingRef = "TEST_STRING";
    String Env = "QA";

    public static void main(String a[]) {

        ImmutabilityTest dn = new ImmutabilityTest();

        System.out.println("ChangingRef for TEST_STRING OLD : "
                + dn.changingRef.hashCode());

        dn.changingRef = "NEW_TEST_STRING";
        System.out.println("ChangingRef for NEW_TEST_STRING : "
                + dn.changingRef.hashCode());

        dn.changingRef = "TEST_STRING";
        System.out.println("ChangingRef for TEST_STRING BACK : "
                + dn.changingRef.hashCode());

        dn.changingRef = "NEW_TEST_STRING";
        System.out.println("ChangingRef for NEW_TEST_STRING BACK : "
                + dn.changingRef.hashCode());

        String str = new String("STRING1");
        System.out.println("String Class STRING1 : " + str.hashCode());

        str = new String("STRING2");
        System.out.println("String Class STRING2 : " + str.hashCode());

        str = new String("STRING1");
        System.out.println("String Class STRING1 BACK : " + str.hashCode());

        str = new String("STRING2");
        System.out.println("String Class STRING2 BACK : " + str.hashCode());

    }
}