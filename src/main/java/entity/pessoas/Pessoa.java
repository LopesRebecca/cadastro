package entity.pessoas;

public abstract class Pessoa {

        private String id;
        private String nome;
        private String senha;
        private EnderecoPessoa endereco = new EnderecoPessoa();

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public EnderecoPessoa getEndereco() {

            return this.endereco;
        }

        public void setEndereco(String cidade, String cep, String numero) {
            this.endereco = new EnderecoPessoa(cidade,cep,numero);
        }

        public String getSenha() {
            return this.senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
}
