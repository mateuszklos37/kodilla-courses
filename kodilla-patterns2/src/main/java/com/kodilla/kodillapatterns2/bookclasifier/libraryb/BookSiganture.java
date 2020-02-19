package com.kodilla.kodillapatterns2.bookclasifier.libraryb;

public class BookSiganture {
    private final String signature;

    public BookSiganture(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookSiganture that = (BookSiganture) o;

        return signature != null ? signature.equals(that.signature) : that.signature == null;
    }

    @Override
    public int hashCode() {
        return signature != null ? signature.hashCode() : 0;
    }
}
