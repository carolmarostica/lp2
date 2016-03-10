public class Palindrome {
  public static void main(String[] args){
    int p;
    int q;
    p=0;
    q=p+4;
    String[] w = new String[q+1];
    for(int s=0; s<=q; s++){
      w[s]=args[0].length(s);
    }
    for (int i=p; i<5; i++){
      for (int j=q; j>=0; j--){
        if((w[i]).equals(w[j])){
          System.out.println(i+"-"+j +"/");
        }else{
        
        }
      }
    }
    //w=args[0].substring(p,q);
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
