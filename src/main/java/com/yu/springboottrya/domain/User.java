package com.yu.springboottrya.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

@Repository
@Data
@ConfigurationProperties(prefix = "user")
public class User {
    /**
     * 用户id
     */
    String xCltNbr;

    /**
     * 用户姓名
     */
    String xCltNam;
}
