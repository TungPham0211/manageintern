package com.example.SecurtityDemo.Repository;


import com.example.SecurtityDemo.Entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InternRepository extends JpaRepository<Intern, Long> {

    Optional<Intern> findInternByEmail(String email);


}
