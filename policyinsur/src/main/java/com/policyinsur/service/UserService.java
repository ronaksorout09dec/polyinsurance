//package com.policyinsur.service;
//
//import com.policyinsur.entity.Role;
//import com.policyinsur.entity.User;
//import com.policyinsur.repository.RoleRepository;
//import com.policyinsur.repository.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//
//    public UserService(UserRepository userRepository,
//                       RoleRepository roleRepository) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//    }
//
//    public User createUser(User user, String roleName) {
//
//        Role role = roleRepository.findByName(roleName)
//                .orElseThrow(() -> new RuntimeException("Role not found"));
//
//        user.setRoles(Set.of(role));
//
//        return userRepository.save(user);
//    }
//}
