import java.util.*;

public class BreakStetmentinLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your no:");
            int a = sc.nextInt();
            if(a %10 ==0){
                break;
            }
                System.out.println(a);
                
            }  while (true);
             
                
            
        
    }
}
