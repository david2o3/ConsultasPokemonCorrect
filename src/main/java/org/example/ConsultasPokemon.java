package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class ConsultasPokemon {
        public static <listaPokemon> void main(String[] args) throws IOException {
            List<String> listaPokemon = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\David\\Desktop\\La asignatura jodida\\Ejercicios\\ConsultasPokemon\\data\\pokemon.json"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    listaPokemon.add(linea);
                }
            } catch (IOException exception) {
                System.out.println("No se ha encontrado ningún archivo en esta ruta o ha ocurrido un error al leer el archivo.");
            }

            // Ahora tienes cada línea del archivo JSON en la lista listaPokemon
            for (String jsonLine : listaPokemon) {
                System.out.println(jsonLine);
            }

           /* System.out.println("Primeros 10 Pokémon:");
            listaPokemon.stream()
                    .limit(100) // Limita a los primeros 10 Pokémon
                    .map(pokemon -> ((Pokemon) pokemon).get("nombre"))
                    .forEach(System.out::println);
            System.out.println();*/

        }
    }
