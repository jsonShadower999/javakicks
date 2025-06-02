import java.util.*;
import java.util.Optional;
List arrlist= Arrays.asList("hello","ready","for","minfinder");
String str=arrlist.stream().min((a,b)->a.length()-b.length()).orElseThrow();


Optional<String> str=arrlist.stream().min((a,b)->a.length()-b.length());

