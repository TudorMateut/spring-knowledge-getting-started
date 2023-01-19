package ro.sda.product_app.exception.custom_exceptions;

import ro.sda.product_app.exception.ProductAppException;

import static ro.sda.product_app.utils.AppConstants.ALREADY_EXISTENT_MESSAGE;

public class AlreadyExistentException extends ProductAppException {
    public AlreadyExistentException() {
        super(ALREADY_EXISTENT_MESSAGE);
    }
}
