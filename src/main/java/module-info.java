module org.example.ormcoursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.hibernate.orm.core;

    requires jakarta.persistence;
    requires java.naming;

    opens org.example.ormcoursework.controller to javafx.fxml;
    exports org.example.ormcoursework;
}