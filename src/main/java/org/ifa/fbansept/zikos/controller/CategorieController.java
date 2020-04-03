package org.ifa.fbansept.zikos.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.ifa.fbansept.zikos.dao.CategorieDao;
import org.ifa.fbansept.zikos.model.Categorie;
import org.ifa.fbansept.zikos.view.MyJsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CategorieController {

    CategorieDao categorieDao;

    @Autowired
    public CategorieController(CategorieDao categorieDao){
        this.categorieDao = categorieDao;
    }

    @GetMapping("/categories")
    @JsonView(MyJsonView.Categorie.class)
    public List<Categorie> getCategories(){
        return categorieDao.findAll();
    }

    @GetMapping("/categorie/{id}")
    public Categorie getCategorie(@PathVariable int id){
        return categorieDao.findById(id).orElse(null);
    }

    @PutMapping("/categories")
    public Categorie saveCategorie(@RequestBody Categorie categorie){
        return categorieDao.save(categorie);
    }
}
