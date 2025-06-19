// make a user---> for nthis user thread i have to genrerate tyeb otp 


public class Main {
    public static void main(String[] args){
        String[] users={"albert","sam","madrin"};
        for(String u:users){
            //crewate a thread for each user 
            Otpthread t= new Otpthread(u);
            // now make this process to cpu
            t.start();


        }
    }
}




class Otpthread extends Thread{
    private String user;
    public Otpthread(String user){
        this.userName=user;
    }
    public void run(){
        //thread ko jo perform krna h write here 
        // i need otp 
        String otp=generateOtp(5);
        System.out.print(otp);
    }
    private String generateOtp(int length){
        Random r=new Random();
        StringNuiolder otp=new StringBuilder();
        for(int i=0;i<length;i++){
            otp.append(r.nextInt(10));
        }
        return otp.toString();

    }
}