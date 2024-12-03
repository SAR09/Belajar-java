package programmer.muda.reflection.validation;

import programmer.muda.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {
        // get clas
        Class<?> aClass = object.getClass();

        // get all fields
        Field[] declaredFields = aClass.getDeclaredFields();

        // iterate each field
        for (Field field : declaredFields){

            // get not blank annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);
            // check if @NotBlank is exist
            if (notBlank != null){
                //get field value
                field.setAccessible(true);
                String value  = (String) field.get(object);

                if (notBlank.allowEmptyString()){
                    // allow empty string
                    // ignore
                }else {
                    // not allow empty string
                    value = value.trim();

                }

                // check if value is empty string
                if ("".equals(value)){
                    throw new  RuntimeException(field.getName() + " must not blank");
                }
            }
        }
    }
}
