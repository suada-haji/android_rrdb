package com.example.suadahaji.androidrrdb.api;

import com.example.suadahaji.androidrrdb.model.BookResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * This interface provides endpoints using retrofit annotations
 */

public interface ApiManager {
    @GET("books/lists/best-sellers/history.json")
    Observable<BookResponse> getBooks();
}
