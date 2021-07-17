package classes;


public class Pessoa{
    private String nome;
    private String cpf;
    private char sexo;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception {
        this.cpf = cpf; 
        {
        throw new Exception("O CPF deve ter 11 dígitos");
        }
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) throws Exception {
       if("MmFf".indexOf(sexo) > -1) {
        this.sexo = sexo;    
       } else {
           throw new Exception("Sexo só pode ser M ou F");
       }
       
    }
    public Pessoa(String nome, String cpf, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Pessoa(Object object, int i) {
    }
    public String cumprimentar() {
        return "Olá, Sr(a). Eu sou o(a) "  + nome;
    }

    public String cumprimentar(String nomeOutraPessoa) {
        return "Olá, " + nomeOutraPessoa + ".Meu nome é " + nome;
}

    } 