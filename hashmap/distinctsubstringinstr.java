// Input : abcd
// Output : abcd abc ab a bcd bc b cd c d
// All Elements are Distinct

// Input : aaa
// Output : aaa aa a aa a a
// All elements are not Distinct

// a
// ab
// abc
// abcd
// b 
// bc 
// d 
// c 
// cd 
// d 
//ress=hset
// for(i=0 to n):
//  for(j=i+1,j<n):
//     res.add(arr[i:j])
  //   res.add(str.substring(i,j))
   

publicstatic int distinctsubstring(String str){
    HashSet<String> hs= new HashSet<>();
   
    for(int i=0 ; i<=str.length();i++){
        for(int j=i+1;j<str.length();j++){
            hs.add(str.substring(i,j))
          

        }
    }
    return hs.size();

}

