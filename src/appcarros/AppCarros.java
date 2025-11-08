package appcarros;

public class AppCarros {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Carros carro1 = new Carros("ka", "ford", 2005, "azul");
        Carros carro2 = new Carros("gol", "volkswagem", 2008, "vermelho");
        Carros macedoGuei = new Carros("Charrete","Cavalo",1648,"Amarelo");
        

        macedoGuei.descrever();

       
        
        
        /*System.out.println("Dados do carro 1: ");
        carro1.setModelo("fiesta");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());
        
        System.out.println("Dados do carro 2: ");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());
        
        /*objetos instanciados a partir da classe "carros" 
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();
        Carros carro3 = new Carros();
        Carros carro4 = new Carros();
        Carros carro5 = new Carros(); */

        /*preenchendo os atributos 
        carro1.marca = "fiat";
        carro1.modelo = "palio";
        carro1.cor = "branco";
        carro1.ano = 1997;
        carro1.valor = (float) 9.000; 

        carro2.marca = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.cor = "preto";
        carro2.ano = 2000;
        carro2.valor = (float) 14.000;

        carro3.marca = "Chevrolet";
        carro3.modelo = "Onix";
        carro3.cor = "vermelho";
        carro3.ano = 2020;
        carro3.valor = (float) 25.000;

        carro4.marca = "Hyundai ";
        carro4.modelo = "HB20";
        carro4.cor = "prata";
        carro4.ano = 2022;
        carro4.valor = (float) 40.000;

        carro5.marca = "Ford";
        carro5.modelo = "Focus";
        carro5.cor = "azul";
        carro5.ano = 2009;
        carro5.valor = (float) 21.000; */

        /* System.out.println("----------------- DESCRIÇÃO DOS VEÍCULOS -------------------");
        carro1.descrever();
        carro2.descrever();
        carro3.descrever();
        carro4.descrever();
        carro5.descrever(); */

    }

}
