package kr.jungang.dive.product.service;

import java.util.List;

import kr.jungang.dive.product.domain.ProductCriteria;
import kr.jungang.dive.product.domain.ProductVO;

public interface ProductService {
	public List<ProductVO> getAllProduct();
	
	public ProductVO findById(long id);
	
	public int getTotCount(ProductCriteria obj);
	
	public List<ProductVO> getWithPagingProduct(ProductCriteria obj);
	
	public int registerProduct(ProductVO obj);
	
	public int updateProduct(ProductVO obj);
	
	public int deleteProduct(long id);
}
