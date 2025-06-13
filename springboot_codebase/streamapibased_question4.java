---get product with category = phone and rating =5

@GetMapping("/getbycategorynrating")
public List<Product> getProductByCategoryAndRating(@requestparam String category, @requestparam int rating){
    List<Product> all_product=ProductService.getProducts();
    List<Product> selected_product=all_product.stream().filter(product->product.category.equals("phone")).filter(product->product.rating==5).collect(Collectors.toList());
    return selected_product;
}
//service=Product.findAll();
//repo use ---findAll();


---get All unique category from all product 

public Set<String> getAllCategory(){
    List<Product> allproducts=productService.getAllProduncts();
    return all_products.stream().map(a->a.category()).collect(Collectors.toSet());

}

---get most expensive product in each category ...
category:n productpublic 

public Map<String,Product> getmostexpensiveproduct(){
   //get product as per category
   List<Product> allproduct_list=productService.getAllProducts();
    listproduct=allproduct_list.stream().collect(Collectors
   .groupingBy(Product::getCategory),
   Collectors.maxBy((p1,p1)->Integer.Compare(p1.getPrice(),p2.getPrice())))
   .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,entry->entry.getValue()))


   //string , productlist

}

---get products purchased by users with username Agrima 

public List<Product> getProductlistBycname(@RequestParam String userName){
    List<User> allusers= userService.getAllUsers();
    User specificuser= allusers.stream().filter(user->user.username.equals(userName));
    List<Product> lst=productService.getAllProducts().stream().filter(p->p.uid==specificuser.uid).collect(Collectors.toList());
    return lst;
}



  // Filter users who have purchased products from the given category
    return allUsers.stream()
                   .filter(user -> user.getPurchasedProducts().stream()
                                       .anyMatch(product -> product.getCategory().equals(category)))
                   .collect(Collectors.toList());