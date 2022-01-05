package com.orange_yishenggong.humanbeingmodels.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Orange Meow
 */
@Component
@ServerEndpoint("/ws/{token}")
public class WebSocketServer {
    private static final Logger LOG = LoggerFactory.getLogger(WebSocketServer.class);

    /**
     * 每个客户端一个token
     */
    private String token = "";

    private static HashMap<String, Session> map = new HashMap<>();

    /**
     * 连接成功
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("token") String token) {
        map.put(token, session);
        this.token = token;
        LOG.info("SESSION OPEN: token:{}, session-id:{}, active-session-num:{}", token, session.getId(), map.size());
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose(Session session) {
        map.remove(this.token);
        LOG.info("SESSION CLOSE: token:{}, session-id:{}, active-session-num:{}", this.token, session.getId(), map.size());
    }

    /**
     * 收到消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        LOG.info("MESSAGE RECEIVED: token:{}, session-id:{}, content:{}", token, session.getId(), message);
    }

    /**
     * 连接错误
     */
    @OnError
    public void onError(Session session, Throwable error) {
        LOG.error("ERROR: token:{}, session-id:{}, error:{}", token, session.getId(), error);
    }

    /**
     * 定向发消息
     */
    public void sendInfo(String token, String message) {
        String sessionId = "-1";
        try {
            Session session = map.get(token);
            sessionId = session.getId();
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            LOG.error("SEND MESSAGE FAIL: token:{}, session-id:{}, content:{}", token, sessionId, message);
        }
        LOG.info("SEND MESSAGE SUCCEED: token:{}, session-id:{}, content:{}", token, sessionId, message);
    }
}
