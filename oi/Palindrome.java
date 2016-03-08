
public class Palindrome {
  public static void main(String[] args){
    int x=indexOf(0);
    int y=lastIndexOf(4);
    String w=args[0].substring(x,y);
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
