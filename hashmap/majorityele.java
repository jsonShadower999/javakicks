public static int majorityele(int[] arr){
    int n=arr.length;
    Map<Integer,Integer> cntMp=new HashMap<>();
    for(int n:arr){
        cntmp.put(n,cntmp.getOrDefault(n,0)+1);
        if(cntmp.get(n)>n/2){
            return n;
        }
        return -1;

}
