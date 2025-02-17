package com.andresvg.simple_chatgpt.restcontroller;

import com.andresvg.simple_chatgpt.dto.PromptRequest;
import com.andresvg.simple_chatgpt.service.ChatGPTService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/chat")
public class ChatGPTRestController
{
    private final ChatGPTService chatGPTService;

    public ChatGPTRestController(ChatGPTService chatGPTService)
    {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping(value = "")
    public String chat(@RequestBody PromptRequest promptRequest)
    {
        return chatGPTService.getChatResponse(promptRequest);
    }
}
