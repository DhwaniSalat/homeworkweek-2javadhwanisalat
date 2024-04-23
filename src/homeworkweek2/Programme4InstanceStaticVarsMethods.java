package homeworkweek2;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4InstanceStaticVarsMethods {
    int a = 20;
    int c = 40;
    static int b = 30;
    static int d = 50;

    public void m1(){
        System.out.println(a);
        System.out.println(c);
        System.out.println(Programme4InstanceStaticVarsMethods.b);
        System.out.println(Programme4InstanceStaticVarsMethods.d);
    }
    public static void m2(){
        Programme4InstanceStaticVarsMethods obj = new Programme4InstanceStaticVarsMethods();
        System.out.println(obj.a);
        System.out.println(obj.c);
        System.out.println(b);
        System.out.println(d);

    }

    public static void main(String[] args) {
        Programme4InstanceStaticVarsMethods obj = new Programme4InstanceStaticVarsMethods();
        obj.m1();
        m2();

    }



}


