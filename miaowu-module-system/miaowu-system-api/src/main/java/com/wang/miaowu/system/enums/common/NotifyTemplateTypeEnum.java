package com.wang.miaowu.system.enums.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by 15988
 * @description:
 * @date 2024/05/07
 */
@Getter
@AllArgsConstructor
public enum NotifyTemplateTypeEnum {

    /**
     * 系统消息
     */
    SYSTEM_MESSAGE(2),
    /**
     * 通知消息
     */
    NOTIFICATION_MESSAGE(1);

    private final Integer type;
}
