package com.booknetwork.book_net.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Token {
    @Id
    @GeneratedValue
    private  Integer id;
    private  String token;
    private  LocalDateTime createdAt;
    private  LocalDateTime expiresAt;
    private  LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private  User user;
}
