module ru.netology.mavenexemple {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.netology.mavenexemple to javafx.fxml;
    exports ru.netology.mavenexemple;
}