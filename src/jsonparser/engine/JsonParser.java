package jsonparser.engine;

import jsonparser.model.Json;

public interface JsonParser {

  Json parse(String str);

  Json parse(char[] str);

}
