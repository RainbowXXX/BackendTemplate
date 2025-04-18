package site.rainbowx.template.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SSEService {
    private static Map<String, SseEmitter> sseEmitterMap = new ConcurrentHashMap<>();

    public SseEmitter getSseEmitter(String id) {
        sseEmitterMap.putIfAbsent(id, new SseEmitter());
        return sseEmitterMap.get(id);
    }
}
