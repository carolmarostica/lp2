public class Palindrome {
  public static void main(String[] args){
    int p=0;
    int q=p+4;
    String w[];
    w= new String[4];
    w[0]=args[0].substring(p,p);
    w[1]=args[0].substring(p+1,p+1);
    w[2]=args[0].substring(p+2,p+2);
    w[3]=args[0].substring(p+3,p+3);
    w[4]=args[0].substring(q,q);
    for (int i=0; i<5; i++){
      for (int j=4; j>=0; j--){
        if((w[i]).equals(w[j])){
          System.out.println(i+"-"+j +"/");
          String.out.println( w[i] );
        }else{
          String.out.println('oi');
        
        }
      }
    }
  }
}
