    
    // it is a full no 
    //  the worst case or the longest sequence possible will be 
    //0: n/2=n/2+1:
    // so my possible set can be ={2,27,272,,2727}
    // now try each sequence , by calculate window size =len_original/current_seq_length
    // repeat the sequence by window size time 
    // n now agar this string is same as original to thats answer
    
class Main {
    public static void main(String[] args) {
        
        int number=27272727;
        String str_no="27272727";
        int len_str=str_no.length();
        for(int i=1;i<=len_str/2;i++){
            // my current sequence 
            String current_seq=str_no.substring(0,i);
            // now start its repeation
            int repeated_cnt=len_str/i;
            //now create my str 
            StringBuilder str_experiment=new StringBuilder();
            for(int j=0;j<repeated_cnt;j++){
                str_experiment.append(current_seq);
                
                
            }
            //check ki experimwnt wala string is same as original 
            if(str_experiment.toString().equals(str_no)){
                System.out.println(current_seq);
            }
        }
    
    
    
        

       
    }
    
}