package Infosys;
import java.util.*;
class easy{
       
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t =scan.nextInt();
        while(t-- >0){
            int N= scan.nextInt();
            int k= scan.nextInt();
            String s = scan.next();
            int max=0;
            int res=0;
            s =s.toLowerCase();
            int lastvowel=-1;
            HashSet<Character> hs = new HashSet<>();
            for(int i=0;i<s.length();i++){
                char x =s.charAt(i);
                if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                    if(!hs.contains(x)){
                        if(hs.size()==k){
                          max=Math.max(res,max);
                           hs.clear();
                            hs.add(x);
                            res=(i-lastvowel);
                            lastvowel=i;
                        }
                        else{
                            lastvowel=i;
                            hs.add(x);
                            res++;
                        }
                        
                    }
                    else{
                       lastvowel=i;
                       res++;
                    }
                }
                else{
                    res++;
                }
            }
          
            if(hs.size()==k){
                max=Math.max(res,max);
            }
            if(max==0){
                max=-1;
            }
            System.out.println(max);

        }
      
         
        


        }

    }

