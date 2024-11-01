package org.example.springmvc.web;

import lombok.*;
import org.example.springmvc.entities.*;
import org.example.springmvc.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@AllArgsConstructor // injection des depondence via constructeur
public class PatientController {
//    @Autowired  (non recomander pour l'injection des depandences)
    private PatientRepository patientRepository;

    @GetMapping(path = "/index")
    public String patients(Model model ,
                           @RequestParam(name = "page",defaultValue = "0") int page ,
                           @RequestParam(name = "size",defaultValue = "5")int size,
                           @RequestParam(name = "keyword",defaultValue = "")String keyword){
        Page<Patient> pagePatients = patientRepository.findByNomContains(keyword , PageRequest.of(page,size));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return "patients" ;
    }
    @GetMapping("/delete")
    public String delete(Long id,String keyword , int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }

}
