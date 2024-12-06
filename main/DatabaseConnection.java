/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Tawaf
 */
public class DatabaseConnection {
    
    public Connection conectaDB() {
        Connection conexao = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection("jdbc:sqlite:Users\\Tawaf\\OneDrive\\Documentos\\NetBeansProjects\\Livraria_java\\src\\biblioteca\\login.db");
            System.out.println("Conectado ao banco SQLite");
            return conexao;
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco SQLite " + e);
            return null;
        }
    }

    private Connection conexao = null;
    private final String tabela = "CREATE TABLE IF NOT EXISTS usuario(id integer primary key , nome string , sobrenome string unique, bairro string, cidade string, telefone integer);";
 
 public Connection conectaDB(String banco) {
        try {
            //registra o novo driver de conexão ao banco de dados
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection("jdbc:sqlite:" + banco + ".db");
            Statement st = conexao.createStatement();
            st.execute(tabela);
            System.out.println("Conectado ao banco de dados " + banco);
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e);
            System.exit(0);

        }
        return conexao;

    }

    public void fechaConexao(Connection db) {
        try {
            if (db != null) {
                db.close();
                System.out.println("Banco de dados desconectado!");

            }
        } catch (Exception e) {
            System.out.println("Erro ao fechar o banco de dados: " + e);
            System.exit(0);
        }

    }
    
}
