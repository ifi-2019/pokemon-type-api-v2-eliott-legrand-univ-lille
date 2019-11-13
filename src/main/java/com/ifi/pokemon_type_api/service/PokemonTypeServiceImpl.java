package com.ifi.pokemon_type_api.service;

import com.ifi.pokemon_type_api.bo.PokemonType;
import com.ifi.pokemon_type_api.repository.PokemonTypeRepository;

import java.util.List;

public class PokemonTypeServiceImpl implements PokemonTypeService {

    private PokemonTypeRepository pokeRepo;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokeRepoImp){
        // TODO
        this.pokeRepo = pokeRepoImp;
    }

    @Override
    public PokemonType getPokemonType(int id) {
        // TODO
        return this.pokeRepo.findPokemonTypeById(id);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        // TODO
        return pokeRepo.findAllPokemonType();
    }
}
