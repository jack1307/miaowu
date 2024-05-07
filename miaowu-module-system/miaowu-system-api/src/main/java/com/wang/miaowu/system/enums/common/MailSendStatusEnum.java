package com.wang.miaowu.system.enums.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by 15988
 * @description: 邮件发送状态枚举类
 * @date 2024/05/07
 */
@Getter
@AllArgsConstructor
public enum MailSendStatusEnum {

    INIT(0), // 初始化
    SUCCESS(10), // 发送成功
    FAILURE(20), // 发送失败
    IGNORE(30), // 忽略，即不发送
    ;

    private final int status;
}
