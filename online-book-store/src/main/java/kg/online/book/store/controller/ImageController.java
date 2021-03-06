package kg.online.book.store.controller;

import kg.online.book.store.entity.Image;
import kg.online.book.store.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/api/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping
    public Image create(@RequestParam(name = "file")MultipartFile multipartFile){  //больше одного RequestParam нельзя, когда MultipartFile
        return imageService.create(multipartFile);
    }

    @PostMapping("/destroy/{name}") //localhost:8080/image/destroy/{name}
    public Boolean deleteByName(@PathVariable String name){
        return imageService.deleteByName(name);
    }

    @GetMapping
    public List<Image> getAll(){
        return imageService.getAll();
    }

    @GetMapping("/{id}")
    public Image getById(@PathVariable Long id){
        return imageService.getById(id);
    }

}
