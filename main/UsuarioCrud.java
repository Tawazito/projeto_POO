/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

/**
 *
 * @author Tawaf
 */
public class UsuarioCrud {

    DatabaseConnection databaseConnection = new DatabaseConnection();
    Connection conexao = databaseConnection.conectaDB("banco de dados: livraria Java");

    public void novoUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario(id, nome,sobrenome, bairro,cidade, telefone) VALUES(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setInt(2, usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getSobrenome());
            ps.setInt(4, usuario.getTelefone());

            ps.execute();
            System.out.println("Usuário salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluirUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id=?;";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Usuário: " + id + " excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void atualizarUsuario(String nome, String sobrenome, String bairro, int telefone) {
        atualizarUsuario(nome, sobrenome, bairro, telefone);
    }

    public void atualizarUsuario(String nome, String sobrenome, String bairro, String telefone) {
        String sql = "UPDATE usuario SET nome=?, sobrenome=?, bairro=?, telefone;";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, sobrenome);
            ps.setString(3, bairro);
            ps.setString(4, telefone);
            ps.execute();
            System.out.println("Usuário: " + nome + " atulizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //metodo par alistar usuários
    public Usuario listarUsuarios(Usuario Usuario) {
        String sql = "SELECT * FROM usuario;";
        List<Usuario> dados = new ArrayList<>();
        Usuario usuario = null;
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setBairro(rs.getString("birro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setTelefone(rs.getInt("telefone"));
                dados.add(usuario);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return (Usuario) dados;

    }

    //metodos para cadastrar livros, deletar, listar
    public Livro listarLivros(Livro livro) {
        String sql = "SELECT * FROM livro;";
        List<Livro> dados = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                livro = new Livro(0, sql, sql, sql, sql);
                livro.setId(rs.getInt("id"));
                livro.setNome_livro(rs.getString("nome_livro"));
                livro.setData_lancamento(rs.getString("data_lancamento"));
                livro.setGenero(rs.getString("genero"));
                livro.setNome_autor(rs.getString("nome_autor"));

                dados.add(livro);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return (Livro) dados;

    }

    public void atualizarLivro(String nome_livro, String nome_autor, String data_lancamento, String genero) {
        String sql = "UPDATE livro SET nome_livro=?, nome_autor=?, data_lancamento=?, genero=?;";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setString(1, nome_autor);
            ps.setString(2, nome_livro);
            ps.setString(3, data_lancamento);
            ps.setString(4, genero);
            ps.execute();
            System.out.println("Livro: " + nome_livro + " atulizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluirLivro(int id) {
        String sql = "DELETE FROM livro WHERE id=?;";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Livro: " + id + " excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void novoLivro(Livro livro) {
        String sql = "INSERT INTO usuario(id, nome_livro,nome_autor, data_lancamento,genero) VALUES(?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql);
            ps.setInt(2, livro.getId());
            ps.setString(2, livro.getNome_livro());
            ps.setString(3, livro.getNome_autor());
            ps.setString(4, livro.getData_lancamento());
            ps.setString(4, livro.getGenero());

            ps.execute();
            System.out.println("Usuário salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    ///////////////////////////////////////////////////////
    public class CadastroUsuario {

        private Connection conectar() {
            String url = "jdbc:sqlite:Users\\Tawaf\\OneDrive\\Documentos\\NetBeansProjects\\Livraria_java\\src\\biblioteca\\login.db";
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url);
                System.out.println("Conectado ao banco de dados: livraria Java");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }

        public void criarTabelaUsuario() {
            
            String sql = "CREATE TABLE IF NOT EXISTS usuario(id integer primary key , nome string , sobrenome string unique, bairro string, cidade string, telefone integer);";
            try (Connection conn = this.conectar(); Statement stmt = conn.createStatement()) {
                stmt.execute(sql);
                System.out.println("Tabela 'usuario' criada ou já existe.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public void cadastrarUsuario(String nome, String email) {
            String sql = "INSERT INTO usuario(nome, email) VALUES(?, ?)";
            try (Connection conn = this.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nome);
                pstmt.setString(2, email);
                pstmt.executeUpdate();
                System.out.println("Usuário cadastrado com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao salvar dados do cliente: " + e.getMessage());
            }
        }

        
    }

}
