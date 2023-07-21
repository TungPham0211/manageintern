package com.example.SecurtityDemo.Controller;


import com.example.SecurtityDemo.Entity.Intern;
import com.example.SecurtityDemo.Service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/v1/intern")
public class InternController {
    @Autowired
    InternService internService;

    @GetMapping
    public List<Intern> getAllIntern(){
        return internService.getAllIntern();
    }


    @PostMapping
    public void addAnIntern(@RequestBody Intern intern){
        internService.addAnIntern(intern);
    }



    @DeleteMapping(path = "{intern_id}")
    public void deleteAnIntern(@PathVariable Long intern_id){
        internService.deleteAnIntern(intern_id);
    }

    @PutMapping(path = "{intern_id}")
    public void updateAnIntern(@PathVariable Long intern_id,
                               @RequestParam String name ,
                               @RequestParam String email ,
                               @RequestParam String phone_number){
        internService.updateIntern(intern_id , name , email , phone_number);
    }
}
