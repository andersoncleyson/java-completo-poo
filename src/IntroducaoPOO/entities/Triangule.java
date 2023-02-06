package IntroducaoPOO.entities; //Pacote da classe

public class Triangule { // Nome da classe

    // O prefixo "public" indica que o atributo ou método
    // pode ser usado em outros arquivos
    public double a; //atributos
    public double b; //atributos
    public double c; //atributos

    // Tipo do dado que o método retorna (se o método não retorna nada, usa-se a palavra "void")
    public double area(){ // Nome do método
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
