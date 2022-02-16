import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;





public class Main {
    
    static String[] data = null;

    static boolean[] decisionSpace = null;
    static int[] lottoNum = null;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        

        while(true){
            data = bf.readLine().split(" ");

            if(data[0].equals("0")){
                break;
            }
            lottoNum = new int[Integer.parseInt(data[0])+1];
            decisionSpace = new boolean[Integer.parseInt(data[0])+1];

            backtracking(0);

        }

    }

    public static void backtracking(int index){
        if(index==6){
            for(int i=0;i<6;i++){
                if(decisionSpace[i]){
                 System.out.print(lottoNum[i] +" ");
                }
            }
            System.out.println();
            return;
        }
   
        for(int i=1;i<data.length;i++){
                      
                decisionSpace[i] = true;
                lottoNum[index]= Integer.parseInt(data[i]);
                backtracking(index+1);
                decisionSpace[i] = false;
            
        }
    }

}


