package kr.jungang.dive.product.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.jungang.dive.framework.paging.PageDTO;
import kr.jungang.dive.product.domain.ProductCriteria;
import kr.jungang.dive.product.domain.ProductVO;
import kr.jungang.dive.product.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@AllArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
	
	private ProductService productService;

	
	@GetMapping("/list")
	public void getProductList(ProductCriteria productCriteria, Model model) {
		List<ProductVO> list = productService.getWithPagingProduct(productCriteria);
		model.addAttribute("listProduct", list);
		model.addAttribute("pageMaker", new PageDTO(productService.getTotCount(productCriteria), productCriteria));
	}
	
	@GetMapping("/register")
	@PreAuthorize("isAuthenticated()") //인증된 상태일 때 연결해 줄 것이다.
	public void regiProduct() {
		
	}
	
}
