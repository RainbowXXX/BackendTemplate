package site.rainbowx.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Controller
@RequestMapping("/test")
public class SSEController {
    @GetMapping("/sse")
    @ResponseBody
    public SseEmitter stream() {
        // 创建一个SseEmitter对象，设置超时时间
        SseEmitter emitter = new SseEmitter();
        try {
            // 每隔1秒钟推送一次数据
            for (int i = 0; i < 10; i++) {
                emitter.send(SseEmitter.event().name("message").data("Message #" + i));
                Thread.sleep(1000); // 模拟延时
            }
            emitter.complete(); // 完成推送
        } catch (Exception e) {
            emitter.completeWithError(e); // 如果发生异常，结束连接
        }
        return emitter;
    }
}
