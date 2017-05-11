package com.example.suadahaji.androidrrdb.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by suadahaji
 */

public class Book implements Parcelable {
    @SerializedName("title")
    private String bookTitle;

    @SerializedName("description")
    private String bookDescription;

    @SerializedName("author")
    private String bookAuthor;

    @SerializedName("publisher")
    private String bookPublisher;

    public Book(String bookTitle, String bookDescription, String bookAuthor, String bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
    }

    /**
     * De-parcel the object(initialise the class attributes) in the constructor
     */

    protected Book(Parcel in) {
        bookTitle = in.readString();
        bookDescription = in.readString();
        bookAuthor = in.readString();
        bookPublisher = in.readString();
    }

    /**
     * Read the parcel data
     */

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Write all the class attributes
     */

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bookTitle);
        dest.writeString(bookDescription);
        dest.writeString(bookAuthor);
        dest.writeString(bookPublisher);
    }
}
