package com.example.ai.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
	 	@Bean
	    public ChatClient chatClient(OllamaChatModel chatModel) {
	        return ChatClient.builder(chatModel).build();
	    }
}
