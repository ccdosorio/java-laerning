import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeLaCompra {

    private ArrayList<String> lista;
    private String archivo;

    public ListaDeLaCompra(String filename) throws IOException {
        cargarLista(filename);
        archivo = filename;
    }

    private void cargarLista(String filename) throws IOException {
        lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
    }

    public String obtenerElemento(int posicion) throws PositionException {
        try {
            return lista.get(posicion - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
         throw  new PositionException("Posicion fuera de los limites de la lista", e);
        }
    }

    public void insertarElemento(String elemento) throws IOException {
        FileWriter fstream = new FileWriter(archivo, true);
        try (BufferedWriter out = new BufferedWriter(fstream)) {
            out.write("\n" + elemento);
            cargarLista(archivo);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
