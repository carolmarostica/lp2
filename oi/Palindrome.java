
public class Palindrome {
  public static void main(String[] args){
    int p;
    int q;
    q=0;
    p=0;
    
    for (int i=p; i<5; i++){
      for (int j=q; j>0; j--){
        if((args[0].length(i)).equals(args[0].length(j))){
          System.out.println("ok");
        }else{
          this.p=p++;
          this.q=q++;
        }
      }
    }
    
    
    String w=args[0].substring(0,5);
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
