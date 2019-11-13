package com.ifi.pokemon_type_api.controller;

import com.ifi.pokemon_type_api.bo.PokemonType;
import com.ifi.pokemon_type_api.service.PokemonTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon-types")
class PokemonTypeController {

    private PokemonTypeService service;

    public PokemonTypeController(PokemonTypeService serv) {
        this.service=serv;
    }

    @GetMapping("/{id}")
    PokemonType getPokemonTypeFromId(@PathVariable int id){
        return this.service.getPokemonType(id);
    }

    @GetMapping(value="/", params = "name")
    public PokemonType getPokemonTypeFromName(@RequestParam(name="name") String name) {
            return this.service.getPokemonTypeByName(name);
    }

    @GetMapping("/")
    public List<PokemonType> getAllPokemonTypes() {
        return this.service.getAllPokemonTypes();
    }
}