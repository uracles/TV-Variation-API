package com.merakool.tv_variations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TvProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tvId;

    private TvType billType;

    private double amount;

    private LocalDateTime paymentDateTime;

    private Integer walletId;
}
