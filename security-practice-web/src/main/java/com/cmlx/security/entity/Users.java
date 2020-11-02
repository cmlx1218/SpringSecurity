package com.cmlx.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: CMLX
 * @Description:
 * @Date: create in 2020/11/2 10:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private Long id;
    private String username;
    private String password;

}
