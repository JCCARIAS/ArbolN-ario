import org.example.controller.ControladorArbol;
import org.example.model.ArbolNario;
import org.example.view.VistaArbol;

public class Main {
    public static void main(String[] args) {

        ArbolNario modelo = new ArbolNario();
        VistaArbol vista = new VistaArbol();
        ControladorArbol controlador = new ControladorArbol(modelo, vista);


        controlador.ejecutar();
}
}
