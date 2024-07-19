package com.spring.hospitalmanagement.Controller;

import com.spring.hospitalmanagement.Model.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.spring.hospitalmanagement.Repository.PrescribesRepository;
import com.spring.hospitalmanagement.Repository.PatientRepository;
import com.spring.hospitalmanagement.Repository.DepartmentRepository;
import com.spring.hospitalmanagement.Repository.NurseRepository;
import com.spring.hospitalmanagement.Repository.RoomRepository;
import com.spring.hospitalmanagement.Repository.AffiliatedWithRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class Controller {

    private final NurseRepository nurseRepository;
    private  final DepartmentRepository departmentRepository;
    private  final AffiliatedWithRepository affiliatedWithRepository;
    private final PatientRepository patientRepository;
    private  final RoomRepository roomRepository;
    private  final PrescribesRepository prescribesRepository;

    public Controller(
            NurseRepository nurseRepository,
            DepartmentRepository departmentRepository,
            AffiliatedWithRepository affiliatedWithRepository,
            PatientRepository patientRepository,
            RoomRepository roomRepository,
            PrescribesRepository prescribesRepository
    ) {
        this.nurseRepository = nurseRepository;
        this.departmentRepository = departmentRepository;
        this.affiliatedWithRepository = affiliatedWithRepository;
        this.patientRepository = patientRepository;
        this.roomRepository = roomRepository;
        this.prescribesRepository = prescribesRepository;
    }

    @GetMapping("/nurses")
    @ResponseStatus(HttpStatus.OK)
    public List<Nurse> findAll(){
        return  nurseRepository.findAll();
    }

    @GetMapping("/departments")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Department> finAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping("/departments/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Department> findDepartmentById(@PathVariable Integer id){
        return  departmentRepository.findById(id);
    }

    //AFFILIATED CONTROLLER

    @GetMapping("/affiliateds")
    @ResponseStatus(HttpStatus.OK)
    public List<Affiliated_with> findAllAffiliated(){
        return affiliatedWithRepository.findAll();
    }
    // PATIENT CONTROLLER
    @GetMapping("/patients")
    public List<Patient> findAllPatient(){
        return patientRepository.findAll();
    }

    // ROOM CONTROLLER
    @GetMapping("/rooms")
    public List<Room> findAllRoom(){
        return  roomRepository.findAll();
    }


    // Prescribes Controller
    @GetMapping("/prescribes")
    public List<Prescribes> findAllPrescribes(){
        return prescribesRepository.findAll();
    }


}
