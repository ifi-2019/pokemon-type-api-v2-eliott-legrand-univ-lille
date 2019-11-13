package com.ifi.pokemon_type_api.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifi.pokemon_type_api.bo.PokemonType;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class PokemonTypeRepositoryImpl implements PokemonTypeRepository {

    private List<PokemonType> pokemons;

    public PokemonTypeRepositoryImpl() {
        try {
            var pokemonsStream = this.getClass().getResourceAsStream("/pokemons.json");

            var objectMapper = new ObjectMapper();
            var pokemonsArray = objectMapper.readValue(pokemonsStream, PokemonType[].class);
            this.pokemons = Arrays.asList(pokemonsArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PokemonType findPokemonTypeById(int id) {
        System.out.println("Loading Pokemon information for Pokemon id " + id);

        // TODO
        for(PokemonType poke: pokemons){
            if(poke.getId() == id){
                return poke;
            }
        }
        return new PokemonType();
    }

    @Override
    public PokemonType findPokemonTypeByName(String name) {
        System.out.println("Loading Pokemon information for Pokemon name " + name);

        // TODO
        for(PokemonType poke: pokemons){
            if(poke.getName().equals(name)){
                return poke;
            }
        }
        return new PokemonType();
    }

    @Override
    public List<PokemonType> findAllPokemonType() {
        // TODO
        return pokemons;
    }

}
