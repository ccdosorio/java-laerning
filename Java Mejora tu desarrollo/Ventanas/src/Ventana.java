import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Ventana {

    JFrame ventana;
    JPanel panelA, panelB;
    JLabel saludo, saludo2;
    JButton boton;

    public Ventana() {
        // Primero se crean los paneles y se agregan a la ventana, el orden es importante.
        crearPanelA();
        crearPanelB();
        crearVentana();
    }

    public void crearPanelA() {
        panelA = new JPanel();

        saludo = new JLabel("Bienvenidos");
        saludo2 = new JLabel("Bienvenidos de nuevo");
//        saludo.setText("Bienvenidos");
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS)); // acomodar en el eje de las X
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(saludo);
        panelA.add(saludo2);

    }

    public void crearPanelB() {
        panelB = new JPanel();
        boton = new JButton();
        boton.setText("Entrar");
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(boton);
    }

    public void crearVentana() {

        ventana = new JFrame();
        ventana.setTitle("Ventana Nueva");
        ventana.setSize(400, 400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS)); // acomodar de forma vertical
        ventana.add(panelA);
        ventana.add(panelB);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);

    }
}
