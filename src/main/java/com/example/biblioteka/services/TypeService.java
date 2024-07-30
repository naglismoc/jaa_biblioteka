package com.example.biblioteka.services;

import com.example.biblioteka.repositories.TypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TypeService {
    private final TypeRepository typeRepository;


}
