import java.util.*;

class Codec {
    Map<String, String> map = new HashMap<>();
    int id = 0;

    public String encode(String longUrl) {
        String key = String.valueOf(id++);
        map.put(key, longUrl);
        return "http://tinyurl.com/" + key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl.substring(shortUrl.lastIndexOf("/") + 1));
    }
}


