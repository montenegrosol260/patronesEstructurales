package entidades.Proxy;

import java.util.HashSet;
import java.util.Set;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
//esta entidad debe verificar los permisos de usuario antes de delegar la operacion
public class ArchivoProxy implements Archivo{
    private String nombreArchivo;
    //usuario que desea acceder

    //controlo el acceso según los nombres almacenados en la lista de autorizados
    private Set<String> usuariosAutorizados;
    private ArchivoReal archivoReal;

    public ArchivoProxy(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.usuariosAutorizados =  new HashSet<>();
    }

    // Método para agregar un usuario autorizado
    public void agregarUsuarioAutorizado(String nuevoUsuario) {
        usuariosAutorizados.add(nuevoUsuario);
        System.out.println("Usuario " + nuevoUsuario + " agregado a los autorizados para " + nombreArchivo);
    }

    // Método para eliminar un usuario autorizado
    public void removerUsuarioAutorizado(String usuario) {
        usuariosAutorizados.remove(usuario);
        System.out.println("Usuario " + usuario + " eliminado de los autorizados para " + nombreArchivo);
    }

    public boolean tienePermiso(String usuario){
        return usuariosAutorizados.contains(usuario);
    }

    @Override
    public void abrir(String usuario) {
        if (tienePermiso(usuario)){
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo); // Lazy initialization
            }
            archivoReal.abrir(usuario);
        } else{
            System.out.println("Acceso denegado para el usuario " +
                    usuario + " al archivo " + nombreArchivo);
        }
    }

    @Override
    public void leer(String usuario) {
        if (tienePermiso(usuario)){
            archivoReal.leer(usuario);
        } else{
            System.out.println("Acceso denegado para el usuario " +
                    usuario + " al archivo " + nombreArchivo);
        }
    }
}
