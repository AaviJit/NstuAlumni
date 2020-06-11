package com.avijit.alumni.common.exception;

/**
 * @author Avijit Barua
 * @created_on 1/28/19 at 2:47 PM
 * @project sweethrmrest
 */
public class EntityExistException extends Exception {

    private String message;
    private String page;

    public EntityExistException(String message) {
        super(message);
        this.message = message;
    }

    public EntityExistException(String message,String page) {
        super(message);
        this.message = message;
        this.page = page;
    }
    public EntityExistException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
