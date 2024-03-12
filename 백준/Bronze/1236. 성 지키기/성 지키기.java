import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String [] arr = new String[N];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = br.readLine();
        }

        int result1 = 0 ;

        for(int i = 0; i<arr.length; i++){
            boolean check = true;
            for(int j = 0 ; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'X'){
                    check = false;
                    break;
                }
            }
            if(check){
                result1++;
            }
        }

        int result2 = 0 ;

        for(int i = 0 ; i<M; i++){
            boolean check = true;
            for(int j = 0 ; j<N; j++){
                if(arr[j].charAt(i) == 'X'){
                    check = false;
                    break;
                }
            }
            if(check){
                result2++;
            }
        }

        int ans = result1>result2 ? result1 : result2;

        System.out.println(ans);
    }
}