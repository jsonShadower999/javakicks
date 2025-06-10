#swap the two numbers !!!
>> without the third variable 

xor of even no of 1 is ->0
       odd no of 1 is ->1 

becoz a^a=0 always !!!
a=a^b
b=a^b ---->a^b^b=a
a=a^b ---->a^b^a=b 






#check if ith bit is set or not 

N=13
i=2 

>>number given is 13 
>> convert to binary 
>>reverse the binary to get correct binary_ans 
>> look for ith pos ==1 then true 


convert a number to binary ::::
7 --->111
13--->1101 , ans=false 


1
10
100   1<<2 (left shift)

1101
 100 & 

00100 

((N&(1<<i))!=0)

if(N>>i)&1==0 :then unset else set 

===============================================

set ith bit 

>> find binary represent , go to  ith bit set if needed n change to decimal 

N_binary_form OR (N in binary form <<i)=ans 


======================================================

clear the ith bit 

N=13 
i=2
1101 
1001-->9

n AND not(n<<i)


=======================================================
toggle ith bit 

1101  i=2
1111==15 


1101 
0100
(xor)
1001 



================================================

number is even or not 
do not use % 
least significant digit is 1 or not *****

least significant digit=number & 1
===============================================

number is a power of 2 

number=000100000000 
x-1=0000111111111
AND 
res=000000000000000


ans=number AND (NUMBER-1) is ans==1 it is power of 2   ******


====================================================================

number=100100111000 
k th bit from right 


======================================
rules::::

check if kth bit is set  number AND (1<<number)
toggle k th bit    number ^(1<<number)
set the kth bit number || (1<<number)
unset the kth bit  number & not(1<<number) 


====================================================

multiply or divide the number 2 ^k 

10/2 =5 
1010
right shift by 1
101

divide res= number >> 1  is equi to  number /2
       res=number >> k   is equi to   number /2^k 



multiply number left shift  k 


=======================================================

10%4=2 
modulo with 2^k ====  number & ((1<<number)-1)

2^k=10000000
2^k-1=01111111
AND 
res=remender 
===============================================================
A= has n bits
B= has m bits 
A xor B = n+m -2*no_of_bits_that are same 

===================================
checker_point =val1^val2^checker_point

if(checker_point==val1){
    checker_point=val2
}
else{
    checker_point=val1
}


========================================

given a set s={a,b,c} create all posible subset 

2*2*2=total_possibility 2^3=2^s.length=2^n 


decision1== i include the current ele ==1
decision2=i do not include the curr val ===0

range of masking 0 to 2^n-1 
range of masking 0 to 1<<N


if(mask & (1<<j)) include the jth element or skip the jth element to get all subset 


all_subsets=[]
for(maks=o,mask<=(1<<n);masks++){------------------------->2^n-1
    currset={}
    for(j=0;j<n;j++){
        if(mask &(1<<j)==1){
            currset.insert(arr[j])
        }
    }
    all_subsets.append(currset)
}




