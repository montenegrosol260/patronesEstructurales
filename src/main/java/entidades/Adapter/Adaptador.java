package entidades.Adapter;

public class Adaptador implements ImpresoraTexto{
 private ImpresoraPDF impresoraPDF;

    public Adaptador(ImpresoraPDF impresoraPDF) {
        this.impresoraPDF = impresoraPDF;
    }
    private String convertirTXTaPDF(String txt){
        return "PDF generado desde txt" + txt;
    }

    @Override
    public void imprimirTexto(String texto) {
        String convertido = convertirTXTaPDF(texto);
        impresoraPDF.imprimirPDF(convertido);
    }
}
