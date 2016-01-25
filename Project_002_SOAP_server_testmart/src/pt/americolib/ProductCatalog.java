package pt.americolib;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pt.americolib.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	//ATTRIBUTES
	ProductServiceImpl productService = new ProductServiceImpl();
	
	//METHOD (public = default @WebMethod)
	@WebMethod
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

}
