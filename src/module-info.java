module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires java.sql;
	exports gui;
	opens gui to javafx.fxml;
	opens model.entities;
	opens model.services;
	
	opens application to javafx.graphics, javafx.fxml;
}
