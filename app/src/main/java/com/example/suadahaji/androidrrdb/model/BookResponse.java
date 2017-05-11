package com.example.suadahaji.androidrrdb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by suadahaji
 */

public class BookResponse {
    @SerializedName("body")
    private ArrayList<Book> books;

    public BookResponse(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
