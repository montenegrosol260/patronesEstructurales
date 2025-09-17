package entidades.Proxy;

public class ArchivoReal implements  Archivo{
 private String archivo;

    public ArchivoReal(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void abrir(String usuario) {
        System.out.println("Abriendo el archivo"+ "'" + archivo + "' ...");
    }

    @Override
    public void leer(String usuario) {
        System.out.println("Leyendo el archivo"+ "'" + archivo + "' ...");
    }
}
