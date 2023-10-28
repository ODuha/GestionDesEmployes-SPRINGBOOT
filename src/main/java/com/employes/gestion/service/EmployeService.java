package com.employes.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employes.gestion.repository.EmployeRepository;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    @Autowired
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }
	  

	  /*

	    public Employe saveEmploye(Employe employe) {
	        return employeRepository.save(employe);
	    }

	    public List<Employe> saveProducts(List<Employe> employe) {
	        return employeRepository.saveAll(employe);
	    }

	    public List<Employe> getEmployes() {
	        return employeRepository.findAll();
	    }

	    public Employe getEmployeById(int id) {
	        return employeRepository.findById(id).orElse(null);
	    }

	    public Employe getEmployeByName(String name) {
	        return employeRepository.findByName(name);
	    }

	    public String deleteEmploye(int id) {
	    	employeRepository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public Employe updateEmploye(Employe employe) {
	        Employe existingEmploye = employeRepository.findById(employe.getId()).orElse(null);
	        existingEmploye.setFullName(employe.getFullName());
	        existingEmploye.setEmail(employe.getEmail());
	        existingEmploye.setGender(employe.getGender());
	        existingEmploye.setJob(employe.getJob());
	        existingEmploye.setPhone(employe.getPhone());
	      
	        return employeRepository.save(existingEmploye);
	    }*/

	}


