// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//swap adjacent to form wave ...
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int odd_pointer=0;
        int even_pointer=1;
        
        while(even_pointer<arr.length){
            int temp=arr[odd_pointer];
            arr[odd_pointer]=arr[even_pointer];
            arr[even_pointer]=temp;
            odd_pointer=odd_pointer+2;
            even_pointer=even_pointer+2;
        }
        for(int num:arr){
            
            System.out.print(num);
        }
       
       
    }
}