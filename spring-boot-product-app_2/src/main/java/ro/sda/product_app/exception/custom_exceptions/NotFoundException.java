package ro.sda.product_app.exception.custom_exceptions;

import ro.sda.product_app.exception.ProductAppException;

import static ro.sda.product_app.utils.AppConstants.NOT_FOUND_MESSAGE;

public class NotFoundException extends ProductAppException {
    public NotFoundException() {
        super(NOT_FOUND_MESSAGE);
    }
}
