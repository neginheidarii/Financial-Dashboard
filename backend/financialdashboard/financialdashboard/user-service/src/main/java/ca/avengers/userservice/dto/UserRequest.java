package ca.avengers.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;
    private AddressRequest residentialAddress;
    private AddressRequest mailingAddress;
}
