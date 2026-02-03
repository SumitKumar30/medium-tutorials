package com.example.ai.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiAssistantService {
	 private final ChatClient chatClient;

	    public AiAssistantService(ChatClient chatClient) {
	        this.chatClient = chatClient;
	    }

	    public String explainTopic(String topic) {
	        return chatClient
	                .prompt()
	                .user("Explain %s in simple terms".formatted(topic))
	                .call()
	                .content();
	    }
}
