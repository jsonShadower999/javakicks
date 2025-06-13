GET /products?category=books
@RequestParam  


@GetMapping("/product/{id}")
public Product getProductById(@PathVariable Long id){
    return productService.getProductById(id);
}



@PostMapping("/create-product")
public Product createProduct(@RequestBody Product product) {
    return productService.createProduct(product);
}



@Controller
public class ProductController {

    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "productDetails"; // View name (e.g., productDetails.jsp or productDetails.html)
    }
}


// @RequestParam: Extracts query parameters.

// @PathVariable: Extracts values from the URL path.

// @ModelAttribute: Binds form data to a model.

// @RequestBody: Binds request body data to a model.

// @ResponseBody: Indicates that the return value should be written directly to the response body.

// @RequestMapping: General-purpose mapping for all HTTP methods.

// @RestController: Combines @Controller and @ResponseBody for REST APIs.

// @Controller: For traditional MVC applications that return views.

// @ExceptionHandler: Global exception handling.

// @CrossOrigin: CORS configuration.

// @Valid: Validates request data.