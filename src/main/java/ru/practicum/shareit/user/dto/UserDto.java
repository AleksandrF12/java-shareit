package ru.practicum.shareit.user.dto;

import lombok.*;

import ru.practicum.shareit.Create;
import ru.practicum.shareit.Update;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @Null
    Long id;
    @NotBlank(groups = {Create.class})
    @Size(groups = {Create.class, Update.class}, min = 1)
    private String name;
    @Email(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",
            groups = {Create.class, Update.class})
    @NotBlank(groups = {Create.class})
    @Size(groups = {Create.class, Update.class}, min = 1)
    private String email;
}
