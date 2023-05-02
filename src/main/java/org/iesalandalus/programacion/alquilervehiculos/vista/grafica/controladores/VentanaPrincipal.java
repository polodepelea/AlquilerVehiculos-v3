package org.iesalandalus.programacion.alquilervehiculos.vista.grafica.controladores;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.iesalandalus.programacion.alquilervehiculos.vista.grafica.recursos.LocalizadorRecursos;
import org.iesalandalus.programacion.alquilervehiculos.vista.grafica.utilidades.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VentanaPrincipal extends Controlador {
	@FXML
	private Button btPulsame;

	@FXML
	private void initialize() {
		System.out.println("inicializadamente");
	}

	@FXML
	private void abrirVentanaClientes() {
		VentanaClientes ventanaClientes = (VentanaClientes) Controladores.get("vistas/VentanaClientes.fxml", "", null);

		ventanaClientes.getEscenario().show();

	}

	@FXML
	private BorderPane bp;
	@FXML
	private AnchorPane ap;

	@FXML
	private void home() {
		bp.setCenter(ap);

	}

	@FXML
	void page1(ActionEvent event) {
		cargarPagina("page1");

	}

	private void cargarPagina(String page) {
		Parent root = null;
		try {
			root = FXMLLoader.load(LocalizadorRecursos.class.getResource("vistas/" + page + ".fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		bp.setCenter(root);
	}

}