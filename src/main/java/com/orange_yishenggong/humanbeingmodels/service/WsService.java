package com.orange_yishenggong.humanbeingmodels.service;

import com.orange_yishenggong.humanbeingmodels.websocket.WebSocketServer;
import org.slf4j.MDC;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Orange Meow
 */
@Service
public class WsService {

    @Resource
    public WebSocketServer webSocketServer;

    public void sendInfo(String token, String message, String logId) {
        MDC.put("LOG_ID", logId);
        webSocketServer.sendInfo(token,message);
    }
}
