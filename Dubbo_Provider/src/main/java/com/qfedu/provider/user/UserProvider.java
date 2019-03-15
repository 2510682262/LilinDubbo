package com.qfedu.provider.user;

import com.qfedu.entity.user.User;
import com.qfedu.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProvider implements UserService {

    @Override
    public User selectId(int id) {
            User user = new User ();
            user.setId (id);

        return user;

    }
}
