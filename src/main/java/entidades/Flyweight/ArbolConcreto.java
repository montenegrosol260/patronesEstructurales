package entidades.Flyweight;

public class ArbolConcreto implements Árbol{
    //estados intrínsicos
    private String tipoArbol;
    private String textura;
    private String color;

    public ArbolConcreto(String tipoArbol, String textura, String color) {
        this.tipoArbol = tipoArbol;
        this.textura = textura;
        this.color = color;
        System.out.println("El árbol de "+ tipoArbol + ", de color "+ color + " y textura "
                + textura + "fue creado correctamente");
    }

    @Override
    public void dibujarArbol(int x, int y) {
        System.out.println( "El árbol de "+ tipoArbol + ", de color "+ color + " y textura "
                + textura + "fue dibujado correctamente en la posición " + x + ", " + y);
    }
}
