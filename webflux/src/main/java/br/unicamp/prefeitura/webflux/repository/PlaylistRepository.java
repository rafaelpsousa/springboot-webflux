package br.unicamp.prefeitura.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.unicamp.prefeitura.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
