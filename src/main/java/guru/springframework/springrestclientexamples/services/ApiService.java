package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by e.sh. on 16-Oct-18
 */
public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);

}
