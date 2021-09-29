package com.projet.stock.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projet.stock.exception.ResourceNotFoundException;
import com.projet.stock.model.Article;
import com.projet.stock.model.Scategorie;
import com.projet.stock.repository.ArticleRepository;
import com.projet.stock.repository.ScategorieRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ArticleController {
	
	@Autowired 	ArticleRepository  repository;
	@Autowired 	ScategorieRepository  scatrepository;
	@Autowired  ServletContext context;
	 @GetMapping("/articles")
	 public List<Article> getAllarticles() {
	     System.out.println("Get all articles...");
	 
	    List<Article> articles = new ArrayList<>();
	    repository.findAll().forEach(articles::add);
	 
	    return articles;
	  }
	 


	 
	 
	 @PostMapping("/articles")
	  public Article createArticle(@Validated @RequestBody Article article) {
		 return repository.save(article);
	 }
	 @GetMapping("/articles/{id}")
		public ResponseEntity<Article> getArticleById(@PathVariable(value = "id") Long Id)
				throws ResourceNotFoundException {
			Article Article = repository.findById(Id)
					.orElseThrow(() -> new ResourceNotFoundException("article not found for this id :: " + Id));
			return ResponseEntity.ok().body(Article);
		}
	 

	
				

	@DeleteMapping("/articles/{id}")
	public Map<String, Boolean> deleteArticle(@PathVariable(value = "id") Long ArticleId)
			throws ResourceNotFoundException {
		Article Article = repository.findById(ArticleId)
				.orElseThrow(() -> new ResourceNotFoundException("Article not found  id :: " + ArticleId));
		repository.delete(Article);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  	 
	@DeleteMapping("/articles/delete")
	  public ResponseEntity<String> deleteAllarticles() {
	    System.out.println("Delete All articles...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All articles have been deleted!", HttpStatus.OK);
	}

	  @PutMapping("/articles/{id}")
	  public ResponseEntity<Article> updateArticle(@PathVariable("id") long id, @RequestBody Article Article) {
	    System.out.println("Update Article with ID = " + id + "...");
	    Optional<Article> ArticleInfo = repository.findById(id);
	    if (ArticleInfo.isPresent()) {
	    	Article article = ArticleInfo.get();
	           article.setLibelle(Article.getLibelle());
	          
	           article.setCcateg(Article.getCcateg());
	           article.setCscateg(Article.getCscateg());
	           article.setPa(Article.getPa());
	           article.setPv(Article.getPv());
	          
	           article.setStkinit(Article.getStkinit());
	           article.setStock(Article.getStock());
	      return new ResponseEntity<>(repository.save(Article), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

}
