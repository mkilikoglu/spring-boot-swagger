package com.mkilikoglu.springbootswagger.controller;

import com.mkilikoglu.springbootswagger.model.Pet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.ArrayList;

@RestController
@Api(value = "Api Documentation of Pets")
@RequestMapping("/pet")
public class PetController {

    private List<Pet> petList = new ArrayList<>();
    @PostConstruct
    public void init(){

        petList.add(new Pet(1,"Cat",new Date()));
        petList.add(new Pet(2,"Dog",new Date()));
        petList.add(new Pet(3,"Foc",new Date()));

    }


    @PostMapping
    @ApiOperation(value = "save  pet",notes = "if u want to save animal, use this method ")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam("send identitiy,animal name and system date") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "list all pets",notes = "use this method when need list of all animals")
    public ResponseEntity<List<Pet>> getAll(){
        return ResponseEntity.ok(petList);
    }

}
