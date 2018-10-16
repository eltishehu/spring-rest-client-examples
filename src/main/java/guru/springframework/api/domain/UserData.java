package guru.springframework.api.domain;

import java.util.List;

/**
 * Created by e.sh. on 16-Oct-18
 */
public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
