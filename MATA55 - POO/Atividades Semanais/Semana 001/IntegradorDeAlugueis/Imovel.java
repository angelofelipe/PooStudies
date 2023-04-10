
/**
 * Escreva uma descrição da classe Imovel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Imovel
{
    // variáveis de instância
    private int iptu, cep, numero;
    private String estado, cidade, rua, tipo, utilizacao;

    /**
     * Construtor para objetos da classe Imovel
     */
    public Imovel(int iptu, int cep, int numero, String estado, String cidade, String rua, String tipo, String utilizacao)
    {
        // inicializa variáveis de instância
        this.iptu       = iptu;
        this.cep        = cep;
        this.numero     = numero;
        this.estado     = estado;
        this.cidade     = cidade;
        this.rua        = rua;
        this.tipo       = tipo;
        this.utilizacao = utilizacao;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void setIptu(int iptu)
    {
        this.iptu = iptu;
    }
    public void setCep(int cep)
    {
        this.cep = cep;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setUtilizacao(String utilizacao)
    {
        this.utilizacao = utilizacao;
    }
    
    public int getIptu()
    {
        return this.iptu;
    }
    public int getCep()
    {
        return this.cep;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public String getRua()
    {
        return this.rua;
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public String getUtilizacao()
    {
        return this.utilizacao;
    }
}
