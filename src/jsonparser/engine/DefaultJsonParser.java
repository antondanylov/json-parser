package jsonparser.engine;

import jsonparser.model.Json;

public class DefaultJsonParser implements JsonParser {


  public DefaultJsonParser() {

  }

  @Override
  public Json parse(String str) {
    return null;
  }

  @Override
  public Json parse(char[] str) {
    return parse(new String(str));
  }
}
