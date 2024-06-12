package com.example.bufsroom.service;

import java.util.Optional;

import com.example.bufsroom.dto.UserCreateForm;
import com.example.bufsroom.repository.UserRepository;
import com.example.bufsroom.user.SiteUser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public Long save(UserCreateForm dto) {
		return userRepository.save(SiteUser.builder()
				.username(dto.getUsername())
				.password(bCryptPasswordEncoder.encode(dto.getPassword1()))
				.build()).getId();
	}
}
