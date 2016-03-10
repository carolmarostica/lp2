
public class Palindrome {
  public static void main(String[] args){
    for (int i=0; i<5; i++){
      for (int j=5; j>0; j--){
        if(args[0].lenght(i).equals(args[0].lenght(j))){
          System.out.println("ok");
        }
      }
    }
    
    
    String w=args[0].substring(0,5);
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
