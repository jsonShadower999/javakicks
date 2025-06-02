//
// List<String> strings = Arrays.asList("apple", "banana", "kiwi", "banana", "apple");
// list1= 0 to n/2 
// list2= n-1 to n/2
//allMatch 

List<String> strings = Arrays.asList("apple", "banana", "kiwi", "banana", "apple");
boolean ispalli= strings.stream().skip(strings.size()/2)
//[n/2+1,n-1] 
// i am standing at n/2 i want to go to start , so if i am at n/2th i need to take n/2 steps to reach each end 

.allMatch(ele->ele.equals(strings.size()-strings.indexOf(ele)-1)) 
if(ispalli==true){
    Sopln("its a palli list");
}    
else{
    Sopln("none!!!");
}

