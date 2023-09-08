package com.yuhan.snginx.modle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author yuzhuJiao
 * @since 2023/08/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("java_language")
public class Java implements Serializable {

    @Id
    private String id;

    private int diff;
    private String name;

    private String brand;
}
