public class Proprietario
{
    private int cpf, rg, cep, numCasa;
    private String nome, rua, estado, cidade;

    public Proprietario(String nome, String rua, String estado, String cidade, int cpf, int rg, int cep, int numCasa)
    {
        this.nome = nome;
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.numCasa = numCasa;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
    public void setRg(int rg)
    {
        this.rg = rg;
    }
    public void setCep(int cep)
    {
        this.cep = cep;
    }
    public void setNumCasa(int numCasa)
    {
        this.numCasa = numCasa;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    public String getRua()
    {
        return this.rua;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public int getCpf()
    {
        return this.cpf;
    }
    public int getRg()
    {
        return this.rg;
    }
    public int getCep()
    {
        return this.cep;
    }
    public int getNumCasa()
    {
        return this.numCasa;
    }
}
