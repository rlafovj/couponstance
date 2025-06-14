package site.jeonhs.couponstance.domain.user.domain;

import jakarta.persistence.*;

@Entity(name = "USERS")
public class UserModel {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String email;

  private String password;

  private String nickname;
}
