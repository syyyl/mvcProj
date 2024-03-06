package com.ohgiraffers.mvc.book.model.dto;

public class BookDTO {

    private int bookCode;
    private String bookName;
    private String publisher;
    private String releaseDate;
    private int amount;
    private int categoryCode;
    private String loanableYN;


    public BookDTO() {
    }

    public BookDTO(int bookCode, String bookName, String publisher, String releaseDate, int amount, int categoryCode, String loanableYN) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.amount = amount;
        this.categoryCode = categoryCode;
        this.loanableYN = loanableYN;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getLoanableYN() {
        return loanableYN;
    }

    public void setLoanableYN(String loanableYN) {
        this.loanableYN = loanableYN;
    }

    @Override
    public String toString() {
        return "bookDTO{" +
                "bookCode=" + bookCode +
                ", bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", amount=" + amount +
                ", categoryCode=" + categoryCode +
                ", loanableYN=" + loanableYN +
                '}';
    }
}
