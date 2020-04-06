package testdbconnectionpool;

import java.sql.Connection;
import java.sql.SQLException;
import model.ConnectionPool;

/**
 *
 * @author JorgeLPR
 */
public class TestDBConnectionPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {

            Connection c =  ConnectionPool.getInstance().getConnection();
            if(c!=null){
                System.out.println("conectado ");
                ConnectionPool.getInstance().closeConnection(c);
            }else{
                System.out.println("No conectado");                
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        /*
        for (int i = 0; i < 2000; i++) {
        try {
        Connection c =  ConnectionPool.getInstance().getConnection();
        if(c!=null){
        System.out.println("conectado "+i);
        ConnectionPool.getInstance().closeConnection(c);
        }else{
        System.out.println("No conectado "+i);
        }
        } catch (IOException ex) {
        Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        }*/ 
        
        
        
        /*
        for (int i = 0; i < 2000; i++) {
            try {

    
                Connection c =  ConnectionPool.getInstance().getConnection();
                if(c!=null){
                    System.out.println("conectado "+i);
                    ConnectionPool.getInstance().closeConnection(c);
                }else{
                    System.out.println("No conectado "+i);                
                }
                
            } catch (IOException ex) {
                Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TestDBConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
    
}
