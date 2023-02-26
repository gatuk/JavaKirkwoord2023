public class Numdiv {
    public static void main(String[] args) {
        System.out.println(17%20);

        String s1="Eagles";
        String s2= new String("Eagles");
        System.out.println(s1==s2);// check ref
        System.out.println(s1.equals(s2));// compare content
        s1= "eagles";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        int num1 = 10;
        int num2 = 20;

        int result=(num1>num2) ? (num1):(num2);
        System.out.println(result);





    }
}
