package com.booknetwork.book_net.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
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
