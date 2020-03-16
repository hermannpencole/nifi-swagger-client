package com.github.hermannpencole.nifi.swagger;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Gson TypeAdapter for Joda LocalDate type
 */
public class MapTypeAdapterFactory implements TypeAdapterFactory {
    TypeAdapter<Map> mapAdapter ;

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        mapAdapter = gson.getAdapter(Map.class);
        TypeAdapter<T> result = new Adapter();
        return result;
    }

    class Adapter<T> extends TypeAdapter<Map<String,String>> {

        @Override
        public void write(JsonWriter out, Map<String,String> map) throws IOException {
            boolean oldSerializeNulls = out.getSerializeNulls();
            out.setSerializeNulls(true);
            mapAdapter.write(out, map);
            out.setSerializeNulls(oldSerializeNulls);
        }

        @Override
        public Map<String,String> read(JsonReader in) throws IOException {
            return mapAdapter.read(in);
        }
    }

}
