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
public enum NoticeTypeEnum {

    NOTICE(1),
    ANNOUNCEMENT(2);

    /**
     * 类型
     */
    private final Integer type;
}
