package site.jeonhs.couponstance.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.jeonhs.couponstance.domain.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
  private final UserRepository userRepository;
}
