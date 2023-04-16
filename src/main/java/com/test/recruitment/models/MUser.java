package com.test.recruitment.models;

import com.test.recruitment.constant.UserFields;
import lombok.*;

import javax.persistence.*;

@Entity(name = UserFields.tableNameUser)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MUser {
    @Id
    @Column(name = UserFields.userId)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = UserFields.username)
    private String username;
    @Column(name = UserFields.name)
    private String name;
    @Column(name = UserFields.password)
    private String password;

}
