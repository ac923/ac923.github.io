import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
      int total=Integer.parseInt(12);
      int result=findminValue(total);
      System.out.println(result);
  }
  
  public static int findminValue(int total){
    if(total==0) return 0;
    if(total>=5) {
      return 1+findminValue(total-5);
    }else if (total>=3) {
      return 1+findminValue(total-3);
    }else{
      return 1+findminValue(total-1);
    }
  }
}
