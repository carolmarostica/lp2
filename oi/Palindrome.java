
public class Palindrome {
  public static void main(String[] args){
    String x=indexOf(args[0].lenght(0));
    String y=lastIndexOf(args[0].lenght(4));
    String w=args[0].substring(x,y);
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
