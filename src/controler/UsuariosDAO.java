
package controler;
import java.util.List;
import java.util.ArrayList;
import bd.ConectionDB;              
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;         
import java.sql.SQLException; 
import model.Usuario;

public class UsuariosDAO {

    public List<Object> getAll() {
        List<Object> listado = new ArrayList<>();
        String query = "select *  from usuarios;";
        try (Connection con = ConectionDB.getConnection()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            
          while (resultado.next()) {
        listado.add(new Usuario(
        resultado.getInt("Usuario_ID"),    
        resultado.getString("Nombre"),    
        resultado.getString("Correo"),     
        resultado.getInt("TipoUsuario_ID") 
                
    ));  
 

}
            
        }catch (SQLException ex) {

            System.err.println("Error al listar usuarios: " + ex.getMessage());
        }

        return listado;     
   }
    
    }