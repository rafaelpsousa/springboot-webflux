package br.unicamp.prefeitura.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.unicamp.prefeitura.webflux.document.Playlist;
import br.unicamp.prefeitura.webflux.repository.PlaylistRepository;
import reactor.core.publisher.Flux;

/*
 * @Component public class DummyData implements CommandLineRunner {
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * public DummyData(PlaylistRepository playlistRepository) {
 * this.playlistRepository = playlistRepository; }
 * 
 * @Override public void run(String... args) throws Exception {
 * playlistRepository.deleteAll() .thenMany(Flux.just("Teste 1", "Teste2",
 * "Teste3", "Teste4", "Teste5") .map(nome -> new
 * Playlist(UUID.randomUUID().toString(),nome))
 * .flatMap(playlistRepository::save)) .subscribe(System.out::println);
 * 
 * 
 * }
 * 
 * }
 */
