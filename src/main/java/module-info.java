module com.example.hiberdemo102 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.commons.annotations;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens com.example.hiberdemo102 to javafx.fxml;
    exports com.example.hiberdemo102;
}