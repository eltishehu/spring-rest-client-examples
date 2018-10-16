package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * Created by e.sh. on 16-Oct-18
 */
public interface ApiService {

    List<User> getUsers(Integer limit);

}
