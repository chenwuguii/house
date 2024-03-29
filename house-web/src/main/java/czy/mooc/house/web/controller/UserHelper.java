package czy.mooc.house.web.controller;

import czy.mooc.house.common.result.ResultMsg;
import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Objects;
import czy.mooc.house.common.model.User;

public class UserHelper {

    public static ResultMsg validate(User account) {
        if (StringUtils.isBlank(account.getEmail())) {
            return ResultMsg.errorMsg("Email 有误");
        }
        if (StringUtils.isBlank(account.getEmail())) {
            return ResultMsg.errorMsg("Email 有误");
        }
        if (StringUtils.isBlank(account.getConfirmPasswd()) || StringUtils.isBlank(account.getPasswd())
                || !account.getPasswd().equals(account.getConfirmPasswd())) {
            return ResultMsg.errorMsg("Email 有误");
        }
        if (account.getPasswd().length() < 6) {
            return ResultMsg.errorMsg("密码大于6位");
        }
        return ResultMsg.successMsg("");
    }

    public static ResultMsg validateResetPassword(String key, String password, String confirmPassword) {
        if (StringUtils.isBlank(key) || StringUtils.isBlank(password) || StringUtils.isBlank(confirmPassword)) {
            return ResultMsg.errorMsg("参数有误");
        }
        if (!Objects.equal(password, confirmPassword)) {
            return ResultMsg.errorMsg("密码必须与确认密码一致");
        }
        return ResultMsg.successMsg("");
    }

}
