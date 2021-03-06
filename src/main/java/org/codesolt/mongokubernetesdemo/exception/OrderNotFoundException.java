package org.codesolt.mongokubernetesdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public OrderNotFoundException(@Nullable String s) {
        super(s);
    }

    public OrderNotFoundException(@Nullable String s, @Nullable Throwable throwable) {
        super(s, throwable);
    }
}
