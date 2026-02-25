package gr.aueb.cf.eduapp.core.exception;

import lombok.Getter;

@Getter
public class EntityAlreadyExistsException extends AppGenericException {
    private static final String DEFAULT_CODE ="Already Exists.";

    public EntityAlreadyExistsException(String code ,String message) {
        super(code + DEFAULT_CODE,message);
    }
}
