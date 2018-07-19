package com.kalaiworld.klabs.projectxapi.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Posts")
public class PostEntity {
  @Id
  @SequenceGenerator(name = "SEQ_POST_ID",sequenceName = "SEQ_POST_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_POST_ID")
  private Long id;
  private String title;
  private String description;
  private BigDecimal price;
  private Date createdAt;
}
