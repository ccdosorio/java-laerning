public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("False & False es " + (false & false));
        System.out.println("True & False es " + (true & false));
        System.out.println("False & True es " + (false & true));
        System.out.println("True & True es " + (true & true));

        // AND CIRCUITO CORTO
        System.out.println("False && False es " + (false && false));
        System.out.println("True && False es " + (true && false));
        System.out.println("False && True es " + (false && true));
        System.out.println("True && True es " + (true && true));

        System.out.println("False | False es " + (false | false));
        System.out.println("True | False es " + (true | false));
        System.out.println("False | True es " + (false | true));
        System.out.println("True | True es " + (true | true));

        // XOR
        System.out.println("False ^ False es " + (false ^ false));
        System.out.println("True ^ False es " + (true ^ false));
        System.out.println("False ^ True es " + (false ^ true));
        System.out.println("True ^ True es " + (true ^ true));

        //NOT
        System.out.println("!False es " + !false);
        System.out.println("!True es " + !true);
    }
}
