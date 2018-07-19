package com.kalaiworld.klabs.projectxapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="px_users")
@Data
public class UserEntity {

  @Id
  @SequenceGenerator(name = "SEQ_USER_ID",sequenceName = "SEQ_USER_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_USER_ID")
  private Long userid;
  private String fname;
  private String lname;
  private String password;
  @Column(name = "is_active")
  private boolean isActive=false;
  private String email;
}
