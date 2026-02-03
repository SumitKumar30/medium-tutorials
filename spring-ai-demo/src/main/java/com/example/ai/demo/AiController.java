package com.example.ai.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {
	private final AiAssistantService aiService;

    public AiController(AiAssistantService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/explain")
    public String explain(@RequestParam String topic) {
        return aiService.explainTopic(topic);
    }
}
