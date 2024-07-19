package com.spring.hospitalmanagement.Controller;

import com.spring.hospitalmanagement.Model.*;
import com.spring.hospitalmanagement.Repository.*;
import com.spring.hospitalmanagement.RuntimeNotFoundException.RuntimeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    private final StayRepository stayRepository;
    private  final  Trained_InRepository trainedInRepository;

    public Controller(
            NurseRepository nurseRepository,
            DepartmentRepository departmentRepository,
            AffiliatedWithRepository affiliatedWithRepository,
            PatientRepository patientRepository,
            RoomRepository roomRepository,
            PrescribesRepository prescribesRepository,
            StayRepository stayRepository,
            Trained_InRepository trainedInRepository
    ) {
        this.nurseRepository = nurseRepository;
        this.departmentRepository = departmentRepository;
        this.affiliatedWithRepository = affiliatedWithRepository;
        this.patientRepository = patientRepository;
        this.roomRepository = roomRepository;
        this.prescribesRepository = prescribesRepository;
        this.stayRepository = stayRepository;
        this.trainedInRepository = trainedInRepository;
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

    @GetMapping("/rooms/{room_number}")
    public Optional<Room> findRoom(@PathVariable Integer room_number){

        if( roomRepository.findById(room_number).isEmpty()){
            throw  new RuntimeNotFoundException("Room Not found");
        }

        return  roomRepository.findById(room_number);
    }


    // Prescribes Controller
    @GetMapping("/prescribes")
    public List<Prescribes> findAllPrescribes(){
        return prescribesRepository.findAll();
    }



    //Stay CONTOLLER
    @GetMapping("/stays")
    public List<Stay> findAllStay(){
        return  stayRepository.findAll();
    }

    //TRAINED IN CONTROLLER
    @GetMapping("/traineds_in")
    public List<Trained_In> findAllTrained(){
        return trainedInRepository.findAll();
    }

}
