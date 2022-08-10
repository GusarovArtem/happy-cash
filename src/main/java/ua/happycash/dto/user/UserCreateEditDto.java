package ua.happycash.dto.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateEditDto {

    @NotBlank(message = "Enter your username")
    String name;

    @NotBlank(message = "Enter your email")
    String email;

    @NotBlank(message = "Enter your password")
    String password;

    @NotBlank(message = "Enter your phone number")
    String phoneNumber;

    String role;
}
