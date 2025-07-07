public class Metodo1{
    
public static void meuMetodo(){
    System.out.println("boce chamou o metodo simples");
}

public static void mostrarNome(String nome){
    System.out.println("oiii"+nome);
}

public static void soma(double num1, double num2){
    double soma = num1 + num2;
    System.out.println("soma: "+soma);
}

//com retorno

public static double multiplicar(double num1, double num2){
    double multiplica = num1 * num2;
    return multiplica;
}

    public static void main(String[] args){

        System.out.println("chamada de metodo simples: ");
        meuMetodo();
        meuMetodo();
        meuMetodo();
        meuMetodo();

        mostrarNome("bia");

        soma(5,8);

        double retorno = multiplicar(2,3);
        System.out.println("retorno: "+retorno);

    }
}