package com.moshang.modules.api.controller;



import com.moshang.modules.api.annotation.AuthIgnore;
import com.moshang.modules.api.annotation.LoginUser;
import com.moshang.modules.api.entity.TokenEntity;
import com.moshang.modules.api.entity.UserEntity;
import com.moshang.utils.R;
import org.springframework.web.bind.annotation.*;

/**
 * API测试接口
 *
 * @author moshang
 * @date 2017年08月02日
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 忽略Token验证测试
     */
    @AuthIgnore
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

    /**
     * 接收JSON数据
     */
    @PostMapping("jsonData")
    public R jsonData(@LoginUser UserEntity user, @RequestBody TokenEntity token){
        return R.ok().put("user", user).put("token", token);
    }
}
