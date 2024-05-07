package com.wang.miaowu.system.enums.logger;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by 15988
 * @description:
 * @date 2024/05/07
 */
@Getter
@AllArgsConstructor
public enum LoginResultEnum {

    SUCCESS(0, "登录成功"), // 成功
    BAD_CREDENTIALS(10, "账号或密码不正确"), // 账号或密码不正确
    USER_DISABLED(20, "用户被禁用"), // 用户被禁用
    CAPTCHA_NOT_FOUND(30, "图片验证码不存在"), // 图片验证码不存在
    CAPTCHA_CODE_ERROR(31, "图片验证码不正确"), // 图片验证码不正确
    SYSTEM_ERROR(40, "系统异常"),
    ;

    /**
     * 结果
     */
    private final Integer result;

    private final String msg;
}
