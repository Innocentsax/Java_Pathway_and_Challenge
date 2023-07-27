package com.facebook.clone.weeksixtask.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String fullname;
    private String sex;
    private String dob;
    private String email;
}
