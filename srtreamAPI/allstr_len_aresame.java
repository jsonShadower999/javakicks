//find length of all string in list 
//distinct(allarray)=1 value 
//if it is only one value ans 
List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
boolean res=strings.stream().map(String::length).distinct().count()==1;
if(res==1){
    Sopln("well said!!!");
}  
else{
    Sopln("recur again!!!")
}   

// OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
// OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
// int difference = max.getAsInt() - min.getAsInt();
//s.replace("\\s+") // replace wihte space
//s.matches("\\d+") // cehck for digit in string