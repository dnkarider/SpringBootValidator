package com.example.Example;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements HandlerMethodArgumentResolver {
    private final String USER = "test";
    private final String PASSWORD = "1234";

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> roots = new ArrayList<>();
        if (user.equals(USER) && password.equals(PASSWORD)) {
            roots.add(Authorities.DELETE);
            roots.add(Authorities.READ);
            roots.add(Authorities.WRITE);
        }
        return roots;
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return null;
    }
}
