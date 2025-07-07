// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Input:
// N = 9
// v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
// X = 5
// Output:
// 2 5

class Main {
    public static void main(String[] args) {
        int start=0;
        int end=0;
        int ele=5;
        int v[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
        for(int i=0;i<v.length;i++){
            if(v[i]==ele){
                start=i;
                end=i;
                while(v[i+1]-v[i]==0){
                    end++;
                    i++;
                }
                
            }
        }
        System.out.println(start);
        System.out.println(end);
      
        
        
    }
}
//two pointer 
// binary search 

