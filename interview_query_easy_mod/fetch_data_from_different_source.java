// Problem statement :
// The program simulates fetching data asynchronously from two different sources (e.g., Wi-Fi networks), 
// without blocking the main thread.


static String fetchdata_sourcetype_confirm(String datasource){
    try{
        Thread.sleep(2000);
        //sleep for 2 sec n then see source kya h
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return "data source is "+datasource;
}


//now ab fetch kro data  koi do different stream point se 

//to fetch data like bg task , CompletableFuture.supplyAsync()


CompletableFuture<String> data1=CompletableFuture.supplyAsync(()->fetchData("wifif 1 data srtrewam "));
CompletableFuture<String> data2= CompletableFuture.supplyAsync((->fetchData("wifi source 2")));
// ad from both source data is coming in now wait until both task complete 
CompletableFuture<void> runAtOneTime= CompletableFuture.allOf(data1,data2);
// after completeion join both stream 
runAtOneTime.thenRun(()->{
    String datadev1=data1.join();
    String datadev2=data2.join();
    
})