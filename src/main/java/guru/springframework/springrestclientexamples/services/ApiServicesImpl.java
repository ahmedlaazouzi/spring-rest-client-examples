package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class ApiServicesImpl implements ApiService{
    private RestTemplate restTemplate;

    public ApiServicesImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData=restTemplate.getForObject("http://private-anon-61ead41ba9-apifaketory.apiary-mock.com/api/user?limit=&="+limit,UserData.class);
        return userData.getData();
    }
}
