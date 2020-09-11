package com.gadstop.gadsleaderboard.api;

public interface ApiResponseCallback<T> {
    void onResponse(T response);
    void onError(Throwable error);
}
