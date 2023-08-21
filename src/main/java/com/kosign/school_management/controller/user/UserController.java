package com.kosign.school_management.controller.user;

import com.kosign.school_management.service.user.ResponseService;
import com.kosign.school_management.service.user.UserService;
import lombok.*;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/v1")
public class UserController {

    private final ResponseService responseService;

    private final UserService userService;

    @GetMapping("/users")
    public Object findAllUser() {
//        return responseService.getListResult(userJpaRepo.findAll());
        return userService.findAll();
    }

//    @GetMapping("/user/{msrl}")
//    public SingleResult<User> findUserById(@PathVariable long msrl) {
//        return responseService.getSingleResult(userJpaRepo.findById(msrl).orElseThrow(CUserNotFoundException::new));
//    }
//
//    @PostMapping(value = "/user")
//    public SingleResult<User> save(@RequestParam String uid, @RequestParam String name) {
//        User user = User.builder()
//                .uid(uid)
//                .name(name)
//                .build();
//        return responseService.getSingleResult(userJpaRepo.save(user));
//    }
//
//    @PutMapping("/user")
//    public SingleResult<User> modify(@RequestParam long msrl, @RequestParam String uid, @RequestParam String name) {
//        User user = User.builder()
//                .uid(uid)
//                .name(name)
//                .build();
//        return responseService.getSingleResult(userJpaRepo.save(user));
//    }
//
//    @DeleteMapping("/user/{msrl}")
//    public CommonResult delete(@PathVariable long msrl) {
//        userJpaRepo.deleteById(msrl);
//        return responseService.getSuccessResult();
//    }
}



