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

public class Programme3InstanceStaticMethod {
    int a = 20;
    static int b =30;

    public void m1(){
        System.out.println(a);
        System.out.println(Programme3InstanceStaticMethod.b);
    }
    public static void m2(){
        Programme3InstanceStaticMethod obj = new Programme3InstanceStaticMethod();
        System.out.println(obj.a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Programme3InstanceStaticMethod obj = new Programme3InstanceStaticMethod();
                obj.m1();
                    m2();

    }



}
