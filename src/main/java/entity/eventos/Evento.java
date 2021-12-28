package entity.eventos;

import entity.pessoas.EnderecoPessoa;

public class Evento {

    private String nome;
    private String data;
    private String horario;
    private String codigo;
    private EnderecoEvento endereco = new EnderecoEvento();

    public Evento(){}

    public Evento(String nome, String data, String horario, EnderecoEvento endereco) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.endereco = endereco;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public EnderecoEvento getEndereco() {

        return this.endereco;
    }

    public void setEndereco(String cidade, String cep, String numero) {
        this.endereco = new EnderecoEvento(cidade,cep,numero);
    }
}
