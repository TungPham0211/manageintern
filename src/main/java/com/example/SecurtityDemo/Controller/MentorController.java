package com.example.SecurtityDemo.Controller;


import com.example.SecurtityDemo.Entity.Mentor;
import com.example.SecurtityDemo.Service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="api/v2/mentor")
public class MentorController {
    @Autowired
    MentorService mentorService;

    @GetMapping
    public List<Mentor> getAllMentor(){
        return mentorService.getAllMentor();
    }

    @GetMapping(path ="{mentor_id}")
    public Optional<Mentor> getMentorByID(@PathVariable Long mentor_id){
        return mentorService.getMentorbyID(mentor_id);
    }
    @PostMapping
    public void addAnMentor(@RequestBody Mentor mentor){
        mentorService.addMentor(mentor);
    }

    @DeleteMapping(path ="{mentorID}")
    public void deleteAnMentor(@PathVariable Long mentorID){
        mentorService.deleteMentor(mentorID);
    }

    @PutMapping(path ="{mentorID}")
    public void updateMentor(@PathVariable Long mentor_id ,
                               @RequestParam String name ,
                               @RequestParam String email ,
                               @RequestParam String phone_number){
        mentorService.updateMentor(mentor_id , name , email , phone_number);
    }
}
