package com.chatbot.controller;

import com.chatbot.model.ArticleBasedAssistant;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ChatBotController {
    private final ArticleBasedAssistant assistant;

    @Autowired
    public ChatBotController(ArticleBasedAssistant assistant) {
        this.assistant = assistant;
    }

    @PostMapping("/chatbot")
    public String answer(@RequestBody Map<String, String> questionMap) {
        return assistant.answer(questionMap.getOrDefault("question", ""));
    }
}
