package com.hand.hand.service;
import java.util.List;
import java.util.Map;

public interface ContactPersonService {

    List<Map<String, Object>> findContactPersonList(String name);

}
