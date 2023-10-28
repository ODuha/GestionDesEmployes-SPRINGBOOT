package com.employes.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employes.gestion.entity.Employe;
import com.employes.gestion.repository.EmployeRepository;
import com.employes.gestion.service.EmployeService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employees")
public class EmployeController {

    private final EmployeRepository employeRepository;

    @Autowired
    public EmployeController(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @GetMapping
    public List<Employe> getAllEmployees() {
        return employeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employe getEmployeeById(@PathVariable int id) {
        return employeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Employe createEmployee(@RequestBody Employe employe) {
        return employeRepository.save(employe);
    }

    @PutMapping("/{id}")
    public Employe updateEmployee(@PathVariable int id, @RequestBody Employe updatedEmploye) {
        return employeRepository.findById(id)
                .map(employe -> {
                    employe.setFullName(updatedEmploye.getFullName());
                    employe.setEmail(updatedEmploye.getEmail());
                    employe.setGender(updatedEmploye.getGender());
                    employe.setJob(updatedEmploye.getJob());
                    employe.setPhone(updatedEmploye.getPhone());
                    return employeRepository.save(employe);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeRepository.deleteById(id);
    }
   /* private final EmployeService employeService;

    @Autowired
    public EmployeControllers(EmployeService employeService) {
        this.employeService = employeService;
    }
    
    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @PostMapping("/addEmployes")
    public List<Employe> addEmployes(@RequestBody List<Employe> employes) {
        return employeService.saveProducts(employes);
    }

    @GetMapping("/employes")
    public List<Employe> findAllProducts() {
        return employeService.getEmployes();
    }

    @GetMapping("/employeById/{id}")
    public Employe findEmployeById(@PathVariable int id) {
        return employeService.getEmployeById(id);
    }

    @GetMapping("/employe/{name}")
    public Employe findProductByName(@PathVariable String name) {
        return employeService.getEmployeByName(name);
    }

    @PutMapping("/update")
    public Employe updateProduct(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmploye(@PathVariable int id) {
        return employeService.deleteEmploye(id);
    }*/
}
