package com.example.bufsroom.service;


import com.example.bufsroom.dto.AppCreateForm;
import com.example.bufsroom.repository.AppRepository;
import com.example.bufsroom.user.AppForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Date;


@RequiredArgsConstructor
@Service
public class AppService {

    private final AppRepository appRepository;

    public AppForm createApp(AppCreateForm request) {
        return appRepository.save(request.toEntity());
    }
}