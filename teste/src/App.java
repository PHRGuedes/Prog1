import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();

        produto.setNome("Coca-Cola");
        produto.setMarca("Pepsi");
        produto.setPreco(7.50);
        produto.setQtde(10);


         Produto produto1 = new Produto();

        produto1.setNome("Heineken");
        produto1.setMarca("Champions");
        produto1.setPreco(8.50);
        produto1.setQtde(5);



        Venda venda = new Venda ();

        venda.setNumeroVenda(1);
        venda.setProduto(produto1);  
        venda.setData(java.sql.Date.valueOf(LocalDate.now()));      
        venda.imprimirvenda(); 

        
        
        
        
        
       
       


    }

    private static String Venda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Venda'");
    }

}
