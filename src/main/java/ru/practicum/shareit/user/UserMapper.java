package ru.practicum.shareit.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.model.User;

@Component
@Getter
@Setter
public class UserMapper {

    public UserDto toUserDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

    public User toUser(UserDto userDto) {
        return new User()
                .toBuilder().id(userDto.getId())
                .name(userDto.getName())
                .email(userDto.getEmail()).build();
    }
}
