

package com.kosign.school_management.service.user;

import com.kosign.school_management.common.response.StatusCode;
import com.kosign.school_management.common.response.CommonResult;
import com.kosign.school_management.common.response.ListResult;
import com.kosign.school_management.common.response.SingleResult;
import com.kosign.school_management.repository.user.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserJpaRepo userJpaRepo;
    @Override
    public Object findAll() {
      Object userListResult =  userJpaRepo.findAll();
        return userListResult;
    }

    public <T> ListResult<T> getListResult(List<T> list) {
        ListResult<T> result = new ListResult<>();
        result.setList(list);
        setSuccessResult(result);
        return result;
    }
    public <T> SingleResult<T> getSingleResult(T data) {
        SingleResult<T> result = new SingleResult<>();
        result.setData(data);
        setSuccessResult(result);
        return result;
    }

    public CommonResult getSuccessResult() {
        CommonResult result = new CommonResult();
        setSuccessResult(result);
        return result;
    }
    private void setSuccessResult(CommonResult result) {
        result.setSuccess(true);
        result.setCode(StatusCode.SUCCESS.getCode());
        result.setMsg(StatusCode.SUCCESS.getMsg());
    }

    public CommonResult getFailResult() {
        CommonResult result = new CommonResult();
        result.setSuccess(false);
        result.setCode(StatusCode.FAIL.getCode());
        result.setMsg(StatusCode.FAIL.getMsg());
        return result;
    }
}

