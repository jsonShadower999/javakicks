// Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
// Output: {1,  3}
// Explanation: 1 and 3

// Hashset(a)
// HashSET(b)
// //no dups
// a.sort() b.sort()
// 1,2,3   ; 1,3,4
// res=[]
// start1=0,start2=0
// for(i=0 to n):
//    if(a.start1==b.start2):
//       res.append(a.start1);
//       start1++
//       start2++
//       break;
//     else(a.start1<b.start2): 
//       start1++;
//     else:
//       start2++   
      
//   // Step 1: Remove duplicates using sets
// setA = HashSet(a)  // {1, 2, 3}
// setB = HashSet(b)  // {1, 3, 4}

// // Step 2: Convert sets to sorted lists
// listA = sorted(setA)  // [1, 2, 3]
// listB = sorted(setB)  // [1, 3, 4]

// // Step 3: Use two pointers to find common elements
// res = []
// i = 0
// j = 0

// while i < len(listA) and j < len(listB):
//     if listA[i] == listB[j]:
//         res.append(listA[i])
//         i += 1
//         j += 1
//     elif listA[i] < listB[j]:
//         i += 1
//     else:
//         j += 1

// // Output: res = [1, 3]
public static void commoneleinarr(int arr[],int brr[]){
    Set<Integer> seta=new HashSet<>();
    Set<Integer> setb=new HashSet<>();
    for(int num:arr){
        seta.add(num);
    }
    for(int num:brr){
      
        setb.add(num);
    }
    List<Integer> la=new ArrayList<>(seta);
    List<Integer> lb=new ArrayList<>(setb);
    List<Integer> res=new ArrayList<>();
    Collections.sort(lista);
    Collections.sort(listb);
    int start1=0,start2=0;
    while(start1<la.size() && start2<lb.size()){
        if(la[start1]==lb[start2]){
            res.add(la[start1]);
            start1++;
            start2++;
        }
        else if(la[start1]<lb[start2]){
            start1++;
        }
        else{
            start2++;
        }

    }
    System.out.println(res);
    
}
