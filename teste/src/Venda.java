import java.sql.Date;
import java.time.format.DateTimeFormatter;


public class Venda {

    private Date data;
    private Produto produto;
    private int numeroVenda;
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getNumeroVenda() {
        return numeroVenda;
    }
    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public void imprimirvenda() {
        System.out.println("Dados da venda");
         System.out.println("Numero da venda: " + getNumeroVenda());  

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String dataFormatada = ((java.sql.Date) getData()).toLocalDate().format(formatter);
         System.out.println("Data da venda: " + dataFormatada);

         System.out.println("Dados do Produto vendido:");
            System.out.println("Nome do produto: " + getProduto().getNome());
            System.out.println("Marca do produto: " + getProduto().getMarca());
            System.out.println("Preco do produto: " + getProduto().getPreco());
            System.out.println("Quantidade do produto: " + getProduto().getQtde());
            System.out.println("------------------------------");
    }
    

    
}