package site.jeonhs.couponstance.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import site.jeonhs.couponstance.domain.user.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;
}
