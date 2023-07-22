package com.example.SecurtityDemo.Service;


import com.example.SecurtityDemo.Entity.Intern;
import com.example.SecurtityDemo.Repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class InternService {

    @Autowired
    InternRepository internRepository;

    public List<Intern> getAllIntern(){
        return internRepository.findAll();
    }

    public void addIntern(Intern intern){
        Optional<Intern> internOptional = internRepository.findInternByEmail(intern.getEmail());
        if(internOptional.isPresent()){
            throw new IllegalStateException("email is taken!");
        }
        internRepository.save(intern);
        System.out.println(intern);
    }

    public void deleteIntern(Long intern_id){
        boolean exists = internRepository.existsById(intern_id);
        if(!exists){
            throw new IllegalStateException("intern with id " + intern_id + "doesn't exists");
        }else{
            internRepository.deleteById(intern_id);
        }
    }

    public void updateIntern(Long intern_id , String name , String email , String phone_number){
        Intern intern = internRepository.findById(intern_id)
                .orElseThrow(() -> new IllegalStateException("Mentor with ID :" + intern_id + "doesn't exists"));
        if(name != null && name.length() > 0 && !Objects.equals(name , intern.getIntern_name())){
            intern.setIntern_name(name);
        }

        Optional<Intern> internOptional = internRepository.findInternByEmail(email);
        if(internOptional.isPresent()){
            throw new IllegalStateException("email is taken!");
        }else if(email != null && email.length() > 0 && !Objects.equals(email , intern.getEmail())){
            intern.setEmail(email);
        }

        if(phone_number != null && phone_number.length() > 0 && !Objects.equals(phone_number , intern.getPhone_number())){
            intern.setPhone_number(phone_number);
        }
    }

}
