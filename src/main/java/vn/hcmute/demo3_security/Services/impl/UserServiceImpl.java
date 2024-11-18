package vn.hcmute.demo3_security.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.hcmute.demo3_security.entity.Users;
import vn.hcmute.demo3_security.reponsitory.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername (String username)
            throws UsernameNotFoundException {
        Users user = userRepository.getUserByUsername (username);
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserService(user);
    }
}
