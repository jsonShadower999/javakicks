#exception handling
==> using throw 
==> create a userdefined exception extended with RuntimeException  class 
==>create a generic class for all exceptions in side exception package 

---get all product whose category is Books and seller=storytimes

@GetMapping
public Optional<List<Book>> getyProductByCategory(@RequestParam String category , @RequestParam String seller){
    List<Book> all_book=ProductService.getProductByCategory(category);
    //filter book by seller 
    List<Book> seller_based_books=all_book.stream().filter(b->b.getSeller().equals(seller)).collect(Collectors.toList());
    return Optional.ofNullable(seller_based_books.isEmpty()?null:seller_based_books);

   

}

--- modify the above api to show exception when in specific places 

@GetMapping
public Optional<List<Book>> getyProductByCategory(@RequestParam String category , @RequestParam String seller){
    List<Book> all_book=ProductService.getProductByCategory(category);
    if(all_book==null||all_book.isEmpty()){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no product")
    }

    //filter book by seller 
    List<Book> seller_based_books=all_book.stream().filter(b->b.getSeller().equals(seller)).collect(Collectors.toList());
    if(seller_based_books.isEmpty()){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no books")
    }
    return Optional.of(seller_based_books);

   

}
--------------------------------------------------------
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not found")
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
--------------------------------------------
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
@GetMapping
public Optional<List<Book>> getProductByCategory(@RequestParam String category, @RequestParam String seller) {
    // Fetch all books in the given category
    List<Book> allBooks = productService.getProductByCategory(category);
    
    if (allBooks == null || allBooks.isEmpty()) {
        throw new ResourceNotFoundException("No products found for the given category");
    }
    
    // Filter books by the seller
    List<Book> sellerBasedBooks = allBooks.stream()
                                          .filter(book -> book.getSeller().equals(seller))
                                          .collect(Collectors.toList());
    
    if (sellerBasedBooks.isEmpty()) {
        throw new ResourceNotFoundException("No books found for the specified seller");
    }
    
    // Return the filtered list wrapped in an Optional
    return Optional.of(sellerBasedBooks);
}

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
