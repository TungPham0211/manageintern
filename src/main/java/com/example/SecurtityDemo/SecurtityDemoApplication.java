package com.example.SecurtityDemo;

import com.example.SecurtityDemo.Entity.Intern;
import com.example.SecurtityDemo.Entity.Mentor;
import com.example.SecurtityDemo.Repository.InternRepository;
import com.example.SecurtityDemo.Repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecurtityDemoApplication implements CommandLineRunner {

	@Autowired
	InternRepository internRepository;
	@Autowired
	MentorRepository mentorRepository;
	public static void main(String[] args) {
		SpringApplication.run(SecurtityDemoApplication.class, args);
	}

	List<Intern> internManaged = new ArrayList<>();

	@Override
	public void run(String... args) throws Exception {
		Mentor LuongHuy = new Mentor(
				1,
				"Luong Huy",
				22,
				"Coding",
				"LuongHuy@gmail.com", "0123"
		);
		Mentor KieuDung = new Mentor(
				2,
				"Kieu Dung",
				25,
				"System Design", "KieuDung@gmail.com", "0132"
		);

		mentorRepository.saveAll(List.of(LuongHuy, KieuDung));
		Intern intern = new Intern(
				1,
				"PhamSonTung",
				22,
				"PTIT",
				"Coding",
				"hokagedetu@gmail.com",
				"0985176796",
				LuongHuy
		);
		Intern intern1 = new Intern(
				2,
				"Fita",
				22,
				"PTIT",
				"System Design",
				"CeoDeTam@gmail.com",
				"08484582147",
				KieuDung
		);
		internRepository.saveAll(List.of(intern, intern1));
		Mentor MinhHung = new Mentor(3,
				"Minh Hung",
				22,
				"FrontEnd", "HungVT7@gmail.com", "0231"
		);
		Intern intern2 = new Intern(
				3,
				"Far Away",
				22,
				"PTIT",
				"FrontEnd",
				"uchihaitachi@gmail.com",
				"0579645810",
				MinhHung
		);

		Intern intern3 = new Intern(
				4,
				"FarJAway",
				23,
				"PTIT",
				"FrontEnd",
				"Helloworld@gmail.com",
				"07944581236",
				MinhHung
		);
		mentorRepository.save(MinhHung);
		internRepository.saveAll(List.of(intern2, intern3));

	}
}
