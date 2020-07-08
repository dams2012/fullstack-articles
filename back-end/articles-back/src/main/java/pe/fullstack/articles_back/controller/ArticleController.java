package pe.fullstack.articles_back.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.fullstack.articles_back.model.Articulo;
import pe.fullstack.articles_back.service.ArticleServiceImpl;

@RestController
@RequestMapping("/articulos")
public class ArticleController {

	private static final String BASE_URI = "/articulos";
	private ArticleServiceImpl articleService = new ArticleServiceImpl();
	
	@GetMapping("/obtenerListaArticulos")
	public ResponseEntity<List<Articulo>> obtenerListaArticulos(){
		return ResponseEntity.ok(articleService.obtenerListaArticulos());
	}
	
}
