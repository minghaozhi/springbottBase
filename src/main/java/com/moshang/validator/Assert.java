package com.moshang.validator;

import com.moshang.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author moshang
 * @date 2017年08月02日
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
