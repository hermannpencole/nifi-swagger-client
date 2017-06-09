package com.github.hermannpencole.nifi.swagger;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by SFRJ2737 on 2017-06-09.
 */
public class XML {

    /**
     * Serialize the given Java object into XML string.
     *
     * @param obj Object
     * @return String representation of the XML
     */
    public String serialize(Object obj) {
        return null;
    }

    /**
     * Deserialize the given XML string to Java object.
     *
     * @param <T> Type
     * @param body The XML string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) throws ApiException {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return (T) xmlMapper.readValue(body, (Class) returnType);
        } catch (IOException e) {
            return readError(body, returnType);
        }
    }

    private  <T> T readError(String error, Type returnType) throws ApiException {
        try {
            // Fallback processing when failed to parse XML form response body:
            //   return the response body string directly for the String return type;
            //   parse response body into date or datetime for the Date return type.
            if (returnType.equals(String.class))
                return (T) error;
            XmlMapper xmlMapper = new XmlMapper();
            ErrorResponse value = xmlMapper.readValue(error, ErrorResponse.class);
            throw new ApiException(Integer.valueOf(value.getStatus()), value.getStatusText());
        } catch (NumberFormatException | IOException ea) {
           throw new ApiException(error);
        }
    }
}
