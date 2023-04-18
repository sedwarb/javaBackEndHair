package com.hairdressing.controller;

import com.hairdressing.model.Entries;
import com.hairdressing.model.Users;
import com.hairdressing.model.Workers;
import com.hairdressing.service.EntriesService;
import com.hairdressing.service.UsersService;
import com.hairdressing.service.WorkersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    UsersService usersService;

    @Autowired
    EntriesService entriesService;

    @Autowired
    WorkersService workersService;

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola Mundo";
    }

    //users
    @GetMapping("/all")
    public ArrayList<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/find/{id}")
    public Optional<Users> getUserById(@PathVariable("id") long id) {
        return usersService.getUserById(id);
    }

    @PostMapping("/save")
    public Users saveUser(@RequestBody Users user) {
        return usersService.saveUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") long id) {
        if(usersService.deleteUserById(id)){
            return "Se ha Eliminado el Ususario";
        }
        else{
            return "No se ha eliminado el Usuario";
        }
    }

    //entries
    @GetMapping("/entries/all")
    public ArrayList<Entries> getAllEntries() {return  entriesService.getAllEntries();}

    @GetMapping("/entries/{id}")
    public Optional<Entries> getEntryById(@PathVariable("id") long id) {return entriesService.getEntriesById(id);}

    @PostMapping("/entries/save")
    public Entries saveEntries(@RequestBody Entries entries) {
        return entriesService.saveEntries(entries);
    }

    @DeleteMapping("/entries/delete/{id}")
    public String deleteEntriesById(@PathVariable("id") long id) {
        if(entriesService.deleteEntriesById(id)){
            return "Se ha Eliminado la Entrada";
        }else{
            return "No se ha eliminado la Entrada";
        }
    }

    //Workers
    @GetMapping("/workers/all")
    public ArrayList<Workers> getAllWorkers() {return workersService.getAllWorkers();}

    @GetMapping("/workers/{id}")
    public Optional<Workers> getWorkersById(@PathVariable("id") long id) {return workersService.getWorkersById(id);}

    @PostMapping("/workers/save")
    public Workers saveWorkers(@RequestBody Workers workers){return workersService.saveWorkers(workers);}

    @DeleteMapping("/workers/delete/{id}")
    private String deleteWorkersById(@PathVariable("id") long id) {
        if(workersService.deleteWorkersById(id)){
            return "Se ha Eliminado el Worker";
        }else {
            return "No se ha eliminado el Worker";
        }
    }

}
