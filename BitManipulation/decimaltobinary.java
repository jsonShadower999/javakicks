number:7
i conver tto binary so /2
7--->(111)
13-->{1101}


binary to decimal 

binary: 1101 --->1*2^3+1*2^2....=13
index:  3210

funcdecimaltobin(String decimal){
    res=""
    while(n!=1){
        if(n%2==1){
            res+="1"
        }
        else{
            res+="0"
        }
        n=n/2------------------->Tc=log n
    }
    return reversestr(res)
}

funcdintodecimal(String binary){
    present_power=binary.length()-1
    res=0;
    for(int i=binary.length()-1;i=>0;i--){
        res=res+binary.charAt(i)*2^present_power
        present_power--




    }
    return res
}

int 32bit =====>(00000000....1101) 32_places
long 64 bit 

===================================================================================

1's complement 

>>> bin format 
>>flip all bits is result 


2's complement .

>>> 1's complement 
>>> add 1 to  its 1's complement 

===================================================================================
OPERATORS IN BITMANIPULATION 
AND , OR , NOT ,SHIFT ,xor 
shift -->right shift 

1101                       13>>2
110(right shifted)          3

n>> k = n/2^K



how computer store the negative number ???
>>> one's complement 
>>>2'scomplement 


000000....1101
00000....11010


NOT operator 

>> 1's complemtn 
>> flip all bits 

>> for negative number find two complement of a number ie 
original +1 'complemtn+1 =ans 
>> now flip the all bits 






