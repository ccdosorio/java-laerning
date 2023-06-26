public class SegundoPrograma {
    public static void main(String[] args) {
        int variable1 = 5;
        int variable2 = 10;

        System.out.println(Character.isJavaIdentifierStart(variable1));

        if (variable1 > variable2) {
            System.out.println("Variable 1 es mayor a variable 2");
        } else {
            System.out.println("Variable 2 es mayor a variable 1");
        }
    }
}
