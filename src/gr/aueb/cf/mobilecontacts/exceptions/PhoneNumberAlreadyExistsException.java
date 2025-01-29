package gr.aueb.cf.mobilecontacts.exceptions;

public class PhoneNumberAlreadyExistsException extends  Exception{

    public PhoneNumberAlreadyExistsException(String massage){
        super(massage);
    }
}
