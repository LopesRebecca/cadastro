package entity.eventos;

public class EnderecoEvento {
    private String cidade;
    private String cep;
    private String numero;

    public EnderecoEvento(){
    }

    public EnderecoEvento(String cidade, String cep, String numero) {
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
