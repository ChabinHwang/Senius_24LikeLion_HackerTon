package xyz.senius99.senius.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private String name;
    private int age;
    private String phone;
    private String id;
    private String profile;

}
