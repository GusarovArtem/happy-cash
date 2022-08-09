package ua.happycash.database.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {

    @Id
    String id;

    String name;

    LocalDateTime dateTime;

    Long amount;

    boolean isSuccessful;
}