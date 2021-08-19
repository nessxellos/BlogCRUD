package com.com.blogCRUD.model;

/*{
        "id": 2,
        "username": "cos",
        "password": "1234",
        "email": "cos@nate.com",
        "created": "2021-26-11T09:26:05",
        "updated": "2021-26-11T09:26:05"
},*/

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
