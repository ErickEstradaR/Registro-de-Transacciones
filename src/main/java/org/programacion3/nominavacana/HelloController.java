

package org.programacion3.nominavacana;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class HelloController{

    //Anchor Panes-----------------------
    @FXML
    private AnchorPane InicioAnchorPane;
    @FXML
    private AnchorPane anadirAnchorPane;
    //-----------------------------------


    //------------------------------------Checkboxes
    @FXML
    private CheckBox banreservasCB;

    @FXML
    private CheckBox bhdCB;

    @FXML
    private CheckBox popularCB;

    //------------------------------------

    //Textfields
    @FXML
    private TextField tiporegistroTF;
    @FXML
    private TextField idempresaTF;
    @FXML
    private TextField nombreempresaTF;
    @FXML
    private TextField secuenciaTF;
    @FXML
    private TextField secuenciatransTF;
    @FXML
    private TextField cuentaDestinoTF;
    @FXML
    private TextField monedaDestinoTF;
    @FXML
    private TextField codBancoDestinoTF;
    @FXML
    private TextField montotransacTF;
    @FXML
    private TextField nombreBeneficiarioTF;
    @FXML
    private TextField cuentaBeneficiarioTF;
    //------------------------

    @FXML
    private Button addEmpleado;

    @FXML
    private GridPane guardarGP;
    @FXML
    private GridPane popularGP;
    @FXML
    private Button guardarPPBTN;
    @FXML
    private GridPane bhdGP;
    @FXML
    private TextField nombrebhdTF;
    @FXML
    private TextField refTF;
    @FXML
    private TextField montobhdTF;
    @FXML
    private TextField conceptobhdTF;
    @FXML
    private TextField divisaTF;
    @FXML
    private TextField numreservasTF;
    @FXML
    private TextField numbeneficiariobanreservasTF;
    @FXML
    private TextField pagobanreservasTF;
    @FXML
    private TextField conceptoreservasTF;

    @FXML
    private Button guardarBHDBtn;
    @FXML
    private Button guardarbanreservasBTN;


    @FXML
    private Label infoLB;
    @FXML
    private TextField cuentaTF;
    @FXML
    private GridPane reservasGP;




    @FXML
    public void initialize(){
        checkBox();
    }

    public void checkBox(){
        popularCB.setOnAction(event -> {
            if (popularCB.isSelected()){
                banreservasCB.setSelected(false);
                bhdCB.setSelected(false);
                popularGP.setVisible(true);
                guardarGP.setVisible(true);
                reservasGP.setVisible(false);
                bhdGP.setVisible(false);
                infoLB.setVisible(false);
                guardarPPBTN.setVisible(true);
                guardarBHDBtn.setVisible(false);
                guardarbanreservasBTN.setVisible(false);
            }});
        banreservasCB.setOnAction(event -> {if (banreservasCB.isSelected()) {
            popularCB.setSelected(false);
            bhdCB.setSelected(false);
            reservasGP.setVisible(true);
            popularGP.setVisible(false);
            bhdGP.setVisible(false);
            infoLB.setVisible(false);
            guardarbanreservasBTN.setVisible(true);
            guardarBHDBtn.setVisible(false);
            guardarBHDBtn.setVisible(false);

        }});
        bhdCB.setOnAction(event -> {if (bhdCB.isSelected()) {
            banreservasCB.setSelected(false);
            popularCB.setSelected(false);
            reservasGP.setVisible(false);
            popularGP.setVisible(false);
            bhdGP.setVisible(true);
            infoLB.setVisible(false);
            guardarbanreservasBTN.setVisible(false);
            guardarBHDBtn.setVisible(true);
            guardarPPBTN.setVisible(false);
        }});


    }

    
    public int Banco (){
        int op = 0;
        if(banreservasCB.isSelected()){
            op = 1;
        }
        else if(bhdCB.isSelected()){
            op = 2;
        }
        else if(popularCB.isSelected()){
            op = 3;
        }
        return op;
    }












    @FXML
    void inicioOnAction(ActionEvent event) {
        InicioAnchorPane.setVisible(true);
        anadirAnchorPane.setVisible(false);

    }

    @FXML
    private void addOnAction(ActionEvent actionEvent) {
        anadirAnchorPane.setVisible(true);
        InicioAnchorPane.setVisible(false);

    }







    public void guardarTransaccionBHD(){
        BancoBHD bhd = new BancoBHD(cuentaTF.getText(),nombrebhdTF.getText(),refTF.getText(),
                Float.parseFloat(montobhdTF.getText()),conceptobhdTF.getText()
                );
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Ruta.BancoBHD,true))) {
            writer.write(bhd.toString());
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void guardarTransaccionPopular(ActionEvent actionEvent) {

        BancoPopular popular = new BancoPopular(tiporegistroTF.getText(), idempresaTF.getText(),
                nombreempresaTF.getText(),secuenciaTF.getText(),secuenciatransTF.getText(),cuentaDestinoTF.getText()
        ,Integer.parseInt(monedaDestinoTF.getText()),Integer.parseInt(codBancoDestinoTF.getText()),
                Float.parseFloat(montotransacTF.getText()),nombreBeneficiarioTF.getText());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Ruta.BancoPopular+getRegistroEncabezado(
                idempresaTF.getText(),nombreempresaTF.getText(),secuenciaTF.getText()
        ),true))) {
            writer.write(popular.toString());
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public String getRegistroEncabezado(String idcompania,String nombreCompania,String secuencia){
        String header = idcompania + nombreCompania + secuencia + ".txt";
        return header;
    }


    public void guardarTransaccionBanreservas(ActionEvent actionEvent) {
        BanReservas banreservas = new BanReservas(divisaTF.getText(),numreservasTF.getText(),
                numbeneficiariobanreservasTF.getText(),Float.parseFloat(pagobanreservasTF.getText())
        ,conceptoreservasTF.getText());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/erick/IdeaProjects/NominaVacana/src/main/resources/Bancos/reservas.txt",true))) {
            writer.write(banreservas.toString());
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}











