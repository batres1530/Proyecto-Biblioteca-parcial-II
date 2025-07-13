
package controler;
import java.util.List;
import java.util.ArrayList;
import bd.ConectionDB;              
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;         
import java.sql.SQLException; 
import model.Prestamo;

public class PrestamoDAO {
    public List<Object> getAll() {
        List<Object> listado = new ArrayList<>();
        String query = "select * from prestamos;";
        try (Connection con = ConectionDB.getConnection()){
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            
          while (resultado.next()) {
          listado.add(new Prestamo(
          resultado.getInt("Prestamo_ID"),
          resultado.getInt("Usuario_ID"),
          resultado.getInt("Libro_ID"),
          resultado.getInt("Empleado_ID"),
          resultado.getDate("Fecha_Prestamo"),
          resultado.getDate("Fecha_Limite")
            ));
                
 
}
        }catch (SQLException ex) {

            System.err.println("Error al listar usuarios: " + ex.getMessage());
        }

        return listado;     
   }
    
    }
    

