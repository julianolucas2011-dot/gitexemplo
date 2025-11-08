/*pacote*/
package appcarros;

/*classe carros*/
public class Carros {

    /*atributos*/
    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    /*método construtor*/
    public Carros(String modelo, String marca, int ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
    /* Neste momento, será criado um método GET e SET para cada um dos atributos da classe Carro */
	
    /* Aqui, o primeiro método GET (getModelo) criado para o atributo modelo, do tipo String e tem uma única função, que é retornar o valor do atributo modelo*/
    public String getModelo(){
        return modelo;
    }
    
    /* Aqui, o primeiro método SET (setModelo) criado para o atributo modelo, que recebe uma String como parâmetro e inicializa ou atualiza o valor do
    atributo modelo e a linha this.modelo faz referência à própria classe, igual ao método modificador */
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    
    /*método descrever*/
    
    public void descrever() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    } 

}
