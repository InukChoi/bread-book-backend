package com.example.breadbook.domain.member.repository;

import com.example.breadbook.domain.member.model.PasswordReset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PasswordResetRepository extends JpaRepository<PasswordReset, Long> {
    Optional<PasswordReset> findByUuidAndExpiryDateAfter(String uuid, LocalDateTime expiryDateAfter);
}
