l.forEach((ele)->{System.out.println(ele);});



@FuntionalInterface
interface func_specialfunc{
    void sleep();
}

func_specialfunc f= ()->System.out.print("hello");
f.sleep();

//function : takes input and return output 

Fuction<String , Integer> func_q= a->a.length();
func_q.apply("hello joe");

//
Predicate<Integer> lessthan=i->(i<18);
lessthan.test(10);

Predicate<Integer> greaterthan=i->(i>18);
greaterthan.test(13);
boolean res=lessthan.and(greaterthan).test(12);


// consumer takes input no output 
Consumer<String> msg_consumer=msg->System.out.println("message"+msg);
msg_consumer.accept("hello joe i am consumer");



@FuntionalInterface
interface Calculator {
    int add_calc(int a, int b);
}
public class func_tester{
    public static void main(String[] args){
        Calculator res1=(a,b)->a+b;
        Calculator res2=(a,b)->a*b;
        Calculator res3=(a,b)->a/b;
        Calculator res4=(a,b)->a-b;
        res1.operate(3,4);

    }
}