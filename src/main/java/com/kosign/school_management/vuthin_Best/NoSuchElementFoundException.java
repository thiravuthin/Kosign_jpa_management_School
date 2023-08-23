package com.kosign.school_management.vuthin_Best;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoSuchElementFoundException extends ResponseStatusException {
    public NoSuchElementFoundException(HttpStatusCode status) {
        super(status);
    }

    public NoSuchElementFoundException(HttpStatusCode status, String reason) {
        super(status, reason);
    }

    public NoSuchElementFoundException(int rawStatusCode, String reason, Throwable cause) {
        super(rawStatusCode, reason, cause);
    }

    public NoSuchElementFoundException(HttpStatusCode status, String reason, Throwable cause) {
        super(status, reason, cause);
    }

    protected NoSuchElementFoundException(HttpStatusCode status, String reason, Throwable cause, String messageDetailCode, Object[] messageDetailArguments) {
        super(status, reason, cause, messageDetailCode, messageDetailArguments);
    }

    /**
     * Return a code to use to resolve the problem "title" for this exception
     * through a {@link MessageSource}.
     * <p>By default this is initialized via {@link #getDefaultTitleMessageCode(Class)}.
     */
    @Override
    public String getTitleMessageCode() {
        return super.getTitleMessageCode();
    }
}
