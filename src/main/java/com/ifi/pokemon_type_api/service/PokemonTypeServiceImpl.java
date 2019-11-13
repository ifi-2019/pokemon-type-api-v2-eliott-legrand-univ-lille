package com.ifi.pokemon_type_api.service;

import com.ifi.pokemon_type_api.bo.PokemonType;
import com.ifi.pokemon_type_api.repository.PokemonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {

    protected PokemonTypeRepository pokemonTypeRepository;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokeRepoImp){
        // TODO
        this.pokemonTypeRepository = pokeRepoImp;
    }

    @Override
    public PokemonType getPokemonType(int id) {
        // TODO
        return this.pokemonTypeRepository.findPokemonTypeById(id);
    }

    @Override
    public PokemonType getPokemonTypeByName(String name){
        return this.pokemonTypeRepository.findPokemonTypeByName(name);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        // TODO
        return pokemonTypeRepository.findAllPokemonType();
    }
}
