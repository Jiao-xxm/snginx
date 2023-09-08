package com.yuhan.snginx.modle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    private Long id;


    private String name;


    private String email;


    private int age;


    private String address;

    // Getters and setters

    public String toString() {
        return String.format("id : %s,姓名 : %s", String.valueOf(this.id), name);
    }

}
