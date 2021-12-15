public class ITSC1212Lab9 {
  
    public static void main(String[] args) {

      char symbol1='%';
      char symbol2='#';
      char symboldraw;

      for(int i = 0; i < 4 ;i++){
        for(int j = 0 ; j < 4 ;j++)  
        {
          if((i + j) % 2 == 0)
            symboldraw=symbol1; 
          else
             symboldraw=symbol2; 
          for(int k=1; k<=4;k++) {
              System.out.print(symboldraw);
          }
             System.out.print(" ");
            
        }
        System.out.println();
      }
  }
}
 

