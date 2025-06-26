public class Arrays{
    
    public static void main(String[] args){
        System.out.println("oiiii");

        String[] flores = {"margarida","rosa", "girassol", "tulipa"};

        System.out.println(flores.length);

        String[] novoFlores = new String[flores.length + 1];

        for(int i = 0; i < flores.length; i++){
            novoFlores[i] = flores[i];        
            }

        novoFlores[flores.length] = "bromelia";

        for(String flor : novoFlores){
         System.out.println(flor);

        }
    }
}