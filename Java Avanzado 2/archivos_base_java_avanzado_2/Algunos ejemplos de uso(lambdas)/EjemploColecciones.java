import java.util.ArrayList;

public class EjemploColecciones {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("lunes");
        arrayList.add("martes");
        arrayList.add("miércoles");
        arrayList.add("jueves");
        arrayList.add("viernes");
        arrayList.add("sábado");
        arrayList.add("domingo");

        arrayList.forEach((s) -> System.out.println(s));
        arrayList.forEach(System.out::println);

    }


}
