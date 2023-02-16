package guru.springframework.api.domain;

import org.springframework.web.client.RestTemplate;

import java.util.List;

public class UserData {
    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
