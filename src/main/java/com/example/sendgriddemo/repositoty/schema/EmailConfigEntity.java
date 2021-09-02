package com.example.sendgriddemo.repositoty.schema;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "EMAIL_CONFIG")
public class EmailConfigEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Type(type = "uuid-char")
  private UUID id;

  @Column(unique = true)
  private String emailCode;

  @Lob
  private String htmlBody;

  private String template;
}
