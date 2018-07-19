package com.kalaiworld.klabs.projectxapi.domain;

import java.io.Serializable;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User implements Serializable {
  private Long userid;
  private String fname;
  private String lname;
  private String password;
  private boolean is_Active=false;
  private String email;
}