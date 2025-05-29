public static void freqofeachcharinstr(String str){
    Char chs= str.toCharArray(); //array
    HashMap<String,Integer> hmap= new HashMap<>();
    for(int i=0;i<chs.length;i++){
        if(hmap.containsKey(chs[i])){
            hmap.put(chs[i],hmap.get(chs[i])+1);
        }
        else{
            hmap.put(chs[i],0);
        }
    }
    hmap.entrySet().stream().forEach(System.out::println);

}