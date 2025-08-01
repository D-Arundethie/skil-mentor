package com.skillmentor.root.controller;

import com.skillmentor.root.dto.SessionDTO;
import com.skillmentor.root.dto.SessionLiteDTO;
import com.skillmentor.root.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;
    @PostMapping()
    public ResponseEntity<SessionLiteDTO> createSession(@RequestBody SessionLiteDTO sessionDTO){
        final SessionLiteDTO savedDTO = sessionService.createSession(sessionDTO);
        return new ResponseEntity<>(savedDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<SessionDTO>> getAllSessions(){
        final List<SessionDTO> sessionDTOS = sessionService.getAllSessions();
        return new ResponseEntity<>(sessionDTOS, HttpStatus.OK);
    }
}