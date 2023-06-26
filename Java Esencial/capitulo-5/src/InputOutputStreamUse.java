import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStreamUse {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\cosorio\\Documents\\Linkedin Learning\\Java Esencial\\ejemplo.txt");
        Path outputPath = Paths.get("C:\\Users\\cosorio\\Documents\\Linkedin Learning\\Java Esencial\\ejemplo2.txt");
//        InputStream input;
//        try {
//            input = Files.newInputStream(inputPath, StandardOpenOption.READ);
//            int i;
//            while ((i = input.read()) != -1) {
//                System.out.print((char)i);
//            }
//            input.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

      try {
          InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
          Files.newOutputStream(outputPath, StandardOpenOption.CREATE);
          OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

          int i;

          byte[] data = new byte[1024];
          while ((i = inputStream.read(data)) != -1) {
              outputStream.write(data); // Escribimos los datos leidos del archivo de entrada en el archivo de salida
          }

          inputStream.close();
          outputStream.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}
