package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    @FXML
    private Label numeroActual, numeroUltimo, numeroPenultimo,
            numero1, numero11, numero12, numero13, numero14, numero15, numero16, numero17, numero18, numero19, numero10,
            numero2, numero21, numero22, numero23, numero24, numero25, numero26, numero27, numero28, numero29, numero20,
            numero3, numero31, numero32, numero33, numero34, numero35, numero36, numero37, numero38, numero39, numero30,
            numero4, numero41, numero42, numero43, numero44, numero45, numero46, numero47, numero48, numero49, numero40,
            numero5, numero51, numero52, numero53, numero54, numero55, numero56, numero57, numero58, numero59, numero50,
            numero6, numero61, numero62, numero63, numero64, numero65, numero66, numero67, numero68, numero69, numero60,
            numero7, numero71, numero72, numero73, numero74, numero75, numero76, numero77, numero78, numero79, numero70,
            numero8, numero81, numero82, numero83, numero84, numero85, numero86, numero87, numero88, numero89, numero80,
            numero9, numero90;

    @FXML
    private Button botonSiguiente;

    private ArrayList<Integer> listaNumerosSalidos;
    private ArrayList<Label> listaNumerosPantalla;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        instancias();
        configurarLista();
        acciones();
    }

    private void configurarLista() {
        listaNumerosPantalla.add(numero1);
        listaNumerosPantalla.add(numero11);
        listaNumerosPantalla.add(numero12);
        listaNumerosPantalla.add(numero13);
        listaNumerosPantalla.add(numero14);
        listaNumerosPantalla.add(numero15);
        listaNumerosPantalla.add(numero16);
        listaNumerosPantalla.add(numero17);
        listaNumerosPantalla.add(numero18);
        listaNumerosPantalla.add(numero19);
        listaNumerosPantalla.add(numero10);

        listaNumerosPantalla.add(numero2);
        listaNumerosPantalla.add(numero20);
        listaNumerosPantalla.add(numero21);
        listaNumerosPantalla.add(numero22);
        listaNumerosPantalla.add(numero23);
        listaNumerosPantalla.add(numero24);
        listaNumerosPantalla.add(numero25);
        listaNumerosPantalla.add(numero26);
        listaNumerosPantalla.add(numero27);
        listaNumerosPantalla.add(numero28);
        listaNumerosPantalla.add(numero29);

        listaNumerosPantalla.add(numero3);
        listaNumerosPantalla.add(numero30);
        listaNumerosPantalla.add(numero31);
        listaNumerosPantalla.add(numero32);
        listaNumerosPantalla.add(numero33);
        listaNumerosPantalla.add(numero34);
        listaNumerosPantalla.add(numero35);
        listaNumerosPantalla.add(numero36);
        listaNumerosPantalla.add(numero37);
        listaNumerosPantalla.add(numero38);
        listaNumerosPantalla.add(numero39);

        listaNumerosPantalla.add(numero4);
        listaNumerosPantalla.add(numero40);
        listaNumerosPantalla.add(numero41);
        listaNumerosPantalla.add(numero42);
        listaNumerosPantalla.add(numero43);
        listaNumerosPantalla.add(numero44);
        listaNumerosPantalla.add(numero45);
        listaNumerosPantalla.add(numero46);
        listaNumerosPantalla.add(numero47);
        listaNumerosPantalla.add(numero48);
        listaNumerosPantalla.add(numero49);

        listaNumerosPantalla.add(numero5);
        listaNumerosPantalla.add(numero50);
        listaNumerosPantalla.add(numero51);
        listaNumerosPantalla.add(numero52);
        listaNumerosPantalla.add(numero53);
        listaNumerosPantalla.add(numero54);
        listaNumerosPantalla.add(numero55);
        listaNumerosPantalla.add(numero56);
        listaNumerosPantalla.add(numero57);
        listaNumerosPantalla.add(numero58);
        listaNumerosPantalla.add(numero59);

        listaNumerosPantalla.add(numero6);
        listaNumerosPantalla.add(numero61);
        listaNumerosPantalla.add(numero62);
        listaNumerosPantalla.add(numero63);
        listaNumerosPantalla.add(numero64);
        listaNumerosPantalla.add(numero65);
        listaNumerosPantalla.add(numero66);
        listaNumerosPantalla.add(numero67);
        listaNumerosPantalla.add(numero68);
        listaNumerosPantalla.add(numero69);
        listaNumerosPantalla.add(numero60);

        listaNumerosPantalla.add(numero7);
        listaNumerosPantalla.add(numero70);
        listaNumerosPantalla.add(numero71);
        listaNumerosPantalla.add(numero72);
        listaNumerosPantalla.add(numero73);
        listaNumerosPantalla.add(numero74);
        listaNumerosPantalla.add(numero75);
        listaNumerosPantalla.add(numero76);
        listaNumerosPantalla.add(numero77);
        listaNumerosPantalla.add(numero78);
        listaNumerosPantalla.add(numero79);

        listaNumerosPantalla.add(numero8);
        listaNumerosPantalla.add(numero80);
        listaNumerosPantalla.add(numero81);
        listaNumerosPantalla.add(numero82);
        listaNumerosPantalla.add(numero83);
        listaNumerosPantalla.add(numero84);
        listaNumerosPantalla.add(numero85);
        listaNumerosPantalla.add(numero86);
        listaNumerosPantalla.add(numero87);
        listaNumerosPantalla.add(numero88);
        listaNumerosPantalla.add(numero89);

        listaNumerosPantalla.add(numero9);
        listaNumerosPantalla.add(numero90);
    }

    private void acciones() {
        botonSiguiente.setOnAction(new ManejoPulsacion());
    }


    private void instancias() {
        listaNumerosSalidos = new ArrayList();
        listaNumerosPantalla = new ArrayList();
    }

    private class ManejoPulsacion implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == botonSiguiente) {

                while (true) {
                    int numeroSalido = (int) (Math.random() * 90 + 1);
                    boolean existe = false;
                    for (Integer item : listaNumerosSalidos) {
                        if (item == numeroSalido) {
                            existe = true;
                        }
                    }
                    if (!existe) {
                        listaNumerosSalidos.add(numeroSalido);
                        numeroActual.setText(String.valueOf(numeroSalido));

                        if (listaNumerosSalidos.size() >=2) {
                            numeroUltimo.setText(String.valueOf(listaNumerosSalidos.get(listaNumerosSalidos.size()-2)));
                            if (listaNumerosSalidos.size() >= 3) {
                                numeroPenultimo.setText(String.valueOf(listaNumerosSalidos.get(listaNumerosSalidos.size()-3)));
                            }
                        }

                        for (Label label : listaNumerosPantalla) {
                            if (label.getText().equals(String.valueOf(numeroSalido))) {
                                label.setTextFill(Color.RED);
                            }
                        }
                        break;
                    } else if (listaNumerosSalidos.size() == 90) {
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("SE ACABO!");
                        alert.setHeaderText("No quedan mas numeros");
                        alert.setContentText("Revisa tu carton porque te has saltado algun numero");
                        alert.show();

                        numeroActual.setText("☺");
                        numeroUltimo.setText("☺");
                        numeroPenultimo.setText("☺");

                        break;
                    }
                }
            }
        }
    }
}