package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Balancedparanthesis{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char arr[] = new char[100];
        int j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                arr[j++]=str.charAt(i);
               // System.out.println(Arrays.toString(arr));
            }
            else{
                if(i>0&&(arr[j-1]=='['&&str.charAt(i)==']')){
                    j--;
                   // System.out.println(Arrays.toString(arr));
                }
                else if(i>0&&(arr[j-1]=='{'&&str.charAt(i)=='}')){
                    j--;
                    //System.out.println(Arrays.toString(arr));
                }
                else if(i>0&&(arr[j-1]=='('&&str.charAt(i)==')')){
                    j--;
                   // System.out.println(Arrays.toString(arr));
                }
                else if(i==0){
                    j--;
                    break;
                }
                else{
                    
                    break;
                }
            }
        }
        if(j==0){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }

    }
}