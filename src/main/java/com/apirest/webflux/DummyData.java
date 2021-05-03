/*
 * package com.apirest.webflux;
 * 
 * import java.util.UUID;
 * 
 * import org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.apirest.webflux.document.Playlist; import
 * com.apirest.webflux.repository.PlaylistRepository;
 * 
 * import reactor.core.publisher.Flux;
 * 
 * @Component public class DummyData implements CommandLineRunner {
 * 
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * 
 * DummyData(PlaylistRepository playlistRepository){ this.playlistRepository =
 * playlistRepository; }
 * 
 * 
 * @Override public void run(String... args) throws Exception {
 * playlistRepository.deleteAll() .thenMany( Flux.just("API Rest Spring Boot",
 * "Deploy de uma aplicação kava", "Java 8", "GitHub", "Spring Security",
 * "WebService RESTFULL", "Bean no spring framework") .map(nome -> new
 * Playlist(UUID.randomUUID().toString(), nome))
 * .flatMap(playlistRepository::save)) .subscribe(System.out::println);
 * 
 * } }
 */