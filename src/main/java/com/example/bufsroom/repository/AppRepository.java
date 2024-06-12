package com.example.bufsroom.repository;
import com.example.bufsroom.user.AppForm;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public interface AppRepository extends JpaRepository<AppForm, Long> {

}