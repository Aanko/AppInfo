package cc.slogc.appmanager.web.controller.admin;

/**
 * @author Aanko on 2018/9/30.
 * @version 1.0
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(1),

    /**
     * 失败
     */
    FAIL(0);

    Integer code;

    ResultCodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
