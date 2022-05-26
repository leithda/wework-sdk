package cn.leithda.wework.sdk.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class JsonUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static <T> String toJson(T entity) {
       if(Objects.isNull(entity)){
           return "";
       }
        try {
            return MAPPER.writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public static <T> T toObject(String json, Class<T> clazz){
        if(StringUtils.isEmpty(json)){
            return null;
        }

        try {
            return MAPPER.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public static <T> List<T> toList(String json, Class<T> clazz){
        if(StringUtils.isEmpty(json)){
            return Collections.emptyList();
        }
        CollectionType collectionType = MAPPER.getTypeFactory().constructCollectionType(List.class, clazz);
        try {
            return MAPPER.readValue(json, collectionType);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
