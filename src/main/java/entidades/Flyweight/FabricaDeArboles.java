package entidades.Flyweight;

import java.util.HashMap;
import java.util.Map;

//FlyWeight factory
public class FabricaDeArboles {
    private Map<String, Árbol> arboles = new HashMap<>();

    public Árbol obtenerArbol(String tipoArbol, String textura, String color ){
        String clave = tipoArbol + "-"+ color + "-" + textura;
        //buscamos en la cache si ya existe árbol con ese valor
        Árbol arbol = arboles.get(clave);
        //sino existe, creamos uno nuevo y lo almacenamos
        if (arbol == null) {
            arbol = new ArbolConcreto(tipoArbol, textura, color);
            arboles.put(clave, arbol);
        }
        return arbol;
    }
}
