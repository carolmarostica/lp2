public class Palindrome {
  public static void main(String[] args){
    int p;
    int q;
    p=0;
    q=p+4;
    String[] w=args[0].substring(p,q);
    for (int i=p; i<5; i++){
      for (int j=q; j>=0; j--){
        if((w[i]).equals(w[j])){
          System.out.println("ok");
        }else{
        
        }
      }
    }
    
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
