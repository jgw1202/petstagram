package com.petstagram.common.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommentErrorCode implements ErrorCode {

    NOT_FOUND(HttpStatus.NOT_FOUND,"게시물을 찾을 수 없습니다")
    ;


    private final HttpStatus httpStatus;
    private final String message;
    }
