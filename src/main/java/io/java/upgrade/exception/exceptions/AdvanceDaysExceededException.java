package io.java.upgrade.exception.exceptions;

import java.util.Date;

public class AdvanceDaysExceededException extends RuntimeException {

    private Date ArrivalDate;

    public Date getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public AdvanceDaysExceededException(Date ArrivalDate) {
        super();
        this.ArrivalDate = ArrivalDate;
    }


}